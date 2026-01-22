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

public class Tablero {

    private ObjetoEnTablero[][] tablero;

    public Tablero() {
        tablero = new ObjetoEnTablero[6][10];
    }

    public void IncializarElementos() {

        // ObjetoEnTablero[][] tablero = new ObjetoEnTablero[6][10];

        // fila 1
        tablero[0][0] = new Muro(new Posicion(0, 0), "muro", 500);
        tablero[0][1] = new Muro(new Posicion(0, 1), "muro", 500);
        tablero[0][2] = new Muro(new Posicion(0, 2), "muro", 500);
        tablero[0][3] = new Muro(new Posicion(0, 3), "muro", 500);
        tablero[0][4] = new Muro(new Posicion(0, 4), "muro", 500);
        tablero[0][5] = new Muro(new Posicion(0, 5), "muro", 500);
        tablero[0][6] = new Muro(new Posicion(0, 6), "muro", 500);
        tablero[0][7] = new Muro(new Posicion(0, 7), "muro", 500);
        tablero[0][8] = new Muro(new Posicion(0, 8), "muro", 500);
        tablero[0][9] = new Muro(new Posicion(0, 9), "muro", 500);

        // fila2
        tablero[1][0] = new Camino(new Posicion(1, 0), "camino");
        tablero[1][1] = new Camino(new Posicion(1, 1), "camino");
        tablero[1][2] = new Camino(new Posicion(1, 2), "camino");
        tablero[1][3] = new Camino(new Posicion(1, 3), "camino");
        tablero[1][4] = new Camino(new Posicion(1, 4), "camino");
        tablero[1][5] = new Camino(new Posicion(1, 5), "camino");
        tablero[1][6] = new Camino(new Posicion(1, 6), "camino");
        tablero[1][7] = new Camino(new Posicion(1, 7), "camino");
        tablero[1][8] = new Camino(new Posicion(1, 8), "camino");
        tablero[1][9] = new Muro(new Posicion(1, 9), "muro", 500);

        // fila 3
        tablero[2][0] = new Muro(new Posicion(2, 0), "muro", 500);
        tablero[2][1] = new Muro(new Posicion(2, 1), "muro", 500);
        tablero[2][2] = new Muro(new Posicion(2, 2), "muro", 500);
        tablero[2][3] = new Muro(new Posicion(2, 3), "muro", 500);
        tablero[2][4] = new Muro(new Posicion(2, 4), "muro", 500);
        tablero[2][5] = new Muro(new Posicion(2, 5), "muro", 500);
        tablero[2][6] = new Muro(new Posicion(2, 6), "muro", 500);
        tablero[2][7] = new Muro(new Posicion(2, 7), "muro", 500);
        tablero[2][8] = new Camino(new Posicion(2, 8), "camino");
        tablero[2][9] = new Muro(new Posicion(2, 9), "muro", 500);

        // fila4
        tablero[3][0] = new Camino(new Posicion(3, 0), "camino");
        tablero[3][1] = new Camino(new Posicion(3, 1), "camino");
        tablero[3][2] = new Camino(new Posicion(3, 2), "camino");
        tablero[3][3] = new Camino(new Posicion(3, 3), "camino");
        tablero[3][4] = new Camino(new Posicion(3, 4), "camino");
        tablero[3][5] = new Camino(new Posicion(3, 5), "camino");
        tablero[3][6] = new Camino(new Posicion(3, 6), "camino");
        tablero[3][7] = new Camino(new Posicion(3, 7), "camino");
        tablero[3][8] = new Camino(new Posicion(3, 8), "camino");
        tablero[3][9] = new Camino(new Posicion(3, 9), "camino");

        // fila5
        tablero[4][0] = new Camino(new Posicion(4, 0), "camino");
        tablero[4][1] = new Muro(new Posicion(4, 1), "muro", 500);
        tablero[4][2] = new Camino(new Posicion(4, 2), "camino");
        tablero[4][3] = new Muro(new Posicion(4, 3), "muro", 500);
        tablero[4][4] = new Camino(new Posicion(4, 4), "camino");
        tablero[4][5] = new Muro(new Posicion(4, 5), "muro", 500);
        tablero[4][6] = new Camino(new Posicion(4, 6), "camino");
        tablero[4][7] = new Muro(new Posicion(4, 7), "muro", 500);
        tablero[4][8] = new Muro(new Posicion(4, 8), "muro", 500);
        tablero[4][9] = new Muro(new Posicion(4, 9), "muro", 500);

        // fila6
        tablero[5][0] = new Camino(new Posicion(5, 0), "camino");
        tablero[5][1] = new Muro(new Posicion(5, 1), "muro", 500);
        tablero[5][2] = new Camino(new Posicion(5, 2), "camino");
        tablero[5][3] = new Muro(new Posicion(5, 3), "muro", 500);
        tablero[5][4] = new Camino(new Posicion(5, 4), "camino");
        tablero[5][5] = new Muro(new Posicion(5, 5), "muro", 500);
        tablero[5][6] = new Camino(new Posicion(5, 6), "camino");
        tablero[5][7] = new Camino(new Posicion(5, 7), "camino");
        tablero[5][8] = new Camino(new Posicion(5, 8), "camino");
        tablero[5][9] = new Camino(new Posicion(5, 9), "camino");
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j].getNombre() + " ");
            }
            System.out.println();
        }
    }
}
