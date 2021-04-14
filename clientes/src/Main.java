import model.Client;
import controller.VisitsController;
import utiliy.Keyboard;

public class Main {

    public static Keyboard keyboard = new Keyboard();
    public static VisitsController visitsController = new VisitsController();

    public static int currentDay = 0;
    public static boolean finishProgram = false;

    public static void main(String[] args) {
        menu();
        int option;
        do {
            System.out.print("\nSeleccione una opción en el menú principal: ");
            option = keyboard.readIntegerDefault(-1);
            switch (option) {
                case 0 -> System.out.println(" El programa ha finalizado");
                case 1 -> addClient();
                case 2 -> finishDay();
                case 3 -> printVisits();
                case 4 -> showVisitsByDay();
                default -> System.out.println(" ¡Opción no disponible en el menú principal!");
            }
        } while (option != 0 && !finishProgram);
        System.out.println(" La semana ha finalizado ");
    }

    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠----------------------Panadería----------------------╣");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║   1. Registrar visita cliente                       ║");
        System.out.println("║   2. Finalizar día                                  ║");
        System.out.println("║   3. Mostrar las visitas semanales                  ║");
        System.out.println("║   4. Mostrar visitas de un cliente en un día        ║");
        System.out.println("║   0. Salir                                          ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    public static void addClient() {
        String okMessage = "  Visita del cliente registrada correctamente";
        int cardNumber = keyboard.readValidPositiveInteger("  Ingrese el número de documento del cliente: ");

        if (visitsController.isClientRegistered(cardNumber)) {
            Client currentClient = visitsController.getClientByCardNumber(cardNumber);
            assert currentClient != null;
            visitsController.registerVisitClient(currentClient, currentDay);
            System.out.println("\n" + okMessage);
        } else {
            Client client = registerClient(cardNumber);
            visitsController.registerVisitClient(client, currentDay);
            System.out.println("\n" + okMessage);
        }
    }

    public static Client registerClient(int cardNumber) {
        Client client = new Client();

        client.setIdClient(visitsController.getPositionClient());
        client.setCardNumber(cardNumber);
        System.out.print("  Ingrese el nombre del cliente: ");
        client.setName(keyboard.readLine());
        System.out.print("  Ingrese el teléfono del cliente: ");
        client.setPhone(keyboard.readLine());

        visitsController.addClient(client);
        return client;
    }

    public static void finishDay() {
        if (currentDay < 6) {
            currentDay += 1;
            System.out.println(" Día actual " + getDay(currentDay));
        } else {
            visitsController.printVisits();
            finishProgram = true;
        }
    }

    public static void showVisitsByDay(){
        int cardNumber = keyboard.readValidPositiveInteger("  Ingrese la cédula del cliente: ");
        if (visitsController.isClientRegistered(cardNumber)) {
            int day = keyboard.readValidPositiveInteger("  Ingrese el día de la semana: ");
            if (getDay(day) == null){
                System.out.println("  Día de la semana no válido");
            } else {
                visitsController.printVisitsByDay(cardNumber, day, getDay(day));
            }
        } else{
            System.out.println("  ¡Cliente no registrado!");
        }
    }

    public static String getDay(int currentDay) {
        String weekday;
        switch (currentDay) {
            case 0 -> weekday = "Lunes";
            case 1 -> weekday = "Martes";
            case 2 -> weekday = "Miércoles";
            case 3 -> weekday = "Jueves";
            case 4 -> weekday = "Viernes";
            case 5 -> weekday = "Sábado";
            case 6 -> weekday = "Domingo";
            default -> {
                return null;
            }
        }
        return weekday;
    }

    public static void printVisits() {
        visitsController.printVisits();
    }
}
