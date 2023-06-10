package evaluacion2.arrays.bidimensional;

public class EJ2 {
    public static void main(String[] args) 
    throws InterruptedException {

        int[][] n = new int[4][5];
        int fila;
        int col;

        System.out.println ("Introducir 20 numeros enteros en sus celdas correspondientes: ");

        for (fila = 0; fila < 4; fila++) {
            for (col = 0; col < 5; col++) {
                System.out.print ("Fila " +(fila+1)+ " columna " +(col+1)+ ": ");
                n[fila][col] = Integer.parseInt(System.console().readLine());
            }
        }

        int sumfila;
        int sumcol;
        int sumtotal = 0;

        for (fila = 0; fila < 4; fila++) {
            sumfila = 0;
            for (col = 0; col < 5; col++) {
                System.out.print ("  " +n[fila][col]);
                sumfila += n[fila][col];
            }
            
            System.out.print ("\n   " +sumfila);
        }

        System.out.println ();

        for (col = 0; col < 5; col++) {
            sumcol = 0;
            for (fila = 0; fila < 4; fila++) {
                System.out.print ("  " +n[fila][col]);
                sumcol += n[fila][col];
            }
            
            sumtotal += sumcol;
            System.out.print ("\n   " +sumcol);
        }
        
        System.out.print ("\n   " +sumtotal);
    }
}
