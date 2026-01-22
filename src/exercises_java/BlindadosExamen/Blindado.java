/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_java.BlindadosExamen;

/**
 *
 * @author Asus
 */
import exercises_java.BlindadosExamen.Objetos.Posicion;
import exercises_java.BlindadosExamen.Objetos.ObjetoEnTablero;

public class Blindado extends ObjetoEnTablero {

    private int espesorBlindaje;
    private boolean turno;

    public Blindado(Posicion posblindado,String nombre,int espesorBlindaje, boolean turno) {
        super(posblindado,nombre);
        this.espesorBlindaje = espesorBlindaje;
        this.turno = turno;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getEspesorBlindaje() {
        return espesorBlindaje;
    }

    public void setEspesorBlindaje(int espesorBlindaje) {
        this.espesorBlindaje = espesorBlindaje;
    }

}
