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
public class Facultad {
    private double mejorAsignatura;
    private double peorAsignatura;
    private double mejorNotaAsignatura;
    private double peorNotaAsignatura;
    
    public Facultad (double mejorAsignatura, double peorAsignatura, double mejorNotaAsignatura, double peorNotaAsignatura) {
         this.mejorAsignatura = mejorAsignatura;
         this.peorAsignatura = peorAsignatura;
         this.mejorNotaAsignatura = mejorNotaAsignatura;
         this.peorNotaAsignatura = peorNotaAsignatura;
     }

    public double getMejorAsignatura() {
        return mejorAsignatura;
    }

    public void setMejorAsignatura(double mejorAsignatura) {
        this.mejorAsignatura = mejorAsignatura;
    }

    public double getPeorAsignatura() {
        return peorAsignatura;
    }

    public void setPeorAsignatura(double peorAsignatura) {
        this.peorAsignatura = peorAsignatura;
    }

    public double getMejorNotaAsignatura() {
        return mejorNotaAsignatura;
    }

    public void setMejorNotaAsignatura(double mejorNotaAsignatura) {
        this.mejorNotaAsignatura = mejorNotaAsignatura;
    }

    public double getPeorNotaAsignatura() {
        return peorNotaAsignatura;
    }

    public void setPeorNotaAsignatura(double peorNotaAsignatura) {
        this.peorNotaAsignatura = peorNotaAsignatura;
    }
    public double mejorNotaAsignatura(){
        
        Asignatura va[] = new Asignatura[5];
        va[0] = new Asignatura("Programacion orientada a objetos");
        va[1] = new Asignatura("Calculo");
        va[2] = new Asignatura("Bases de Datos");  
        va[3] = new Asignatura("Estructuras de datos");
        va[4] = new Asignatura("Quimica");
        
        Estudiante mayore = new Estudiante();
        mayore.setPromedio(mejorNotaAsignatura);
        for(int i = 0; i < va.length; i++){
           if(va[i].getPromedio() > mayore.getPromedio());
          //mayore = va[i];
        }
        System.out.println("La mejor asignatura es: "+mayore.getNombre()+" con una nota de: "+mayore.getPromedio());
        return 0;
    }
    public double peorNotaAsignatura(){
        
        Asignatura va[] = new Asignatura[5];
        va[0] = new Asignatura("Programacion orientada a objetos");
        va[1] = new Asignatura("Calculo");
        va[2] = new Asignatura("Bases de Datos");  
        va[3] = new Asignatura("Estructuras de datos");
        va[4] = new Asignatura("Quimica");
        
        Asignatura menore = new Asignatura();
        menore.setPromedio(va[va.length-1].getPromedio());
        for(int i = 0; i < va.length; i++){
           if(va[i].getPromedio() < menore.getPromedio());
           menore = va[i];
        }
        System.out.println("La peor asignatura es: "+menore.getNombre()+" con una nota de: "+menore.getPromedio());
        return 0;
    }
}
