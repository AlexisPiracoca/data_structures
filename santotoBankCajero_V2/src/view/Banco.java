package view;

import model.Cliente;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

public class Banco {

    Cliente santotoBank;
    private LinkedList<Cliente> cola;

    public static void main(String[] args) throws IOException {
        Banco m = new Banco();
        m.santotoBank = new Cliente();
        //Banco m2 = new Banco();
        //m2.f_cajero_mapa();

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nATM\n" +
                        "[1] Cajero\n" +
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
                case 1:
                    m.f_cajero_mapa();
                    break;

                case 2:
                    break;
            }
        } while (op != 0);
        JOptionPane.showMessageDialog(null, "GRACIAS POR USAR NUESTRO CAJERO");
    }

    public void f_cajero_mapa() {
            // Creates an empty HashMap
            HashMap<Integer, Cliente> hmap = new HashMap<Integer, Cliente>();

            Cliente cl1 = new Cliente(1, "Pedro", "Perez", 41511211, 5456460, 300000.0, 5898);
            Cliente cl2 = new Cliente(2, "Maria", "Rojas", 87946548, 88466664, 700000.0, 7055);
            Cliente cl3 = new Cliente(3, "Oscar", "Nuñez", 78446465, 36448955, 233111.0, 3012);
            Cliente cl4 = new Cliente(4, "Camila", "Arcos", 33548754, 41222646, 2312313.0, 2269);

            hmap.put(1, cl1);
            hmap.put(2, cl2);
            hmap.put(3, cl3);
            hmap.put(4, cl4);

        // Print HashMap
       /* System.out.println(hmap);

        System.out.println(hmap.size());
        hmap.replace(1, cl3);

        System.out.println(hmap);
        hmap.remove(3);

        System.out.println(hmap);
        System.out.println(hmap.values());
        hmap.clear();

        System.out.println(hmap.size());
*/
        JOptionPane.showMessageDialog(null, "Los clientes son: " + hmap);
        JOptionPane.showMessageDialog(null, "Cliente atendido: " + hmap.remove(1));
        JOptionPane.showMessageDialog(null, "Clientes restantes: " + hmap);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la clave: ");
        int clave_leida;
        int clave = 5898;
        double saldo = 300000.0;
        clave_leida = sc.nextInt();

        if (clave == clave_leida) {
            int op = 0;
            String dato;
            do {
                try {
                    dato = JOptionPane.showInputDialog("\nATM\n" +
                            "[1] Retirar dinero\n" +
                            "[2] Ver saldo\n" +
                            "[3] Cambiar clave\n" +
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
                    case 1: //Hacer un retiro
                        System.out.println("1. Retirar Dinero");
                        System.out.println("Por favor ingrese la cantidad a retirar: ");
                        int valor_a_retirar;
                        valor_a_retirar = sc.nextInt();
                        if (valor_a_retirar <= saldo ) {
                            saldo = saldo - valor_a_retirar;
                            System.out.println("Su nuevo saldo es: " + saldo);
                        } else {
                            System.out.println("Fondos Insuficientes, su saldo es: " + saldo);
                        }
                        break;

                    case 2: //Ver saldo
                        System.out.println("2. Consultar saldo");
                        System.out.println("Su saldo es de : " + saldo);
                        break;

                    case 3: //Cambiar clave
                        System.out.println("3. Cambiar clave");
                        System.out.println("Por favor ingrese su nueva clave: ");
                        clave = sc.nextInt();
                        System.out.println("Su nueva clave es: " + clave);
                        break;

                }
            } while (op != 0);
        }
    }
}







