/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jhon Alexis
 */
public class coincidencia {
    public static char coincidenciaLinea(char[][] matriz, char fichaDef) {

        char ficha;
        boolean coincidencia;

        for (int i = 0; i < matriz.length; i++) {

            //Reiniciamos la coincidencia
            coincidencia = true;
            //Cogemos la ficha de la fila
            ficha = matriz[i][0];
            if (ficha != fichaDef) {
                for (int j = 1; j < matriz[0].length; j++) {
                    //sino coincide ya no habra ganado en esta fila
                    if (ficha != matriz[i][j]) {
                        coincidencia = false;
                    }
                }

                //Si no se mete en el if, devuelvo el ganador
                if (coincidencia) {
                    return ficha;
                }
            }
        }

        //Si no hay ganador, devuelvo la partida
        return fichaDef;

    }

    public static char coincidenciaColumna(char[][] matriz, char fichaDef) {

        char ficha;
        boolean coincidencia;

        for (int j = 0; j < matriz.length; j++) {

            //Reiniciamos la coincidencia
            coincidencia = true;
            //Cogemos la ficha de la columna
            ficha = matriz[0][j];
            if (ficha != fichaDef) {
                for (int i = 1; i < matriz[0].length; i++) {
                    //sino coincide ya no habra ganado en esta fila
                    if (ficha != matriz[i][j]) {
                        coincidencia = false;
                    }
                }

                //Si no se mete en el if, devuelvo el ganador
                if (coincidencia) {
                    return ficha;
                }

            }

        }

        //Si no hay ganador, devuelvo la partida
        return fichaDef;
    }

    public static char coincidenciaDiagonal(char[][] matriz, char fichaDef) {

        char ficha;
        boolean coincidencia = true;

        //Diagonal principal
        ficha = matriz[0][0];
        if (ficha != ficha) {
            for (int i = 1; i < matriz.length; i++) {
                //sino coincide ya no habra ganadro en esta fila
                if (ficha != matriz[i][i]) {
                    coincidencia = false;
                }
            }

            //Si no se mete en el if, devuelvo el ganador
            if (coincidencia) {
                return ficha;
            }

        }

        //Diagonal inversa
        ficha = matriz[0][2];
        if (ficha != fichaDef) {
            for (int i = 1, j = 1; i < matriz.length; i++, j--) {
                //sino coincide ya no habra ganadro en esta fila
                if (ficha != matriz[i][j]) {
                    coincidencia = false;
                }
            }

            //Si no se mete en el if, devuelvo el ganador
            if (coincidencia) {
                return ficha;
            }
        }

        //Si no hay ganador, devuelvo la partida
        return ficha;

    }
}
