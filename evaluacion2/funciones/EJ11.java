package evaluacion2.funciones;

public class EJ11 {
    public static void main(String[] args) {

        System.out.print ("Introduce un numero para saber su tabla de multiplicar: ");
        int i = Integer.parseInt(System.console().readLine());

        evaluacion2.funciones.misfunciones.TodasFunciones.tablaMultiplicar(i);
    }
}
