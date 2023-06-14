package evaluacion2.funciones.misfunciones;

public class TodasFunciones {
    
    public static double multiplica(int n, int y) {	
			double total=n*y;
			return total; 
		}
		
		public static int minimo(int n, int y) {	
			int menor =y;
			if(n<y){
			menor=n;
			}
			return menor; 
		}
		
		public static int dimesigno(int n) {	
			int test=0;
			if(n<0){
				test=-1;
			} else if(n==0){
				test=0;
		    } else if(n>0){
				test=1;
			}  
			return test; 
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
		
		public static int producto1aN(int n) {	
			int total=1;	
			for(int i=1;i<=n;i++){
				total=total*i;				
			}
		    return total;
		}
		
		public static double intermedio1aN(int n) {	
			double total=0;
			for(int i=1;i<=n;i++){
					total++;				
				}
			total=total/2;
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

        public static boolean esCapicua(long x) {	
            boolean capicua = false;
            if (x < 10) {
            capicua = true;
            } else if((x >= 10)&&(x < 100)) {
            if ((x / 10)==(x % 10)) {
            capicua = true;
            }
            } else if((x >= 100)&&(x < 1000)) {
            if ((x / 100)==(x % 10)) {
            capicua = true;
            }
            } else if((x >= 1000)&&(x < 10000)) {
            if (((x / 1000)==(x % 10))&&((( x / 100 ) % 10)==(( x / 10) % 10))) {
            capicua = true;
            }
            } else if(x >= 10000) {
            if (((x/ 10000) == (x % 10) )&&((((x / 1000) % 10))==((x / 10) % 10))) {
            capicua = true;
            }
            } 
            return capicua;
        }
  
  
        public static boolean esPrimo(long x) {
		    boolean vig=false;
            long calcu;
            for (int i=2;i<x;i++) {
			    calcu=x%i;
                if (calcu==0) {
                vig=true;
                }
            } 
            return vig;
        }
  
        public static long siguientePrimo(long x) {
		    boolean vig=false;
            long calcu;
            while(vig==false){
			    for (int i=2;i<x;i++) {
				    calcu=x%i;
				    if (calcu==0) {
					vig=true;
				    }
			    }
			    x++;
            }
            return x;
	    }
	
	    public static int potencia (int base, int exponente) {
            int total=1;
		    if (exponente>0){
                for (int i=0;i<exponente;i++) {
                total= base * total;
			    }       
             } 
            if (exponente<0) {
                for (int i = 0; i < exponente; i++) {
                total= base* total;				
			    }
			total=1/total;
		    }
            if(exponente==0){
			    total=1;
		    }
		    return total;
	    }
	
	    public static int digitos (long x) { 
            int cont = 1;
            while (x > 10) {
                cont++;
                x=x/10;
                }    
		    return cont;
        }  
  
        public static long voltear(long x) {
            long alReves=0;
            while (x > 0) {
                alReves = (alReves * 10) + (x % 10);
                x /= 10;
            }     
            return alReves;
        }
  
        public static long posicionDeDigito(long x,int y) {
            long alReves=0;
            int test= -1;
            long num=0;
            int cont=0;
            while (x > 0) {
                alReves = (alReves * 10) + (x % 10);
                x /= 10;
                }    
            while((alReves>0)&&(test!=cont)){
			    num=alReves % 10;
			    alReves /= 10;
			    cont++;
			    if (num==y){
				    test=cont;
			    }	
		    }
            return test;
        }
  
        public static long quitaPorDetras(long x, int y) {
            for(int i=0;i<y;i++) {
                x /= 10;
            }     
            return x;
        }
  
        public static long quitaPorDelante(long x, int y) {
            long alReves=0;
            long derecho=0;
            while (x > 0) {
                alReves = (alReves * 10) + (x % 10);
                x /= 10;
            }
            for(int i=0;i<y;i++) {
                alReves /= 10;
            }
            while (alReves > 0) {
                derecho = (derecho * 10) + (alReves % 10);
                alReves /= 10;
            }     
            return derecho;
        }
  
        public static long pegaPorDetras(long x, int y) {
		    x=x*10;
		    x=x+y;     
            return x;
        }
  
        public static long pegaPorDelante(long x, int y) {
            long alReves=0;
            long derecho=0;
            while (x > 0) {
                alReves = (alReves * 10) + (x % 10);
                x /= 10;
            }
		    alReves=alReves*10;
		    alReves=alReves+y;
            while (alReves > 0) {
                derecho = (derecho * 10) + (alReves % 10);
                alReves /= 10;
            }     
            return derecho;
        }
  
        public static long trozoDeNumero(long x, int y,int z) {
            long alReves=0;
            long derecho=0;
            int cont=0;
            for(int i=0;i<y;i++) {
                x /= 10;
            }     
            while (x > 0) {
                alReves = (alReves * 10) + (x % 10);
                x /= 10;
                cont++;
            }
            for(int i=0;i<cont-z;i++) {
                alReves /= 10;
            }
            while (alReves > 0) {
                derecho = (derecho * 10) + (alReves % 10);
                alReves /= 10;
            }     
            return derecho;
        }

        public static long juntaNumeros(long x, long y) {
		    long num1=x;
		    long num2=y;
		    long alReves=0;
		    while (y > 0) {
                alReves = (alReves * 10) + (y % 10);
                y /= 10; 
		    }   
		    while(num2>0){
			    num1=num1*10;
			    x = (x * 10) + (alReves % 10);
			    alReves/=10;	
		    }   
            return x;
        }
  
        public static int[] generaArrayInt(int n, int max, int min) {	
	        int [] array= new int [n];
	        for(int i=0;i<n;i++){
			    array[i]=(int)(Math.random()*((max-min)-1)+min);
	        } 
	        return array;
	    }
	
	    public static int minimoArrayInt(int n, int max, int min) {	
	        int [] minimoArray= new int [n];
	        minimoArray=generaArrayInt(n,max,min);
	        int menor=max;
	        for(int i=0;i<n;i++){
			    if(minimoArray[i]<menor){
				    menor=minimoArray[i];
			    }
		    } 
	        return menor;
	    }
	
	    public static int maximoArrayInt(int n, int max, int min) {	
	        int [] maximoArray= new int [n];
	        maximoArray=generaArrayInt(n,max,min);
	        int maximo=min;
	        for(int i=0;i<n;i++){
			    if(maximoArray[i]>maximo){
				    maximo=maximoArray[i];
			    }
		    } 
	        return maximo;
	    }
	
	    public static int mediaArrayInt(int n, int max, int min) {	
	        int [] mediaArray= new int [n];
	        mediaArray=generaArrayInt(n,max,min);
	        int media=0;
	        for(int i=0;i<n;i++){
			    media=media+mediaArray[i];
		    } 
	        return media;
	    }
	
	    public static boolean estaEnArrayInt(int n, int max, int min,int testeo) {	
	        int [] Array= new int [n];
	        Array=generaArrayInt(n,max,min);
	        for(int i=0;i<n;i++){
			    if(Array[i]==testeo){
				    return true;
			    }
		    } 
	        return false;
	    }
	
        public static int posicionEnArray(int n, int max, int min,int testeo) {	
	        int [] Array= new int [n];
	        Array=generaArrayInt(n,max,min);
	        int cont=0;
	        int i=0;
	        while(Array[i]!=testeo){
			    cont++;
			    i++;
		    }
		    return cont; 
	    }
	
	    public static int[] volteaArrayInt(int n, int max, int min) {	
	        int [] Array= new int [n];
	        int [] ArrayVolteado= new int [n];
	        Array=generaArrayInt(n,max,min);
	        for(int i=0;i<n;i++){
			    Array[i]=ArrayVolteado[n-i];			
		    } 
		    return ArrayVolteado; 
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
