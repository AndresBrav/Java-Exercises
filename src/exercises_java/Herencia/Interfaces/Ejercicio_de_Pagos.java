/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_java.Herencia.Interfaces;

/**
 *
 * @author Asus
 */
public class Ejercicio_de_Pagos {

    public static void main(String[] args) {
        
        TarjetaCredito t1 = new TarjetaCredito("123548", "BCP");
        PayPal p1 = new PayPal("bravoandres1706@gmail.com");
        TransferenciaBancaria tr1 = new TransferenciaBancaria("Economico");
        MetodoPago[] metodos = {t1,p1,tr1};

        for (MetodoPago i : metodos){
            System.out.println("Metodo: "+i.getClass().getSimpleName());
            i.pagar(204);
            System.out.println("Comision: "+i.obtenerComision(204));
            System.out.println("");
        }
    }
}

interface MetodoPago {

    public abstract void pagar(double monto); //completo pero solo seria void pagar(double monto);

    public abstract double obtenerComision(double monto); //completo pero solo seria double obtenerComision(double monto);
    
    
}

class TarjetaCredito implements MetodoPago {

    private String numeroTarjeta;

    private String banco;

    public TarjetaCredito(String numeroTarjeta, String banco) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    @Override
    public double obtenerComision(double monto) {
        return monto * 0.05;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta aprobado por el banco " + banco + " por $" + monto);
    }
}

class PayPal implements MetodoPago {

    private String correo;

    public PayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public double obtenerComision(double monto) {
        return monto * 0.03;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta aprobado por el banco " + correo + " por $" + monto);
    }
}

class TransferenciaBancaria implements MetodoPago {

    private String bancoOrigen;

    public TransferenciaBancaria(String bancoOrigen) {
        this.bancoOrigen = bancoOrigen;
    }

    @Override
    public double obtenerComision(double monto) {
        return 2;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta aprobado por el banco " + bancoOrigen + " por $" + monto);
    }
}