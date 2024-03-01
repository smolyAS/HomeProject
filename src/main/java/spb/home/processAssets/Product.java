package spb.home.processAssets;

public class Product {
    private String titleProduct;
    private float volumeProduct;
    private float priceProduct;

    public String getTitleProduct() {
        return titleProduct;
    }

    public void setTitleProduct(String titleProduct) {
        this.titleProduct = titleProduct;
    }

    public float getVolumeProduct() {
        return volumeProduct;
    }

    public void setVolumeProduct(float volumeProduct) {
        this.volumeProduct = volumeProduct;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Product(String titleProduct, float volumeProduct, float priceProduct) {
        this.titleProduct = titleProduct;
        this.volumeProduct = volumeProduct;
        this.priceProduct = priceProduct;
    }

}
