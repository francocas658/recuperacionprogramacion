package evaluacion3.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EJ1 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 1; i < 501; i++) {
                if (evaluacion3.ficheros.esPrimo.esprimo(i)) {
                bw.write(String.valueOf(i) + "\n");
                }
            }

            bw.close();

        } catch (IOException ioe) {

            System.out.println("Existe un error en la escritura.");
        }
    }
}

