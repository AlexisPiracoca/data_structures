package view;

import model.Compraventa;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author Jhon Alexis
 */
public class Main {
    Compraventa autoMotors;
    public static void main(String[] args) {
        Main m = new Main();
        m.autoMotors = new Compraventa();

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nCOMPRAVENTA\n" +
                        "[1] Registrar vehiculos\n" +
                        "[2] Mostrar vehiculos\n" +
                        "[3] Vender vehiculos\n" +
                        "[4] Ordenado por modelo\n" +
                        "[5] Ordenado por precio\n" +
                        "[0] Salir\n" +
                        "\nIngrese una opcion:");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 4");
            }
            if (op < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }

            switch (op) {
                case 1: m.f_registrar_vehiculo();
                    break;

                case 2: m.f_mostrar_vehiculos();
                    break;

                case 3: m.f_vender_vehiculos();
                    break;

                case 4: m.f_ordenar_por_modelo();
                    break;

                case 5: m.f_ordenar_por_precio();
                    break;
            }
        }while (op != 0);
        JOptionPane.showMessageDialog(null,"El programa a finalizado");
    }

    public void f_registrar_vehiculo() {
        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nREGISTRAR VEHICULOS\n" +
                        "[1] Publico\n" +
                        "[2] Particular\n"+
                        "[0] Atras\n");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 2");
            }
            if (op < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }

            Scanner sc = new Scanner(System.in);
            switch (op) {
                case 1:

                    System.out.println("Número de vehiculos publicos que va a ingresar: ");
                    int n_vehiculos_publicos = sc.nextInt();

                    for (int i = 0; i < n_vehiculos_publicos; i++) {
                        System.out.println("Ingrese el id del vehiculo " + (i + 1) + ": ");
                        int id = sc.nextInt();
                        System.out.println("Ingrese el precio del vehiculo " + (i + 1) + ": ");
                        double precio = sc.nextDouble();
                        System.out.println("Ingrese el tipo de combustible del vehiculo " + (i + 1) + ": ");
                        String tipoCombustible = sc.next();
                        System.out.println("Ingrese el modelo del vehiculo " + (i + 1) + ": ");
                        int modelo = sc.nextInt();
                        System.out.println("Ingrese el estado del vehiculo " + (i + 1) + ": ");
                        String estado = sc.next();
                        System.out.println("Ingrese la capacidad del vehiculo " + (i + 1) + ": ");
                        int capacidad = sc.nextInt();
                        System.out.println("Ingrese el tipo de vehiculo " + (i + 1) + ": ");
                        String tipo = sc.next();
                        System.out.println("Indique si tiene cupo (true or false) " + (i + 1) + ": ");
                        boolean cupo = sc.nextBoolean();

                        autoMotors.f_registrar_vehiculo_publico(id, precio, tipoCombustible, modelo, estado, capacidad, tipo, cupo);

                        System.out.println(autoMotors.getCarrosPublicosDisponibles().size());
                    }

                    break;

                case 2:

                    System.out.println("Número de vehiculos particulares que va a ingresar: ");
                    int n_vehiculos_particulares = sc.nextInt();

                    for (int i = 0; i < n_vehiculos_particulares; i++) {
                        System.out.println("Ingrese el id del vehiculo " + (i + 1) + ": ");
                        int id = sc.nextInt();
                        System.out.println("Ingrese el precio del vehiculo " + (i + 1) + ": ");
                        double precio = sc.nextDouble();
                        System.out.println("Ingrese el tipo de combustible del vehiculo " + (i + 1) + ": ");
                        String tipoCombustible = sc.next();
                        System.out.println("Ingrese el modelo del vehiculo " + (i + 1) + ": ");
                        int modelo = sc.nextInt();
                        System.out.println("Ingrese el estado del vehiculo " + (i + 1) + ": ");
                        String estado = sc.next();
                        System.out.println("Ingrese el numero de puertas del vehiculo " + (i + 1) + ": ");
                        int numPuertas = sc.nextInt();
                        System.out.println("Ingrese el color del vehiculo " + (i + 1) + ": ");
                        String color = sc.next();
                        System.out.println("Indique su tipo de motor " + (i + 1) + ": ");
                        String tipoMotor = sc.next();

                        autoMotors.f_registrar_vehiculo_particular(id, precio, tipoCombustible, modelo, estado, numPuertas, color, tipoMotor);
                        System.out.println(autoMotors.getCarrosParticularesDisponibles().size());
                    }
                    break;
            }
        }while (op != 0);
    }

    public void f_mostrar_vehiculos(){
        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nMOSTRAR VEHICULOS\n" +
                        "[1] Mostrar vehiculos vendidos\n" +
                        "[2] Mostrar vehiculos publicos\n" +
                        "[3] Mostrar vehiculos particulares\n" +
                        "[0] Atras\n" +
                        "\nIngrese una opcion:");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 3");
            }
            if (op < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }

            switch (op) {
                case 1: autoMotors.mostrar_vehiculos_vendidos();
                    break;

                case 2: autoMotors.mostrar_vehiculos_publicos();
                    break;

                case 3: autoMotors.mostrar_vehiculos_particulares();
                    break;

            }
        }while (op != 0);
    }

    public void f_vender_vehiculos(){
        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nCOMPRAR VEHICULOS\n" +
                        "[1] Comprar vehiculos publicos\n" +
                        "[2] Comprar vehiculos particulares\n" +
                        "[0] Atras\n" +
                        "\nIngrese una opcion:");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 3");
            }
            if (op < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }
            Scanner sc = new Scanner(System.in);
            switch (op) {
                case 1: System.out.println("Indique el id del vehiculo publico que desea comprar: ");
                        autoMotors.mostrar_vehiculos_publicos();
                        int id = sc.nextInt();
                        autoMotors.vender_vehiculo_publico(autoMotors.buscar_vehiculo_publico(id));
                    break;
                case 2: System.out.println("Indique el id del vehiculo particulares que desea comprar: ");
                        autoMotors.mostrar_vehiculos_particulares();
                        int id2 = sc.nextInt();
                        autoMotors.vender_vehiculo_particular(autoMotors.buscar_vehiculo_particular(id2));
                    break;
            }
        }while (op != 0);
    }

    public void f_ordenar_por_modelo(){
        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nORDENAR\n" +
                        "[1] Ordenar por modelo vehiculos publicos\n" +
                        "[2] Ordenar por modelo vehiculos particulares\n" +
                        "[0] Atras\n" +
                        "\nIngrese una opcion:");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 3");
            }
            if (op < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }

            switch (op) {
                case 1: System.out.println("Vehiculos publicos ordenados por modelo: ");
                        autoMotors.ordenar_por_modelo_publicos();
                    break;
                case 2: System.out.println("Vehiculos particulares ordenados por modelo: ");
                        autoMotors.ordenar_por_modelo_particular();
                    break;
            }
        }while (op != 0);
    }

    public void f_ordenar_por_precio(){
        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nORDENAR\n" +
                        "[1] Ordenar por precio vehiculos publicos\n" +
                        "[2] Ordenar por precio vehiculos particulares\n" +
                        "[0] Atras\n" +
                        "\nIngrese una opcion:");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 3");
            }
            if (op < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }

            switch (op) {
                case 1: System.out.println("Vehiculos publicos ordenados por precio: ");
                        autoMotors.ordenar_por_precio_publicos();
                    break;
                case 2: System.out.println("Vehiculos particulares ordenados por precio: ");
                        autoMotors.ordenar_por_precio_particular();
                    break;
            }
        }while (op != 0);
    }
}




