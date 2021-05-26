package inventario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Jhon Alexis
 */
public class Menu {

   
    public static void main(String[] args) {
       ArrayList<Registro> lista = new ArrayList<Registro>();
       
    int i = 0,opcion = 0;
    boolean uso = true;
    String op = "";
    
    while (uso) {
    
    op = JOptionPane.showInputDialog(
    "PANADERÍA \n"+
    "SELECIONE UNA OPCIÓN: \n" 
    + "1) Registrar Producto\n"
    + "2) Consutar Producto\n"
    + "3) Listar Productos\n"
    + "4) Modificar producto\n"
    + "5) Eliminar Producto\n"
    + "6) Registrar Venta\n"
    + "7) Salir\n\n");
    
    opcion = Integer.parseInt(op);
    String listado = "";
    
    switch (opcion) {
        //Registrando Productos
        case 1: 
            
          
            String codigo = JOptionPane.showInputDialog("Digite Código: "); 
            String pan = JOptionPane.showInputDialog("Digite Tipo de Pan: "); 
            int invertido = Integer.parseInt(JOptionPane.showInputDialog("Invertido por Pan: "));
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Precio: ")); 
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:")); 
            
            lista.add(new Registro(codigo,pan,invertido,precio,cantidad));
                    
                 for (i=0;i<lista.size();i++) {
                     listado += (i+1) + "°-" + "Código: " + lista.get(i).codigo+
                            "\n" + "Tipo de pan: " + lista.get(i).pan+
                            "\n" + "Invertido: " + lista.get(i).invertido+
                            "\n" + "Precio: " + lista.get(i).precio+
                            "\n" + "Cantidad: " + lista.get(i).c+ "\n\n";
                    
                }
            
              break;
               
        //Consultar Productos    
        case 2: 
            String resultado_consulta = "Producto no encontrado"; 
            String nombre_buscado = JOptionPane.showInputDialog("Ingrese Código: "); 
            for (i=0;i<lista.size();i++) {
            if (lista.get(i).codigo.equals(nombre_buscado)) {
            resultado_consulta="";
                
                resultado_consulta += "Código: " + lista.get(i).codigo+
                    "\n" + "Tipo de pan: " + lista.get(i).pan+
                    "\n" + "Invertido: " + lista.get(i).invertido+
                    "\n" + "Precio: " + lista.get(i).precio+
                    "\n" + "Cantidad: " + lista.get(i).c+ "\n\n";
                  }
            }
            JOptionPane.showMessageDialog(null,resultado_consulta);
            break;
          //Mostrando todos los productos
        case 3: 
            if (!lista.isEmpty()) {
                for (i = 0;i<lista.size();i++) {
                    
                    listado += (i+1) + "°-" +
                    "Código: " + lista.get(i).codigo+
                    "\n" + "Tipo de pan: " + lista.get(i).pan+
                    "\n" + "Invertido: " + lista.get(i).invertido+
                    "\n" + "Precio: " + lista.get(i).precio+
                    "\n" + "Cantidad: " + lista.get(i).c+ "\n\n";
            
            }
            JOptionPane.showMessageDialog(null,listado);
            }
            
            else {
                     JOptionPane.showMessageDialog(null,"LISTA VACÍA","",JOptionPane.WARNING_MESSAGE);
                    }
            break;
            
            //Modificar prouctos
            case 4:
            
            String codigo_modificar = JOptionPane.showInputDialog("Ingrese Código: "); 
                 
            
            int n_invertido = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Invertido por Pan: "));
            int n_precio = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Precio: ")); 
            int n_cantidad = Integer.parseInt(JOptionPane.showInputDialog("Nueva Cantidad:")); 
            int c2;
               
            
            
            for (i = 0;i<lista.size();i++) {
            
                  if (lista.get(i).codigo.equals(codigo_modificar)) {
                 
                  
                  lista.get(i).setInvertido(n_invertido);
                  lista.get(i).setPrecio(n_precio);
                  
                  c2= n_cantidad + lista.get(i).c;
                  
                  lista.get(i).setC(c2);
                  
              listado += 
                    "Código: " + lista.get(i).codigo+
                    "\n" + "Tipo de pan: " + lista.get(i).pan+
                    "\n" + "Invertido: " + lista.get(i).invertido+
                    "\n" + "Precio: " + lista.get(i).precio+
                    "\n" + "Cantidad: " + lista.get(i).c+ "\n\n";
              
              JOptionPane.showMessageDialog(null,listado);
              }
                  else {
                    
                  JOptionPane.showMessageDialog(null,"Producto no encontrado.","",JOptionPane.WARNING_MESSAGE);
                    }
                        }
            break;
           
            
            //Eliminar productos
            case 5:
                
            String codigo_eliminar = JOptionPane.showInputDialog("Ingrese Código: "); 
            
             for (i = 0;i<lista.size();i++) {
            
                  if (lista.get(i).codigo.equals(codigo_eliminar)) {
                      lista.remove(i);
                     
                      
                for (i = 0;i<lista.size();i++) {
                   
                    listado += (i+1) + "°-" +
                    "Código: " + lista.get(i).codigo+
                    "\n" + "Tipo de pan: " + lista.get(i).pan+
                    "\n" + "Invertido: " + lista.get(i).invertido+
                    "\n" + "Precio: " + lista.get(i).precio+
                    "\n" + "Cantidad: " + lista.get(i).c+ "\n\n";
                }
                  }
             else {
                    
                  JOptionPane.showMessageDialog(null,"Procuto eliminado","",JOptionPane.WARNING_MESSAGE);
                    }
             }
                JOptionPane.showMessageDialog(null,listado);
             
                
                break;
             
            //Registrar ventas 
            case 6:
            
            
            String ventas = JOptionPane.showInputDialog("¿Desea registrar producto? (s/n)?"); 
            
          
        switch (ventas) {
        case "s":
            String resultado_consulta2 = "Producto no encontrado"; 
            String nombre_buscado2 = JOptionPane.showInputDialog("Ingrese Código: "); 
            int p;
            for (i=0;i<lista.size();i++) {
                if (lista.get(i).codigo.equals(nombre_buscado2)) {
            nombre_buscado2="";
                    
                   int cv = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de producto a vender: "));
                   int cv2,t_v = 0;
                   if (cv > lista.get(i).c) {  JOptionPane.showMessageDialog(null,"No hay esa cantidad, solo hay: " +lista.get(i).c); }
                   else {
                                
                  cv2 = lista.get(i).c - cv;
                  p = lista.get(i).precio * cv; 
                  
                  
                  lista.get(i).setC(cv2);
                  
                 
              nombre_buscado2 += "Código: " + lista.get(i).codigo+
                    "\n" + "Tipo de pan: " + lista.get(i).pan+
                    "\n" + "Invertido: " + lista.get(i).invertido+
                    "\n" + "Precio: " + lista.get(i).precio+
                    "\n" + "Cantidad Restante: " + lista.get(i).c+
                    "\n" + "Cantidad Vendida: " + cv+
                    "\n" + "Valor a pagar: " + p;
                    
                  lista.get(i).vendido += lista.get(i).precio * cv;                
                  lista.get(i).ganancias += (lista.get(i).precio - lista.get(i).invertido) * cv;
                    
                listado += "\n" + "vendido: " + lista.get(i).vendido+
                    "\n" + "ganancias: " + lista.get(i).ganancias;
              }   
                
                }
            }
            
            JOptionPane.showMessageDialog(null,nombre_buscado2);
            JOptionPane.showMessageDialog(null,listado);
           
            break;
        case "n":
            JOptionPane.showMessageDialog(null,"Saliendo...");
            break;
        default:
            JOptionPane.showMessageDialog(null,"Opción no válida");
            break;
    }
            break;
            
            case 7:
                
                uso = false;
            break; 
            default:
                 
             JOptionPane.showMessageDialog(null,"Opción no válida","",JOptionPane.WARNING_MESSAGE);
    break;            
    }
          }      
    }
}
    
    
    
    
    
