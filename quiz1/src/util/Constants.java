/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Jhon Alexis
 */
public class Constants {
    
    //Titles
    public static final String TITLE = "PANADERIA"; 
    public static final String OWNER_MODULE_TITLE = "PANADERIA";
    
    //Menus
    public static final String MAIN_MENU_TITLE = "PANADERIA";
    public static final String MAIN_MENU_INFO = "Hola, bienvenido a nuestra panaderia "
            + "\n [1] Acceder a las ventas "
            + "\n [2] Acceder al inventario de panes "
            + "\n [0] Salir";
    
    public static final String CLIENTE_MENU_TITLE = "VENTAS";
    public static final String CLIENTE_MENU_INFO = "Por favor escoge una de las opciones: "
            + "\n [1] Para insertar una venta realizada"
            + "\n [2] Para listar las ventas realizadas"
            + "\n [0] Atras";
    
    public static final String PAN_MENU_TITLE = "VENTAS";
    public static final String PAN_MENU_INFO = "Por favor escoge una de las opciones: "
            + "\n [1] Para agregar pan"
            + "\n [2] Para listar los panes"
            + "\n [0] Atras";

    //Errors
    public static final String GENERAL_ERROR = "Lo sentimos, se presentó un error general (E001)";
    public static final String CREATE_ERROR = "Lo sentimos, no se pudo guardar (E002)";
    public static final String DELETE_ERROR = "Lo sentimos, no se pudo eliminar (E003)";
    
    //Éxito
    public static final String GENERAL_SUCCESS = "Perfecto, funciono de acuerdo a lo pensado :)";
    public static final String CREATE_SUCCESS = "Se ha guardado correctamente";
}
