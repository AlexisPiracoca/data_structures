/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

/**
 *
 * @author Jhon Alexis
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Inicio in = new Inicio();
    in.mayor();
    in.menor();
    
    }
    
    public void mayor(){
        char v[] = {'a', 'n', 'f', 'e'};
        char mayor = v[0];
        for (int i = 0; i < v.length; i++){
            if(v[i] > mayor)
                mayor = v[i];
            }
            System.out.println(mayor);
        
        
        int vi[] = {1,5,8,5,5,7,1246,54,51468};
        int mayori = 0;
        for (int i = 0; i < vi.length; i++)
        {
            if(vi[i] > mayori)
                mayori = vi[i];
            }
            System.out.println(mayori);
        
      
        String vs[] = {"hola", "pepe", "casa", "computador"};
        String mayors = " ";
        for (int i = 0; i < vs.length; i++){
            if(vs[i].compareTo(mayors) > 0)
                mayors = vs[i];
            }
            System.out.println(mayors);
  
      }

    public void menor() {
        char v[] = {'a', 'n', 'f', 'e'};
        char mayor = v[0];
        for (int i = 0; i < v.length; i++){
            if(v[i] < mayor)
                mayor = v[i];
            }
            System.out.println(mayor);
        
        
        int vi[] = {1,5,8,5,5,7,1246,54,51468};
        int mayori = vi[0];
        for (int i = 0; i < vi.length; i++)
        {
            if(vi[i] < mayori)
                mayori = vi[i];
            }
            System.out.println(mayori);
        
      
        String vs[] = {"hola", "pepe", "casa", "computador"};
        String mayors = vs[vs.length-1];
        for (int i = 0; i < vs.length; i++){
            if(vs[i].compareTo(mayors) < 0)
                mayors = vs[i];
            }
            System.out.println(mayors); 
 }
}

        
    

    