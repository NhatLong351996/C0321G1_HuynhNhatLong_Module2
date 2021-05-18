package bai12_java_collection_framework.bai_tap.ltarraylist_linkedlist;

public class Product implements Comparable<Product>{
    private int id;
    private String nameProduct;
    private int priceProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, int priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getNameProduct().compareTo(o.getNameProduct());
    }
}
