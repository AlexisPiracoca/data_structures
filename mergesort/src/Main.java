import controller.ProductsController;
import models.Category;
import models.Product;
import utiliy.Keyboard;

public class Main {

    public static Keyboard keyboard = new Keyboard();
    public static ProductsController controller = new ProductsController();

    public static void main(String[] args) {
        Main main = new Main();

        main.menu();
        int option;
        do {
            System.out.print("\nSeleccione una opción en el menú principal: ");
            option = keyboard.readIntegerDefault(-1);
            switch (option) {
                case 0 -> System.out.println(" El programa ha finalizado");
                case 1 -> main.addProduct();
                case 2 -> main.printProduct();
                case 3 -> main.printProducts();
                case 4 -> main.sortProductsByPrice();
                default -> System.out.println(" ¡Opción no disponible en el menú principal!");
            }
        } while (option != 0 );
    }

    public void menu() {
        System.out.println("╔═════════════════════════════════════════════════╗");
        System.out.println("╠-------------------StoreSports-------------------╣");
        System.out.println("║═════════════════════════════════════════════════║");
        System.out.println("║   1. Agregar producto                           ║");
        System.out.println("║   2. Mostrar características del producto       ║");
        System.out.println("║   3. Mostrar productos disponibles              ║");
        System.out.println("║   4. Ordenar productos por precio               ║");
        System.out.println("║   0. Salir                                      ║");
        System.out.println("╚═════════════════════════════════════════════════╝");
    }

    public void addProduct(){
        Product product = registerProduct();
        controller.addProduct(product);
    }

    public Product registerProduct(){
        Product product = new Product();
        System.out.print("\n  Ingrese el nombre del producto: ");
        product.setProductName(keyboard.readLine());
        product.setPrice(keyboard.readValidDouble("\n  Ingrese el precio del producto: "));
        product.setCategory(readCategory());

        return product;
    }

    public Category readCategory(){
        Category category;
        System.out.print("\n  Seleccione una categoría (Gimnasio, Deporte, Accesorios): ");
        String option = keyboard.readLine();
        switch (option) {
            case "Gimnasio" -> category = Category.Gimnasio;
            case "Deporte" -> category = Category.Deporte;
            case "Accesorios" -> category = Category.Accesorios;
            default -> {
                category = Category.SinDefinir;
                System.out.println("  ¡Categoría no disponible!");
            }
        }
        return category;
    }

    public void printProduct(){
        printProducts();
        int id = keyboard.readValidPositiveInteger("\n  Seleccione el índice del producto: ");
        controller.printProduct(id);
    }

    public void printProducts(){
        controller.printProducts();
    }

    public void sortProductsByPrice(){
        controller.sortProducts();
    }
}
