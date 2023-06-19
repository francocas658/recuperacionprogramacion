package evaluacion3.ficheros;

public class esPrimo {
    
    public static boolean esprimo (int n) {
        for (int i = 2; i < n; i++) {
            if((n % 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
