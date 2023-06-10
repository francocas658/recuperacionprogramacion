package evaluacion2.arrays.unadimension;

public class EJ18 {
    public static void main(String[] args) {

        int[] n = new int[10];
        int[] men = new int[10];
        int[] may = new int[10];
        int contmen = 0;
        int contmay = 0;

        for (int i = 0; i < 10; i++) {
            n[i] = (int)(Math.random()*201);

            if (n[i] < 100) {
                men[contmen++] = n[i];
            } else {
                may[contmay++] = n[i];
            }
        }

        System.out.println("Array original: ");
        System.out.print (" Indice |    " );

        for (int i = 0; i < 10; i++) {
            System.out.print (i+ "  | ");
        }
        System.out.print("\n Valor |  ");

        for (int i = 0; i < 10; i++) {
            System.out.print (n[i]+ "   | ");
        }
        
        int[] total = new int[10];
        int totmen = 0;
        int totmay = 0;
        int j = 0;

        do { 

            if (totmen < contmen) {
                total[j++] = men[totmen++];
            }

            if (totmay < contmay) {
                total[j++] = may[totmay++];
            }

        } while (j < 10);

        System.out.println ("\nResultado: ");
        System.out.print ("Indice |  ");

        for (int i = 0; i < 10; i++) {
            System.out.print (i+ "  | ");
        }
        System.out.print("\n Valor |  ");

        for (int i = 0; i < 10; i++) {
            System.out.print (total[i]+ "   | ");
        }

        System.out.println();
    }
}
