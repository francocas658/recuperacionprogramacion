package evaluacion2.numeros_aleatorios;
/**
 * ESTE PROGRAMA GENERA UNA MELODIA ALEATORIA
 * 	
 * @author Franco Tomas Casco
 */
public class EJ15 {
    public static void main (String[] args) {

        int n = 4 * (int)(Math.random()*7 + 1);
        String nota = "";
        String nota1 = "";

        for (int i = 1; i <= n; i++ ) {

            switch ((int)(Math.random()*7)) {
                case 1: nota = "do"; break;
                case 2: nota = "re"; break;
                case 3: nota = "mi"; break;
                case 4: nota = "fa"; break;
                case 5: nota = "sol"; break;
                case 6: nota = "la"; break;
                case 7: nota = "si"; break;
                default:
            }

            if (i == 1) {
                nota1 = nota;
            } else if (i == n) {
                nota = nota1;
            }

            System.out.print (nota+ " ");

            if (i == n) {
                System.out.print ("||");
            } else if (i % 4 == 0) {
                System.out.print ("| ");
            }
        }
    }
}
