
package model;

/**
 *
 * @author Jhon Alexis
 */
public class Usuario {
       
    private String nombre;
    private String apellido;
    private Cuenta cuentas[];
    private int nCuentas;
    private int nUsuarios;

    //Constructor por defecto
    public Usuario() {
        nUsuarios++;
              
        cuentas = new Cuenta[3];
        for(int i = 0; i < 3; i++ ){
            cuentas[i] = new Cuenta();
        }
    }

    //Constructor con parámetros
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public int getnUsuarios() {
        return nUsuarios;
    }

    //Getters y setters
    public void setnUsuarios(int nUsuarios) {    
        this.nUsuarios = nUsuarios;
    }

    public int getnCuentas() {
        return nCuentas;
    }
    
    public void setnCuentas(int nCuentas) {    
        this.nCuentas = nCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    
  }
