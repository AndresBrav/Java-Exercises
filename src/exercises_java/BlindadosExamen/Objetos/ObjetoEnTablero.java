/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_java.BlindadosExamen.Objetos;

/**
 *
 * @author Asus
 */
public class ObjetoEnTablero {

    protected Posicion posicion;
    protected String nombre;

    public ObjetoEnTablero(Posicion posicion, String nombre) {
        this.posicion = posicion;
        this.nombre = nombre;
    }

    public void moverFila(int pasos) {
        posicion.setFila(pasos);
    }

    public void moverColumna(int pasos) {
        posicion.setColumna(pasos);
    }

    public int obtenerFila() {
        return posicion.getFila();
    }

    public int obtenerColumna() {
        return posicion.getColumna();
    }

    public String getNombre() {
        return nombre;
    }

}
