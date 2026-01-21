/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_java.Herencia.Abstract;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Ejercicio2Vehiculo {
    public static void main(String[] args) {
        
        Auto a1 = new Auto("123ABC","Toyota","Corolla",700);
        
        Moto m1 = new Moto("456DEF","Yamaha","R3",300);
        
        Camion c1 = new Camion("F4dsd","Volvo","F4",500);
    
        Vehiculo[] vehiculos = {a1,m1,c1};
        
        for (Vehiculo i:vehiculos){
            i.mostrarDatos();
            System.out.println("Costo de Mantenimiento: "+i.calcularMantenimiento());
            System.out.println("");
        }
    }
}

abstract class Vehiculo{
    protected String placa;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarDatos(){
        System.out.println("Placa: " + placa
                + "\nMarca: " + marca
                + "\nModelo: " + modelo);
    }
    
    public abstract double calcularMantenimiento();
}


class Auto extends Vehiculo {
    private double kilometrosRecorridos;
    
    public Auto(String placa, String marca, String modelo,double kilometrosRecorridos){
        super(placa,marca,modelo);
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    @Override
    public double calcularMantenimiento(){
        return kilometrosRecorridos * 0.5 ; 
    }

}

class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto(String placa, String marca, String modelo,int cilindrada){
        super(placa,marca,modelo);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public double calcularMantenimiento(){
        int costo = (cilindrada > 500) ? 200 : 100;
        return costo;
    }
}

class Camion extends Vehiculo {
    private int capacidadCarga;
    
    public Camion(String placa, String marca, String modelo,int capacidadCarga){
        super(placa,marca,modelo);
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public double calcularMantenimiento(){
        return capacidadCarga * 150;
    }
}