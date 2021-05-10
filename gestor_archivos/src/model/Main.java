package model;
import javax.swing.*;
/**
 *
 * @author Jhon Alexis
 */
public class Main {
    Archivo gestor;
    public static void main(String[] args) {

        Main archivos = new Main();
        archivos.gestor = new Archivo();

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nARCHIVOS\n" +
                        "[1] Disco Local C\n" +
                        "[2] Disco Local D\n" +
                        "[0] Salir\n" +
                        "\n");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                System.err.println("Ingrese un numero entre 0 y 2");
            }
            if (op < 0) {
                System.err.println("Ingrese valores numericos positivos");
            }

            switch (op) {
                case 1: archivos.f_disco_local_c();
                    break;

                case 2: archivos.f_disco_local_d();
                    break;
            }
        } while (op != 0);
    }

    public void f_disco_local_c(){

        Archivo.Node raiz = new Archivo.Node<>("- Archivos de programa");
        raiz.insert("- Archivos de programa (x86)");
        raiz.insert("- Usuarios");
        raiz.insert("- Windows");
        raiz.insert("- PerfLogs");

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nARCHIVOS C\n" +
                        "[1] Mostrar Carpetas\n"+
                        "[0] Atras\n");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                System.err.println("Ingrese un numero entre 0 y 1");
            }
            if (op < 0) {
                System.err.println("Ingrese valores numericos positivos");
            }
            switch (op) {
                case 1: System.out.println("\nLas carpetas de C:");
                    raiz.inorder();
                    break;
                case 2:
                    break;
                default:
            }
        } while (op != 0);
    }

    public void f_disco_local_d(){
        Archivo.Node raiz = new Archivo.Node<>("- Varios");
        raiz.insert("- Documentos");
        raiz.insert("- Descargas");
        raiz.insert("- Imagenes");
        raiz.insert("- Videos");
        raiz.insert("- Musica");

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nARCHIVOS D\n" +
                        "[1] Mostrar Carpetas\n"+
                        "[0] Atras\n");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                System.err.println("Ingrese un numero entre 0 y 1");
            }
            if (op < 0) {
                System.err.println("Ingrese valores numericos positivos");
            }
            switch (op) {
                case 1: System.out.println("\nLas carpetas de D son:");
                        raiz.inorder();
                    break;
                case 2:
                    break;
                default:
            }
        } while (op != 0);
    }
}


