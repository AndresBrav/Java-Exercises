package Digital_Harbor_Exams;

import java.util.Scanner;

public class NumeroAlegre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt(); // número de consultas

        int iterador = 0;

        while (iterador < q) {
            int X = sc.nextInt();
            System.out.println(obtenerXAlegre(X));
            iterador++;
        }

        sc.close();

    }

    static boolean esAlegre(int num) {
        String s = String.valueOf(num);

        for (int i = 0; i < s.length() - 1; i++) {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';

            if (Math.abs(a - b) > 1) {
                return false;
            }
        }
        return true;
    }

    static int obtenerXAlegre(int X) {
        int contador = 0;
        int num = 1;

        while (true) {
            if (esAlegre(num)) {
                contador++;
                if (contador == X) {
                    return num;
                }
            }
            num++;
        }
    }
}
