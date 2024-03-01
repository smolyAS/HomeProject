package spb.home.assets;

public class Plant {
    private String regionFactory;
    private String titleFactory;
    private int capacityProcessingRawMaterials;
    private int volumeStorageRawMaterials;

    public String getRegionFactory() {
        return regionFactory;
    }

    public void setRegionFactory(String regionFactory) {
        this.regionFactory = regionFactory;
    }

    public String getTitleFactory() {
        return titleFactory;
    }

    public void setTitleFactory(String titleFactory) {
        this.titleFactory = titleFactory;
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

    public Plant(String regionFactory, String titleFactory, int capacityProcessingRawMaterials, int volumeStorageRawMaterials) {
        this.regionFactory = regionFactory;
        this.titleFactory = titleFactory;
        this.capacityProcessingRawMaterials = capacityProcessingRawMaterials;
        this.volumeStorageRawMaterials = volumeStorageRawMaterials;
    }

}
