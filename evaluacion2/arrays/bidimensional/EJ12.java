package evaluacion2.arrays.bidimensional;

public class EJ12 {
    public static void main(String[] args) {
		
		int max = 0;
		int min = 1000;
		int med = 0;
		int cont = 0;
		
		int [][] n = new int [9][9];
		int [] diagonal = new int [9];
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				n[i][j] = (int)(Math.random() * 401 +500);
			}
			
		}
		
		for (int i = 8; i >= 0; i--) {

			diagonal[cont] = n[cont][i];

			if (max < n[cont][i]) {
					max = n[cont][i];
			}

			if (min > n[cont][i]) {
					min = n[cont][i];
			}

			med += n[cont][i];
			cont += 1;
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.printf("%10s", n[j][i]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("N Diagonal: ");
		
		for (int i = 0; i < 9; i++) {
			System.out.print ("  " +diagonal[i]);
		}
		
		
		System.out.println();
		System.out.println ("Maximo: " +max);
		System.out.println ("Minimo: " +min);
		System.out.println ("Media: " +med/10);
		
	}
}
