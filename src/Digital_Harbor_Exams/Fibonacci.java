package Digital_Harbor_Exams;

import java.io.*;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long N = Long.parseLong(st.nextToken());

            long resultado = calcularSucesion(a, b, N);
            System.out.print(resultado);
        } catch (Exception e) {
        }
    }

    public static long calcularSucesion(long a, long b, long N) {

        if (N == 1)
            return a;
        if (N == 2)
            return b;

        long resultado = 0;

        for (long i = 3; i <= N; i++) {
            resultado = (b * b) + a;
            a = b;
            b = resultado;
        }

        return resultado;
    }

}