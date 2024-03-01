package spb.home.processAssets;

public class RawMaterials {
    private String titleRawMaterials;
    private float volumeRawMaterials;
    private float priceRawMaterials;

    public String getTitleRawMaterials() {
        return titleRawMaterials;
    }

    public void setTitleRawMaterials(String titleRawMaterials) {
        this.titleRawMaterials = titleRawMaterials;
    }

    public float getVolumeRawMaterials() {
        return volumeRawMaterials;
    }

    public void setVolumeRawMaterials(float volumeRawMaterials) {
        this.volumeRawMaterials = volumeRawMaterials;
    }

    public float getPriceRawMaterials() {
        return priceRawMaterials;
    }

    public void setPriceRawMaterials(float priceRawMaterials) {
        this.priceRawMaterials = priceRawMaterials;
    }

    public RawMaterials(String titleRawMaterials, float volumeRawMaterials, float priceRawMaterials) {
        this.titleRawMaterials = titleRawMaterials;
        this.volumeRawMaterials = volumeRawMaterials;
        this.priceRawMaterials = priceRawMaterials;
    }
}
