package evaluacion2.funciones;

public class EJ7 {
    public static void main(String[] args) {

        System.out.print ("Introduce el ancho del rectangulo: ");
        double ancho = Double.parseDouble(System.console().readLine());

        System.out.print ("\nIntroduce la altura del rectangulo: ");
        double altura = Double.parseDouble(System.console().readLine());

        System.out.println ("El perimetro del rectangulo es: " +evaluacion2.funciones.misfunciones.TodasFunciones.perimetroRectangulo(ancho, altura));
        System.out.println ("El area del rectangulo es: " +evaluacion2.funciones.misfunciones.TodasFunciones.areaRectangulo(ancho, altura));
    }
}
