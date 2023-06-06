package evaluacion2.numeros_aleatorios;
/**
 * ESTE PROGRAMA GENERA UNA CUBA PIDIENDO LA CAPACIDAD TOTAL Y LLENANDOLA CON UN NUMERO DE LITROS MENOR A LA CAPACIDAD DE FORMA ALEATORIA
 * 	
 * @author Franco Tomas Casco
 */
public class EJ20 {
    public static void main (String[] args) {
        
        System.out.print ("Indica la capacidad de la cuba en litros: ");
        int cap = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < cap; i++) {

            int l = (int)(Math.random() * (cap + 1));

            if (i < (cap - l)) {
                System.out.println ("|     |");
            } else {
                System.out.println ("|=====|");
            }
        }

        System.out.println ("|#####|");
    }
}
