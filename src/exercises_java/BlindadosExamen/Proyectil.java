/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_java.BlindadosExamen;

import exercises_java.BlindadosExamen.Objetos.Posicion;

/**
 *
 * @author Asus
 */

import exercises_java.BlindadosExamen.Objetos.ObjetoEnTablero;

public class Proyectil extends ObjetoEnTablero {

    protected int cantidad;
    protected String tipo;

    public Proyectil(Posicion pos1, String nombre, int cantidad, String tipo) {
        super(pos1, nombre);
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public void cambiarCantidadProyectil() {
        cantidad = cantidad - 1;
    }

    public int retornarProyectiles() {
        return cantidad;
    }

    public String retornarTipo() {
        return tipo;
    }

}
