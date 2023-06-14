package evaluacion2.poo.POO_9_1.ejercicio5;

public class Pizza {
    
    private static int pedidas;
    private static int servidas;
    private String tamaño, tipo, estado;

    public Pizza (String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.pedidas++;
    }

    public String toString() {
        return "Pizza " + this.tipo + " " + this.tamaño + " " + this.estado;
    }

    public static int getTotalPedidas() {
        return Pizza.pedidas;
    }

    public static int getTotalServidas() {
        return Pizza.servidas;
    }

    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.servidas++;
        } else {
            System.out.print ("Esa pizza ya se ha servido.");
        }
    }
}
