package evaluacion2.funciones;

public class EJ21 {
    public static void main (String[] args) {

        int opcion = evaluacion2.funciones.misfunciones.TodasFunciones.menu();
        
        switch (opcion) {
            case 1:
                double radio = evaluacion2.funciones.misfunciones.TodasFunciones.pideRadio();
                double circunferencia = evaluacion2.funciones.misfunciones.TodasFunciones.circunferencia(radio);
                System.out.println("La circunferencia es: " + circunferencia);
                break;
            case 2:
                double radio2 = evaluacion2.funciones.misfunciones.TodasFunciones.pideRadio();
                double area = evaluacion2.funciones.misfunciones.TodasFunciones.area(radio2);
                System.out.println("El area es: " + area);
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }
    }
}

