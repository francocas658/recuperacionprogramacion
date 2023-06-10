package evaluacion2.arrays.unadimension;

public class EJ8 {
    public static void main (String[] args) {

        int mes = 12;
        int[] temp = new int[mes];
        
        for (int i = 0; i < mes; i++) {
            System.out.print ("Indica la temperatura media del mes " +(i+1)+ " :");
            temp[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < mes; i++) {
            System.out.print ("Mes " +(i+1)+ "      ");

            for (int j = 0; j < temp[i]; j++){
                System.out.print ("#");
            }

            System.out.println();
        }
    }
}
