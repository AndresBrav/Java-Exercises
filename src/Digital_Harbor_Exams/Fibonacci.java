package Digital_Harbor_Exams;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese A");
        int a = sc.nextInt();
        System.out.println("Ingrese B");
        int b = sc.nextInt();
        System.out.println("Ingrese N");
        int N = sc.nextInt();
        int resultado = calcularSucesion(a, b, N);
        System.out.println("El resultado es " + resultado);
    }

    public static int calcularSucesion(int a, int b, int N) {

        int iterador = 2;
        int resultado = 0;

        while (iterador < N) {
            resultado = (int) Math.pow(b, 2) + a;
            a = b;
            b = resultado;

            iterador++;
        }

        // System.out.println("el resultado es " + resultado);
        return resultado;
    }

}