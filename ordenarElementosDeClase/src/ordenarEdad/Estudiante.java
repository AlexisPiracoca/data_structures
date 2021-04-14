/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarEdad;

/**
 *
 * @author Jhon Alexis
 */
public class Estudiante {
    private int edad;
    private double nota;
    
    public Estudiante(int edad, double nota) {
        this.edad = edad;
        this.nota = nota;
    }

    Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
