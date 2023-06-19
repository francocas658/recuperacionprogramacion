package evaluacion3.correcciones_arraylist.EJ1;
import java.util.ArrayList;
import java.util.Iterator;

public class EJ1 {
    public static void main(String[] args) {

        producto producto1 = new producto("Placa base", 3);
        producto producto2 = new producto("Grafica", 4);
        producto producto3 = new producto("Procesador", 5);
        producto producto4 = new producto("Fuente alimentacion", 6);
        producto producto5 = new producto("Disipadores", 10);

        ArrayList <producto> listaproducto = new ArrayList<>();

        listaproducto.add(producto1);
        listaproducto.add(producto2);
        listaproducto.add(producto3);
        listaproducto.add(producto4);
        listaproducto.add(producto5);

        Iterator<producto> iterator = listaproducto.iterator();
        while (iterator.hasNext()) {
            producto producto = iterator.next();
            System.out.println ("Nombre: " +producto.getNombre()+ "Cantidad: " +producto.getCantidad());
        }

        listaproducto.remove(1);
        listaproducto.remove(2);

        producto producto6 = new producto("Cableado", 25);
        listaproducto.add(3, producto6);

        System.out.println ("Visualizacion nuevo arrayList ");

        iterator = listaproducto.iterator();
        while (iterator.hasNext()) {
            producto producto = iterator.next();
            System.out.println ("Nombre: " +producto.getNombre()+ "Cantidad: " +producto.getCantidad());
        }

        listaproducto.clear();
    }
}
