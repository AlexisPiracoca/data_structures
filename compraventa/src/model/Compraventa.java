package model;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Jhon Alexis
 */
public class Compraventa {
    private static List<Particular> carrosParticularesDisponibles;
    private static List<Publico> carrosPublicosDisponibles;
    private List<Vehiculo> vehiculosVendidos;

    public Compraventa() {
        carrosParticularesDisponibles = new ArrayList<>();
        carrosPublicosDisponibles = new ArrayList<>();
        vehiculosVendidos = new ArrayList<>();
    }

    public static List<Particular> getCarrosParticularesDisponibles() {
        return carrosParticularesDisponibles;
    }

    public void setCarrosParticularesDisponibles(List<Particular> carrosParticularesDisponibles) {
        this.carrosParticularesDisponibles = carrosParticularesDisponibles;
    }

    public static List<Publico> getCarrosPublicosDisponibles() {
        return carrosPublicosDisponibles;
    }

    public void setCarrosPublicosDisponibles(List<Publico> carrosPublicosDisponibles) {
        this.carrosPublicosDisponibles = carrosPublicosDisponibles;
    }

    public List<Vehiculo> getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public void setVehiculosVendidos(List<Vehiculo> vehiculosVendidos) {
        this.vehiculosVendidos = vehiculosVendidos;
    }

    public void f_registrar_vehiculo_publico(int id, double precio, String tipoCombustible, int modelo, String estado, int capacidad, String tipo, boolean cupo) {
        carrosPublicosDisponibles.add(new Publico(id, precio, tipoCombustible, modelo, estado, capacidad, tipo, cupo));
    }

    public void f_registrar_vehiculo_particular(int id, double precio, String tipoCombustible, int modelo, String estado, int numPuertas, String color, String tipoMotor) {
        carrosParticularesDisponibles.add(new Particular(id, precio, tipoCombustible, modelo, estado, numPuertas, color, tipoMotor));
    }

    public void mostrar_vehiculos_vendidos() {
        imprimir_vehiculos_vendidos("Vehiculos vendidos", vehiculosVendidos);
    }

    private void imprimir_vehiculos_vendidos(String vehiculos_vendidos, List<Vehiculo> vehiculosVendidos) {
        System.out.println("\n" + vehiculos_vendidos + ": ");
        vehiculosVendidos.forEach(vehiculo -> System.out.println("\t" + vehiculo.toString()));
    }

    public void mostrar_vehiculos_publicos() {
        imprimir_vehiculos_publicos("Vehiculos Publicos", carrosPublicosDisponibles);
    }

    private void imprimir_vehiculos_publicos(String vehiculos_publicos, List<Publico> carrosPublicosDisponibles) {
        System.out.println("\n" + vehiculos_publicos + ": ");
        carrosPublicosDisponibles.forEach(publico -> System.out.println("\t" + publico.toString()));
    }

    public void mostrar_vehiculos_particulares() {
        imprimir_vehiculos_particulares("Vehiculos Particulares", carrosParticularesDisponibles);
    }

    private void imprimir_vehiculos_particulares(String vehiculos_particulares, List<Particular> carrosParticularesDisponibles) {
        System.out.println("\n" + vehiculos_particulares + ": ");
        carrosParticularesDisponibles.forEach(particular -> System.out.println("\t" + particular.toString()));
    }

    public void vender_vehiculo_publico(Vehiculo vehiculo) {
        vehiculosVendidos.add(vehiculo);
        carrosPublicosDisponibles.remove(vehiculo);
        buscar_vehiculo_publico(vehiculo.getId());
    }

    public Publico buscar_vehiculo_publico(int id) throws NullPointerException {
        for (Publico publico : Compraventa.getCarrosPublicosDisponibles()) {
            if (publico.getId() == id) {
                return publico;
            }
        }
        return null;
    }

    public void vender_vehiculo_particular(Vehiculo vehiculo) {
        vehiculosVendidos.add(vehiculo);
        carrosParticularesDisponibles.remove(vehiculo);
        buscar_vehiculo_particular(vehiculo.getId());
    }

    public Particular buscar_vehiculo_particular(int id) throws NullPointerException {
        for (Particular particular : Compraventa.getCarrosParticularesDisponibles()) {
            if (particular.getId() == id) {
                return particular;
            }
        }
        return null;
    }

    public void ordenar_por_modelo_publicos() {
        carrosPublicosDisponibles.sort(Comparator.comparingInt(Vehiculo::getModelo));
        mostrar_vehiculos_publicos();
    }

    public void ordenar_por_modelo_particular() {
        carrosParticularesDisponibles.sort(Comparator.comparingInt(Vehiculo::getModelo));
        mostrar_vehiculos_particulares();
    }

    public void ordenar_por_precio_publicos() {
        carrosPublicosDisponibles.sort(Comparator.comparingDouble(Vehiculo::getPrecio));
        mostrar_vehiculos_publicos();
    }

    public void ordenar_por_precio_particular() {
        carrosParticularesDisponibles.sort(Comparator.comparingDouble(Vehiculo::getPrecio));
        mostrar_vehiculos_particulares();
    }
}




