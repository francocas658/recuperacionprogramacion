package evaluacion2.poo.POO_9_1.ejercicio11;
import java.text.DecimalFormat;

public class TarjetaRegalo {
    
    String numero;
    double saldo;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numero = "";
        for (int i = 0; i < 5; i++) {
            this.numero += (int)(Math.random()*10);
        }
    }

    @Override
    public String toString() {
        DecimalFormat dosDec = new DecimalFormat("0.00");
        return "Tarjeta nº " + numero + " -Saldo " + dosDec.format(saldo);
    }

    void gasta(double gasto) {
        if (gasto > saldo) {
            System.out.println ("No tiene saldo suficiente para gastar: " +gasto);
        } else {
            saldo -= gasto;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        double nuevoSaldo = this.getSaldo() + t.getSaldo();
        this.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
    }
}
