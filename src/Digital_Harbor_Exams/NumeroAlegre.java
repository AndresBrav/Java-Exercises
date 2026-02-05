package Digital_Harbor_Exams;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumeroAlegre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;

        int q = sc.nextInt();
        while (q-- > 0) {
            int targetX = sc.nextInt();
            System.out.println(obtenerXAlegreOptimizado(targetX));
        }
        sc.close();
    }

    public static long obtenerXAlegreOptimizado(int n) {

        if (n <= 9)
            return n;

        Queue<Long> cola = new LinkedList<>();
        for (long i = 1; i <= 9; i++) {
            cola.add(i);
        }

        int contador = 0;
        long actual = 0;

        while (!cola.isEmpty()) {
            actual = cola.poll();
            contador++;

            if (contador == n) {
                return actual;
            }

            long ultimoDigito = actual % 10;

            if (ultimoDigito > 0) {
                cola.add(actual * 10 + (ultimoDigito - 1));
            }
            if (ultimoDigito < 9) {
                cola.add(actual * 10 + (ultimoDigito + 1));
            }
        }
        return actual;
    }
}
