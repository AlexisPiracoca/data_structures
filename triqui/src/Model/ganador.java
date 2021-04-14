/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.coincidencia.coincidenciaColumna;
import static Model.coincidencia.coincidenciaDiagonal;
import static Model.coincidencia.coincidenciaLinea;


/**
 *
 * @author Jhon Alexis
 */
public class ganador {
    public static void ganador(char ficha, char J1, char J2, int tipo) {

        switch (tipo) {
            case 1:
                if (ficha == J1) {
                    System.out.println("Ha ganado el Jugador 1 por linea");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por linea");
                }

                break;
            case 2:
                if (ficha == J1) {
                    System.out.println("Ha ganado el Jugador 1 por columna");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por columna");
                }
                break;
            case 3:
                if (ficha == J1) {
                    System.out.println("Ha ganado el Jugador 1 por diagonal");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por diagonal");
                }
                break;
        }

    }
     public static void mostrarGanador(char[][] matriz, char J1, char J2, char fichaDef) {

        char ficha = coincidenciaLinea(matriz, fichaDef);

        if (ficha != fichaDef) {
            ganador(ficha, J1, J2, 1);
            return;

        }

        ficha = coincidenciaColumna(matriz, fichaDef);

        if (ficha != fichaDef) {
            ganador(ficha, J1, J2, 2);
            return;
        }

        ficha = coincidenciaDiagonal(matriz, fichaDef);
        if (ficha != fichaDef) {

            ganador(ficha, J1, J2, 3);

            return;
        }
        System.out.println("Hay empate");
    }

}
