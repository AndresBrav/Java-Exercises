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

    public void moverX(int pasos) {
        posicion.setPosx(pasos);
    }

    public void moverY(int pasos) {
        posicion.setPosy(pasos);
    }

    public int obtenerPosX() {
        return posicion.getPosx();
    }

    public int obtenerPosY() {
        return posicion.getPosy();
    }

    public String getNombre() {
        return nombre;
    }

}
