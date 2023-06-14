package evaluacion2.funciones;

public class EJ3 {
    public static void main(String[] args) {

        System.out.println ("Introduzca dos numeros enteros: ");
        int i = Integer.parseInt(System.console().readLine());
        int j = Integer.parseInt(System.console().readLine());

        System.out.println ("El minimo entre " +i+ " y " +j+ " es: " +evaluacion2.funciones.misfunciones.TodasFunciones.minimo(i,j));
    }
}
