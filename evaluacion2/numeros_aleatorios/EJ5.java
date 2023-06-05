package evaluacion2.numeros_aleatorios;

public class EJ5 {
    public static void main(String[] args) {

        System.out.println ("Este programa genera 50 numeros aleatorios del 100 al 199:");

        int max = 100;
        int min = 199;
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            int num = (int)(Math.random()*100) + 100;
            System.out.print(num+ " ");
            sum += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println ("\nEl numero máximo es: " +max);
        System.out.println ("El numero minimo es: " +min);
        System.out.println ("La media de todos es: " +sum/50);
        
    }
}