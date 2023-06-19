package evaluacion3.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EJ2 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));

            String leer = "";
            while (leer != null) {
                System.out.println (leer + "  ");
                leer = br.readLine();
            }

            br.close();

        } catch (IOException e) {
            System.out.println ("Error.");
        }
    }
}
