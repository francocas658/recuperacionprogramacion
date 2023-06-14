package evaluacion2.funciones;

public class EJ9 {
    public static void main(String[] args) {

        System.out.println ("Introduce 3 numeros enteros: ");
        int i = Integer.parseInt(System.console().readLine());
        int j = Integer.parseInt(System.console().readLine());
        int n = Integer.parseInt(System.console().readLine());

        int maximo1 = evaluacion2.funciones.misfunciones.TodasFunciones.maximo(i, j);

        System.out.print ("\nEl máximo de los valores introducidos es: " +evaluacion2.funciones.misfunciones.TodasFunciones.maximo(n, maximo1));
    }
}
