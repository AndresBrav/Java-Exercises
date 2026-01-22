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

public class Muro extends ObjetoEnTablero {

    private int Grosor;

    public Muro(Posicion pos, String nombre, int grosor) {
        super(pos, nombre);
        Grosor = grosor;

    }

    public int getGrosor() {
        return Grosor;
    }

    public void setGrosor(int Grosor) {
        this.Grosor = Grosor;
    }

}
