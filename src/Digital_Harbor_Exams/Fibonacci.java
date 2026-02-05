package Digital_Harbor_Exams;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long N = sc.nextLong();

        // System.out.println(a + " " + b + " " + N);
        long resultado = calcularSucesion(a, b, N);
        System.out.println("El resultado es " + resultado);
    }

    public static long calcularSucesion(long a, long b, long N) {

        long iterador = 2;
        long resultado = 0;
        if (N == 1) {
            return a;
        }
        if (N == 2) {
            return b;
        }

        while (iterador < N) {
            resultado = (b * b) + a;
            a = b;
            b = resultado;

            iterador++;
        }

        // System.out.println("el resultado es " + resultado);
        return resultado;
    }

}