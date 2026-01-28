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
    private String direccionTorneta = "D";

    private ProyectilAntitanque antitanque;
    private ProyectilExplosivo explosivo;
    private ProyectilNormal normal;
    private ProyectilPerforante perforante;

    public Blindado(Posicion posblindado, String nombre, int espesorBlindaje, boolean turno) {
        super(posblindado, nombre);
        this.espesorBlindaje = espesorBlindaje;
        this.turno = turno;
        this.antitanque = new ProyectilAntitanque(new Posicion(), "proAnti", 150, "AT");
        this.explosivo = new ProyectilExplosivo(new Posicion(), "proExplo", 100, "EX");
        this.normal = new ProyectilNormal(new Posicion(), "proNormal", 50, "NO");
        this.perforante = new ProyectilPerforante(new Posicion(), "proPerfora", 200, "PE");
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

    public String getDireccionTorneta() {
        return direccionTorneta;
    }

    public void setDireccionTorneta(String direccionTorneta) {
        this.direccionTorneta = direccionTorneta;
    }

    // retornar proyectiles
    public ProyectilAntitanque getAntitanque() {
        return antitanque;
    }

    public ProyectilExplosivo getExplosivo() {
        return explosivo;
    }

    public ProyectilNormal getNormal() {
        return normal;
    }

    public ProyectilPerforante getPerforante() {
        return perforante;
    }

}
