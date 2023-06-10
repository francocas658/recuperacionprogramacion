package evaluacion2.arrays.unadimension;

public class EJ4 {
    public static void main (String[] args) {
        
        int[] n = new int[20];
        int[] cuad = new int[20];
        int[] cub = new int[20];
        int i;

        for (i = 0; i < 20; i++) {
            n[i] = (int)(Math.random()*101);
            cuad[i] = n[i] * n[i];
            cub[i] = n[i] * n[i] * n[i];
        }

        System.out.println ("   Numero  |   Cuadrado    |   Cubo    |");

        for (i = 0; i < 20; i++){
            System.out.println ("   " +n[i]+ "      |   " +cuad[i]+ "  |    " +cub[i]+ "    |");
        }

    }
}
