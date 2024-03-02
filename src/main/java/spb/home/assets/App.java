package spb.home.assets;

import spb.home.productionProcess.FirstDistillation;
import spb.home.productionProcess.NullDistillation;
import spb.home.productionProcess.SecondDistillation;
import spb.home.productionProcess.ThirdDistillation;

public class App {
    public static void main(String[] args) {
        Factory factoryArmavir = new Factory(
                "KrasnodarRegion",
                "AMPZ",
                18000,
                10000);
        Factory factoryBarnaul = new Factory(
                "AltaiRegion",
                "BLMEZ",
                50000,
                20000);
        Factory factoryBijsk = new Factory(
                "AltaiRegion",
                "BKMEZ",
                47000,
                25000);
        Factory factoryVernyajaHava = new Factory(
                "VoronezhRegion",
                "VHMEZ",
                55000,
                30000);
        Factory factoryDonskoj = new Factory(
                "RostovRegion",
                "DMEZ",
                15000,
                15000);
        Factory factoryOmsk = new Factory(
                "OmskRegion",
                "OMEZ",
                30000,
                5000);
        Factory factoryErtil = new Factory(
                "VoronezhRegion",
                "EMEZ",
                25000,
                15000);
        RawMaterials sunflower = new RawMaterials(
                "SunflowerSeeds", 40000, 90); //временный объем и цена

        NullDistillation.oilProductionNullDistillation();
        FirstDistillation.oilProductionFirstDistillation();
        SecondDistillation.oilProductionSecondDistillation();
        ThirdDistillation.oilProductionThirdDistillation();

        sunflower.info();
        factoryArmavir.info();

        factoryArmavir.grainSorting(sunflower);

        sunflower.info();
        factoryArmavir.info();





    }
}