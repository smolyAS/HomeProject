package spb.home.processAssets;

import spb.home.productionProcess.FirstDistillation;
import spb.home.productionProcess.NullDistillation;
import spb.home.productionProcess.SecondDistillation;
import spb.home.productionProcess.ThirdDistillation;

public class App {
    public static void main(String[] args) {
        NullDistillation.oilProductionNullDistillation();
        FirstDistillation.oilProductionFirstDistillation();
        SecondDistillation.oilProductionSecondDistillation();
        ThirdDistillation.oilProductionThirdDistillation();

    }
}