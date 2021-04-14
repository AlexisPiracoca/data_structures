package model;
/**
 *
 * @author Jhon Alexis
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private int n_clientes;
    private List<Cliente> clientes;
    private String nombre;
    private String apellido;
    private String telefono;

    public Tienda() {
        clientes = new ArrayList<Cliente>();
        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nTIENDA\n" +
                        "[1] Ingresar cliente\n" +
                        "[2] Agregar cliente\n" +
                        "[3] Mostrar clientes\n" +
                        "[4] Editar clientes\n" +
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
                    f_ingresar_cliente();
                    break;

                case 2:
                    f_agregar_cliente();
                    break;

                case 3:
                    f_mostrar_clientes();
                    break;

                case 4:
                    f_editar_clientes();
                    break;

            }


        }while (op != 0);
        System.err.println("El programa a finalizado");
    }

    public void f_ingresar_cliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de clientes que va a ingresar: ");
        n_clientes = sc.nextInt();

        for (int i = 0; i < n_clientes; i++){
            System.out.println("Ingrese el nombre del cliente " + (i+1) + ": " );
            nombre = sc.next();
            System.out.println("Ingrese el apellido del cliente " + (i+1) + ": " );
            apellido = sc.next();
            System.out.println("Ingrese el telefono del cliente " + (i+1) + ": " );
            telefono = sc.next();

            clientes.add(new Cliente(nombre, apellido, telefono));
        }
    }

    public int f_agregar_cliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de clientes que desea añadir: ");
        n_clientes = sc.nextInt();

        for(int i = 0; i < n_clientes; i++) {
            System.out.println("Ingrese el nombre del cliente " + (i+1) + ": " );
            nombre = sc.next();
            System.out.println("Ingrese el apellido del cliente " + (i+1) + ": " );
            apellido = sc.next();
            System.out.println("Ingrese el telefono del cliente " + (i+1) + ": " );
            telefono = sc.next();

            clientes.add(new Cliente(nombre, apellido, telefono));
        }
        System.out.println("Tamaño de la lista: " + clientes.size());

        return n_clientes;
    }

    public void f_mostrar_clientes(){
        for (Cliente Cliente:clientes) {
            System.out.println("Cliente: " + Cliente);
        }
    }

    public void f_editar_clientes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué cliente deseas cambiar: ");
        n_clientes = sc.nextInt();
        int i = 0;
        for (Cliente Cliente:clientes)
        {
            System.out.println("Cliente "+i+": "+ Cliente);
            i++;
        }

        //int posc = sc.nextInt();

        System.out.println("Digita el nuevo cliente: ");
        n_clientes = sc.nextInt();
        System.out.println("Ingrese el nombre del cliente " + (i+1) + ": " );
        nombre = sc.next();
        System.out.println("Ingrese el apellido del cliente " + (i+1) + ": " );
        apellido = sc.next();
        System.out.println("Ingrese el telefono del cliente " + (i+1) + ": " );
        telefono = sc.next();

        clientes.add(new Cliente(nombre, apellido, telefono));
    }
}

