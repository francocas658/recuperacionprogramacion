package evaluacion3.correcciones_arraylist.EJ1;

public class producto {
    
    private String nombre;
    private int cantidad;

    public producto (String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCanditdad(int cantidad) {
        this.cantidad = cantidad;
    }

}
