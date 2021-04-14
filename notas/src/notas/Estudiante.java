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
public class Estudiante {
    private String nombre;
    private double nota;
    
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    double getPromedio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPromedio(double mejorNotaAsignatura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public double notaMasAlta(){
        
        Estudiante ve[] = new Estudiante[5];
        ve[0] = new Estudiante("Juan", 3.2);
        ve[1] = new Estudiante("Pablo", 4.7);
        ve[2] = new Estudiante("Maria", 2.5);  
        ve[3] = new Estudiante("Mario", 4.2);
        ve[4] = new Estudiante("Camila", 4.4);
        
        Estudiante mayore = new Estudiante();
        double notaMasAlta = 0;
        mayore.setNota(notaMasAlta);
        for(int i = 0; i < ve.length; i++){
           if(ve[i].getNota() > mayore.getNota());
           mayore = ve[i];
        }
        System.out.println("El estudiante: "+mayore.getNombre()+" tiene la mayor nota, que es: "+mayore.getNota());
        return 0;
    }
    
    public double notaMasBaja(){
        
        Estudiante ve[] = new Estudiante[5];
        ve[0] = new Estudiante("Juan", 3.2);
        ve[1] = new Estudiante("Pablo", 4.7);
        ve[2] = new Estudiante("Maria", 2.5);  
        ve[3] = new Estudiante("Mario", 4.2);
        ve[4] = new Estudiante("Camila", 4.4);
        
        Estudiante menore = new Estudiante();
        menore.setNota(ve[ve.length-1].getNota());
        for(int i = 0; i < ve.length; i++){
           if(ve[i].getNota() < menore.getNota());
           menore = ve[i];
        }
        System.out.println("El estudiante: "+menore.getNombre()+" tiene la menor nota, que es: "+menore.getNota());
        return 0;
    }
    
    public double calculaPromedioNotas(){
        
        Estudiante ve[] = new Estudiante[5];
        ve[0] = new Estudiante("Juan", 3.2);
        ve[1] = new Estudiante("Pablo", 4.7);
        ve[2] = new Estudiante("Maria", 2.5);  
        ve[3] = new Estudiante("Mario", 4.2);
        ve[4] = new Estudiante("Camila", 4.4);
        
        double suma = 0;
        for(int i = 0; i < ve.length; i++){
            suma += ve[i].getNota();
        }
        return suma / ve.length;
    }
       
  }

