package models;

public class Product {

    private int productId;
    private String productName;
    private double price;
    private Category category;

    public Product() {
    }

    public Product(int productId, String productName, double price, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\n Producto [" + productId + "]: "+
                "\n  nombre: " + productName +
                "\n  precio: " + price +
                "\n  categoría: " + category;
    }
}
