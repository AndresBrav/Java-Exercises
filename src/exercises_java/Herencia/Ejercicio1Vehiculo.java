/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_java.Herencia;

/**
 *
 * @author Asus
 */
public class Ejercicio1Vehiculo {

    public static void main(String[] args) {
        Vehiculo a = new Vehiculo("volkswagen", "cheep", 21);
        a.mostrarInformacion();
        a.arrancar();
        System.out.println("");
        
        Auto b = new Auto("Ferrari", "la ferrari", 250.0,4);
        b.mostrarInformacion();
        b.arrancar();
        System.out.println("");
        
        Moto c = new Moto("BMW","bmw 251", 240.0,"clasico");
        c.mostrarInformacion();
        c.arrancar();
    }

}

class Vehiculo {

    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("El vehiculo es de la marca " + marca
                + "\ntiene el modelo " + modelo
                + "\ntiene la velocidad " + velocidadMaxima);
    }

    public void arrancar() {
        System.out.println("el vehiculo esta arrancando");
    }

    @Override
    public String toString() {
        return "Clase " + this.getClass().getSimpleName() + " {"
                + "marca='" + marca + '\''
                + ", modelo='" + modelo + '\''
                + ", velocidadMaxima=" + velocidadMaxima
                + '}';
    }

}

class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String marca, String modelo, double velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El vehiculo es de la marca " + marca
                + "\ntiene el modelo " + modelo
                + "\ntiene la velocidad " + velocidadMaxima
                + "\nEl numero de puertas es " + numeroPuertas
        );
    }
    
    @Override
    public void arrancar() {
        System.out.println("El Auto esta arrancando");
    }
}

class Moto extends Vehiculo {

    private String tipoManubrio;

    public Moto(String marca, String modelo, double velocidadMaxima, String tipoManubrio) {
        super(marca, modelo, velocidadMaxima);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("El tipo de manubrio es "+ tipoManubrio);
        /*System.out.println("El vehiculo es de la marca " + marca
                + "\ntiene el modelo " + modelo
                + "\ntiene la velocidad " + velocidadMaxima
                + "\nEl tipo de manubrio es " + tipoManubrio
        );*/
    }
    
    @Override
    public void arrancar() {
        System.out.println("La moto esta arrancando");
    }
}
