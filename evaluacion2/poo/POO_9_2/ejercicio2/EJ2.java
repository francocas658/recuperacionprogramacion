package evaluacion2.poo.POO_9_2.ejercicio2;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gatos[] gatos = new Gatos[5];

        for (int i = 0; i < 5; i++) {
            System.out.println ("Introduzca los datos del gato " + (i+1) + ": ");

            System.out.print ("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print ("Sexo: ");
            String sexo = scanner.nextLine();

            System.out.print ("Color: ");
            String color = scanner.nextLine();

            Gatos gato = new Gatos (nombre, color, sexo);
            gatos[i] = gato;

            System.out.println();
        }

        System.out.println ("Datos de los gatos: ");

        for (int i = 0; i < 5; i++) {
            System.out.println ("Gato " + (i+1));
            System.out.println ("Nombre: " + gatos[i].getNombre());
            System.out.println ("Sexo: " + gatos[i].getSexo());
            System.out.println ("Color: " + gatos[i].getColor());
            System.out.println();
        }

        scanner.close();
    }
}
