package evaluacion2.funciones.misfunciones;

public class TodasFunciones {
		
		public static int minimo(int n, int y) {	
			int menor =y;
			if(n<y){
			menor=n;
			}
			return menor; 
		}
		
		public static double perimetroRectangulo(double n, double y) {	
			double total=n+n+y+y;
			return total; 
		}
		
		public static double areaRectangulo(double n, double y) {	
			double total=(n*y)/2;
			return total; 
		}
        
		public static int suma1aN(int n) {
			int total=0;	
			for(int i=1; i<=n; i++){
				total += i;				
			}
		    return total;
		}
		
		public static int maximo(int n, int y) {	
			int maximo = n;
			if(n<y){
			maximo=y;
			}
			return maximo; 
		}

		public static void tablaMultiplicar(int n) {	
			int ope;
			for(int i=1;i<=10;i++){
				ope=i*n;
				System.out.println(n+"x"+i+" = "+ope);	
			}
		}
		public static void arrayDe1a100(int n) {
			int [] Array= new int [n];	
			for(int i=0;i<n;i++){
				Array[i]=i+1;
				System.out.print(Array[i]+" ");	
			}
		}
		public static int media(int n) {	
			int media=0;
			int [] Array= new int [n];
			for(int i=0;i<n;i++){
				Array[i]=i+1;
			}
			for(int i=0;i<n;i++){
				media=media + Array[i];
			} 
		    return media;
		}

        public static int menu() {
            System.out.println("MENU");
            System.out.println("1. Circunferencia");
            System.out.println("2. Area");
            System.out.print("Ingrese el número de la opción elegida: ");
            int opcion = Integer.parseInt(System.console().readLine());
            return opcion;
        }
    
        public static double pideRadio() {
            System.out.print("Ingrese el radio: ");
            double radio = Double.parseDouble(System.console().readLine());
            return radio;
        }
    
        public static double circunferencia(double r) {
            return 2 * Math.PI * r;
        }
    
        public static double area(double r) {
            return Math.PI * r * r;
        }
}
