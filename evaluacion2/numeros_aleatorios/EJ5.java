package evaluacion2.numeros_aleatorios;
/**
 * ESTE PROGRAMA GENERA 50 NUMEROS ALEATORIOS ENTRE LOS NUMERO 100 Y 199 E INDICA EL MAXIMO, MINIMO Y LA MEDIA DE TODOS
 * 	
 * @author Franco Tomas Casco
 */
public class EJ5 {
    public static void main(String[] args) {

        System.out.println ("Este programa genera 50 numeros aleatorios del 100 al 199:");

        int max = 100;
        int min = 199;
        int suma = 0;

        for (int i = 1; i <= 50; i++) {
            int num = (int)(Math.random()*100) + 100;
            System.out.print(num+ " ");
            suma += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println ("\nEl numero máximo es: " +max);
        System.out.println ("El numero minimo es: " +min);
        System.out.println ("La media de todos es: " +suma/50);
        
    }
}