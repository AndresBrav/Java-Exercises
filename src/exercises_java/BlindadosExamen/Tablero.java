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

import java.util.Scanner;

public class Tablero {

    private ObjetoEnTablero[][] tablero;

    public Tablero() {
        tablero = new ObjetoEnTablero[6][10];
    }

    public void IncializarElementos() {

        // ObjetoEnTablero[][] tablero = new ObjetoEnTablero[6][10];

        // fila 1
        tablero[0][0] = new Muro(new Posicion(0, 0), "m", 500);
        tablero[0][1] = new Muro(new Posicion(0, 1), "m", 500);
        tablero[0][2] = new Muro(new Posicion(0, 2), "m", 500);
        tablero[0][3] = new Muro(new Posicion(0, 3), "m", 500);
        tablero[0][4] = new Muro(new Posicion(0, 4), "m", 500);
        tablero[0][5] = new Muro(new Posicion(0, 5), "m", 500);
        tablero[0][6] = new Muro(new Posicion(0, 6), "m", 500);
        tablero[0][7] = new Muro(new Posicion(0, 7), "m", 500);
        tablero[0][8] = new Muro(new Posicion(0, 8), "m", 500);
        tablero[0][9] = new Muro(new Posicion(0, 9), "m", 500);

        // fila2
        tablero[1][0] = new Camino(new Posicion(1, 0), "c");
        // tablero[1][1] = new Camino(new Posicion(1, 1), "camino");
        tablero[1][1] = new Blindado(new Posicion(1, 1), "B 1", 50, true);
        tablero[1][2] = new Camino(new Posicion(1, 2), "c");
        tablero[1][3] = new Camino(new Posicion(1, 3), "c");
        tablero[1][4] = new Camino(new Posicion(1, 4), "c");
        tablero[1][5] = new Camino(new Posicion(1, 5), "c");
        tablero[1][6] = new Camino(new Posicion(1, 6), "c");
        tablero[1][7] = new Camino(new Posicion(1, 7), "c");
        tablero[1][8] = new Camino(new Posicion(1, 8), "c");
        tablero[1][9] = new Muro(new Posicion(1, 9), "m", 500);

        // fila 3
        tablero[2][0] = new Muro(new Posicion(2, 0), "m", 500);
        tablero[2][1] = new Muro(new Posicion(2, 1), "m", 500);
        tablero[2][2] = new Muro(new Posicion(2, 2), "m", 500);
        tablero[2][3] = new Muro(new Posicion(2, 3), "m", 500);
        tablero[2][4] = new Muro(new Posicion(2, 4), "m", 500);
        tablero[2][5] = new Muro(new Posicion(2, 5), "m", 500);
        tablero[2][6] = new Muro(new Posicion(2, 6), "m", 500);
        tablero[2][7] = new Muro(new Posicion(2, 7), "m", 500);
        tablero[2][8] = new Camino(new Posicion(2, 8), "c");
        tablero[2][9] = new Muro(new Posicion(2, 9), "m", 500);

        // fila4
        tablero[3][0] = new Camino(new Posicion(3, 0), "c");
        tablero[3][1] = new Camino(new Posicion(3, 1), "c");
        tablero[3][2] = new Camino(new Posicion(3, 2), "c");
        tablero[3][3] = new Camino(new Posicion(3, 3), "c");
        tablero[3][4] = new Camino(new Posicion(3, 4), "c");
        tablero[3][5] = new Camino(new Posicion(3, 5), "c");
        // tablero[3][6] = new Camino(new Posicion(3, 6), "camino");
        tablero[3][6] = new Blindado(new Posicion(3, 6), "B 2", 50, false);
        tablero[3][7] = new Camino(new Posicion(3, 7), "c");
        tablero[3][8] = new Camino(new Posicion(3, 8), "c");
        tablero[3][9] = new Camino(new Posicion(3, 9), "c");

        // fila5
        tablero[4][0] = new Camino(new Posicion(4, 0), "c");
        tablero[4][1] = new Muro(new Posicion(4, 1), "m", 500);
        tablero[4][2] = new Camino(new Posicion(4, 2), "c");
        tablero[4][3] = new Muro(new Posicion(4, 3), "m", 500);
        tablero[4][4] = new Camino(new Posicion(4, 4), "c");
        tablero[4][5] = new Muro(new Posicion(4, 5), "m", 500);
        tablero[4][6] = new Camino(new Posicion(4, 6), "c");
        tablero[4][7] = new Muro(new Posicion(4, 7), "m", 500);
        tablero[4][8] = new Muro(new Posicion(4, 8), "m", 500);
        tablero[4][9] = new Muro(new Posicion(4, 9), "m", 500);

        // fila6
        tablero[5][0] = new Camino(new Posicion(5, 0), "c");
        tablero[5][1] = new Muro(new Posicion(5, 1), "m", 500);
        tablero[5][2] = new Camino(new Posicion(5, 2), "c");
        tablero[5][3] = new Muro(new Posicion(5, 3), "m", 500);
        tablero[5][4] = new Camino(new Posicion(5, 4), "c");
        tablero[5][5] = new Muro(new Posicion(5, 5), "m", 500);
        tablero[5][6] = new Camino(new Posicion(5, 6), "c");
        tablero[5][7] = new Camino(new Posicion(5, 7), "c");
        tablero[5][8] = new Camino(new Posicion(5, 8), "c");
        tablero[5][9] = new Camino(new Posicion(5, 9), "c");
    }

    public void JugarPartida() {

        ObjetoEnTablero blindado = tablero[1][1];
        ObjetoEnTablero blindadootro = tablero[3][6];

        Blindado blindado1 = (Blindado) blindado;
        Blindado blindado2 = (Blindado) blindadootro;
        // System.out.println(blindado1.getEspesorBlindaje());
        boolean JugarPartida = true;

        // System.out.println(direccion);
        while (JugarPartida) {

            if (blindado1.isTurno()) {
                System.out.println("Turno del blindado 1");
                int fila = blindado1.obtenerFila();
                int col = blindado1.obtenerColumna();
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese dirección (W=Arriba, A=Izquierda, S=Abajo, D=Derecha): ");
                String direccion = sc.nextLine().toUpperCase();

                if (direccion.equals("W")) {
                    System.out.println("Movimiento hacia arriba");
                    if (tablero[fila - 1][col] instanceof Camino) {
                        tablero[fila - 1][col] = blindado1;
                        blindado1.moverFila(fila - 1); // actualizamos fila del blindado
                        blindado1.setTurno(false); // cambiamos turno
                        blindado1.setDireccionTorneta("W"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true); // cambiamos turno
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c"); // creamos un camino
                    }

                    if (tablero[fila - 1][col] instanceof Muro) {
                        System.out.println("no puedes moverte hay un muro");
                        blindado1.setTurno(false); // cambiamos turno
                        blindado1.setDireccionTorneta("W"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true); // cambiamos turno
                    }

                } else if (direccion.equals("A")) {
                    System.out.println("Movimiento hacia la izquierda");
                    if (tablero[fila][col - 1] instanceof Camino) {
                        tablero[fila][col - 1] = blindado1;
                        blindado1.moverColumna(col - 1);
                        blindado1.setTurno(false);
                        blindado1.setDireccionTorneta("A");
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true);
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c");
                    }

                    if (tablero[fila][col - 1] instanceof Muro) {
                        System.out.println("No puedes moverte, hay un muro");
                        blindado1.setTurno(false);
                        blindado1.setDireccionTorneta("A");
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true);
                    }
                } else if (direccion.equals("S")) {
                    System.out.println("Movimiento hacia abajo");
                    if (tablero[fila + 1][col] instanceof Camino) {
                        tablero[fila + 1][col] = blindado1;
                        blindado1.moverFila(fila + 1);
                        blindado1.setTurno(false);
                        blindado1.setDireccionTorneta("S");
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true);
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c");
                    }

                    if (tablero[fila + 1][col] instanceof Muro) {
                        System.out.println("No puedes moverte, hay un muro");
                        blindado1.setTurno(false);
                        blindado1.setDireccionTorneta("S");
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true);
                    }
                } else if (direccion.equals("D")) {
                    System.out.println("Movimiento hacia la derecha");
                    if (tablero[fila][col + 1] instanceof Camino) {
                        tablero[fila][col + 1] = blindado1; // movemos el blindado
                        blindado1.moverColumna(col + 1); // actualizamos fila del blindado
                        blindado1.setTurno(false); // cambiamos turno
                        blindado1.setDireccionTorneta("D"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true); // cambiamos turno
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c"); // creamos un camino
                    }

                    if (tablero[fila][col + 1] instanceof Muro) {
                        System.out.println("no puedes moverte hay un muro");
                        blindado1.setTurno(false); // cambiamos turno
                        blindado1.setDireccionTorneta("D"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 1: " + blindado1.getDireccionTorneta());

                        blindado2.setTurno(true); // cambiamos turno
                    }
                } else {
                    System.out.println("Movimiento invalido");
                }

            }
            mostrarTablero();

            if (blindado2.isTurno()) {

                System.out.println("Turno del blindado 2");
                int fila = blindado2.obtenerFila();
                int col = blindado2.obtenerColumna();
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese dirección (W=Arriba, A=Izquierda, S=Abajo, D=Derecha): ");
                String direccion = sc.nextLine().toUpperCase();

                if (direccion.equals("W")) {
                    System.out.println("Movimiento hacia arriba");
                    if (tablero[fila - 1][col] instanceof Camino) {
                        tablero[fila - 1][col] = blindado2;
                        blindado2.moverFila(fila - 1); // actualizamos fila del blindado
                        blindado2.setTurno(false); // cambiamos turno
                        blindado2.setDireccionTorneta("W"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true); // cambiamos turno
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c"); // creamos un camino
                    }

                    if (tablero[fila - 1][col] instanceof Muro) {
                        System.out.println("no puedes moverte hay un muro");
                        blindado2.setTurno(false); // cambiamos turno
                        blindado2.setDireccionTorneta("W"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true); // cambiamos turno
                    }

                } else if (direccion.equals("A")) {
                    System.out.println("Movimiento hacia la izquierda");
                    if (tablero[fila][col - 1] instanceof Camino) {
                        tablero[fila][col - 1] = blindado2;
                        blindado2.moverColumna(col - 1);
                        blindado2.setTurno(false);
                        blindado2.setDireccionTorneta("A");
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true);
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c");
                    }

                    if (tablero[fila][col - 1] instanceof Muro) {
                        System.out.println("No puedes moverte, hay un muro");
                        blindado2.setTurno(false);
                        blindado2.setDireccionTorneta("A");
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true);
                    }
                } else if (direccion.equals("S")) {
                    System.out.println("Movimiento hacia abajo");
                    if (tablero[fila + 1][col] instanceof Camino) {
                        tablero[fila + 1][col] = blindado2;
                        blindado2.moverFila(fila + 1);
                        blindado2.setTurno(false);
                        blindado2.setDireccionTorneta("S");
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true);
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c");
                    }

                    if (tablero[fila + 1][col] instanceof Muro) {
                        System.out.println("No puedes moverte, hay un muro");
                        blindado2.setTurno(false);
                        blindado2.setDireccionTorneta("S");
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true);
                    }
                } else if (direccion.equals("D")) {
                    System.out.println("Movimiento hacia la derecha");
                    if (tablero[fila][col + 1] instanceof Camino) {
                        tablero[fila][col + 1] = blindado2; // movemos el blindado
                        blindado2.moverColumna(col + 1); // actualizamos fila del blindado
                        blindado2.setTurno(false); // cambiamos turno
                        blindado2.setDireccionTorneta("D"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true); // cambiamos turno
                        tablero[fila][col] = new Camino(new Posicion(fila, col), "c"); // creamos un camino
                    }

                    if (tablero[fila][col + 1] instanceof Muro) {
                        System.out.println("no puedes moverte hay un muro");
                        blindado2.setTurno(false); // cambiamos turno
                        blindado2.setDireccionTorneta("D"); // cambiamos direccion de la torneta
                        System.out.println("direccion torneta del blindado 2: " + blindado2.getDireccionTorneta());

                        blindado1.setTurno(true); // cambiamos turno
                    }
                } else {
                    System.out.println("Movimiento invalido");
                }

                // JugarPartida = false;
            }
            mostrarTablero();

            // sc.close();
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.printf("%-10s", tablero[i][j].getNombre());
            }
            System.out.println();
        }
    }
}
