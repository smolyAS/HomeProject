package spb.home;

public class Plant {
    private String region;
    private String title;
    private int capacityProcessingRawMaterials;
    private int volumeStorageRawMaterials;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacityProcessingRawMaterials() {
        return capacityProcessingRawMaterials;
    }

    public void setCapacityProcessingRawMaterials(int capacityProcessingRawMaterials) {
        this.capacityProcessingRawMaterials = capacityProcessingRawMaterials;
    }

    public int getVolumeStorageRawMaterials() {
        return volumeStorageRawMaterials;
    }

    public void setVolumeStorageRawMaterials(int volumeStorageRawMaterials) {
        this.volumeStorageRawMaterials = volumeStorageRawMaterials;
    }

    public Plant(String region, String title, int capacityProcessingRawMaterials, int volumeStorageRawMaterials) {
        this.region = region;
        this.title = title;
        this.capacityProcessingRawMaterials = capacityProcessingRawMaterials;
        this.volumeStorageRawMaterials = volumeStorageRawMaterials;
    }

    public static int oilProductionNullDistillation () {
        System.out.println("0 передел это подработка сырья");
        return 0;
    }
    public static int oilProductionFirstDistillation () {
        System.out.println("1 передел это выпуск нерафинированного масла и вторичной продукции");
        return 1;
    }
    public static int oilProductionSecondDistillation () {
        System.out.println("2 передел это выпуск рафинированного масла");
        return 2;
    }
    public static int oilProductionTreeDistillation () {
        System.out.println("3 передел это выпуск фасованного рафинированного дезодорированного масла");
        return 3;
    }
}
