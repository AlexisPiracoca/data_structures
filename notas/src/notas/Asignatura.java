/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author Jhon Alexis
 */
public class Asignatura {
    private String nombre;
    private double notaMasAlta;
    private double notaMasBaja;
    private double promedio;
    
    public Asignatura (String nombre, double notaMasAlta, double promedio) {
         this.nombre = nombre;
         this.notaMasAlta = notaMasAlta;
         this.promedio = promedio;
     }

    Asignatura(String programacion_orientada_a_objetos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Asignatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMasAlta() {
        return notaMasAlta;
    }

    public void setNotaMasAlta(double notaMasAlta) {
        this.notaMasAlta = notaMasAlta;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
