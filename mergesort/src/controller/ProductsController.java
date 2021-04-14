package controller;

import models.Category;
import models.Product;
import utiliy.Sorting;


public class ProductsController {

    private Product[] products;
    private int positionProduct;

    public ProductsController() {
        products = new Product[8];
        positionProduct = 8;
        initProducts();
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    private void initProducts() {
        products[0] = new Product(0, "Morral Pequeño De Montaña", 117000, Category.Accesorios);
        products[1] = new Product(1, "Red De Voleibol", 112000, Category.Deporte);
        products[2] = new Product(2, "TENIS RUNNING", 200000, Category.Accesorios);
        products[3] = new Product(3, "Balón Vóley Playa", 35000, Category.Deporte);
        products[4] = new Product(4, "Lazo EXC Guaya", 50000, Category.Gimnasio);
        products[5] = new Product(5, "Botilito", 25000, Category.Accesorios);
        products[6] = new Product(6, "Rueda ABD 12.7 cm", 35000, Category.Gimnasio);
        products[7] = new Product(7, "Saco de Boxeo", 130000, Category.Gimnasio);
    }

    public void addProduct(Product product) {
        incrementarProducto();
        product.setProductId(positionProduct);
        this.products[positionProduct++] = product;
    }

    public void printProduct(int id) {
        Product product = getProductById(id);
        if (product != null) {
            System.out.println(product.toString());
        } else {
            System.out.println("\n  ¡índice de producto no disponible!");
        }
    }

    private Product getProductById(int id) {
        try {
            for (Product product : this.products) {
                if (product.getProductId() == id) {
                    return product;
                }
            }
        }
        catch (NullPointerException ignored){}
        return null;
    }

    public void sortProducts(){
        try {
            Sorting.mergeSort(products, products.length);
            System.out.println("Lego hasta aquí! ");
            for (Product product : products) {
                System.out.print(product.toString() + "\n");
            }
        } catch (NullPointerException ignore){}
    }

    public void printProducts() {
        try {
            System.out.println(" ");
            for (Product product : this.products) {
                if (product != null) {
                    System.out.print(" [" + product.getProductId() + "] " + product.getProductName() + "\n");
                }
            }
        } catch (NullPointerException ignore) {
        }
    }

    private void incrementarProducto() {
        int limite = products.length;
        Product[] newProducts = new Product[++limite];
        if (limite > 0) {
            System.arraycopy(products, 0, newProducts, 0, limite - 1);
            products = newProducts;
        }
    }
}
