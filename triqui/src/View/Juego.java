package View;

import static Model.coincidencia.coincidenciaColumna;
import static Model.coincidencia.coincidenciaDiagonal;
import static Model.coincidencia.coincidenciaLinea;
import java.util.Scanner;
import Model.ganador;
import static Model.ganador.ganador;
import static Model.ganador.mostrarGanador;

public class Juego {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        jugar();
    }

    /**
     * Metodo donde empezaremos a jugar
     */
    public static void jugar() {

        //Reprentaciones de los jugadores y del simbolo vacio
        char J1 = 'X';
        char J2 = 'O';
        char vacio = '-';

        //turno actual
        //true = J1, false = J2
        boolean turno = true;

        //tablero donde vamos a jugar
        char tablero[][] = new char[3][3];

        //rellenamos la matriz con los guiones
        rellenarMatriz(tablero, vacio);

        int fila, columna;
        boolean posValida, correcto;

        //No salimos hasta que uno gane o no haya mas posibilidades
        while (!finPartida(tablero, vacio)) {

            do {

                //mostramos el jugador al que le toca
                mostrarTurnoActual(turno);

                //muestro el tablero
                mostrarMatriz(tablero);

                correcto = false;
                fila = pedirInteger("Dame la fila (las filas son de 0 a 2)");
                columna = pedirInteger("Dame la columna(las columnas son de 0 2)");

                //Validamos la posicion
                posValida = validarPosicion(tablero, fila, columna);

                //Si es valido, comprobamos que no haya ninguna marca
                if (posValida) {

                    //Si no hay marca, significa que es correcto
                    if (!hayValorPosicion(tablero, fila, columna, vacio)) {
                        correcto = true;
                    } else {
                        System.out.println("Ya hay una marca en esa posicion");
                    }
                } else {
                    System.out.println("La posicion no es valida");
                }

                //Mientras no sea correcto, no salgo
            } while (!correcto);

            //depende del turno, inserta un simbolo u otro
            if (turno) {
                insertarEn(tablero, fila, columna, J1);
            } else {
                insertarEn(tablero, fila, columna, J2);
            }

            //cambio de turno
            turno = !turno;
        }

        //Muestra el tablero
        mostrarMatriz(tablero);

        //Mostramos el ganador
        mostrarGanador(tablero, J1, J2, vacio);

    }
  
    public static void mostrarTurnoActual(boolean turno) {

        if (turno) {
            System.out.println("Le toca al jugador 1");
        } else {
            System.out.println("Le toca al jugador 2");
        }
    }

     public static int pedirInteger(String mensaje) {

        System.out.println(mensaje);
        int numero = teclado.nextInt();

        return numero;
    }

    public static void rellenarMatriz(char[][] matriz, char ficha) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ficha;
            }
        }
    }

    public static boolean validarPosicion(char[][] tablero, int fila, int columna) {

        if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length) {
            return true;
        }
        return false;
    }

    public static boolean hayValorPosicion(char[][] matriz, int fila, int columna, char fichaDef) {
        if (matriz[fila][columna] != fichaDef) {
            return true;
        }
        return false;
    }

    public static void mostrarMatriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean matrizLlena(char[][] matriz, char fichaDef) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == fichaDef) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean finPartida(char[][] matriz, char ficha) {

        if (matrizLlena(matriz, ficha)
                || coincidenciaLinea(matriz, ficha) != ficha
                || coincidenciaColumna(matriz, ficha) != ficha
                || coincidenciaDiagonal(matriz, ficha) != ficha) {
            return true;
        }
        return false;
    }

   public static void insertarEn(char[][] matriz, int fila, int columna, char ficha) {
        matriz[fila][columna] = ficha;
    }
}
