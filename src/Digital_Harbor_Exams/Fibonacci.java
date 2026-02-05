package Digital_Harbor_Exams;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            long N = Long.parseLong(st.nextToken());

            BigInteger resultado = calcularSucesion(a, b, N);
            System.out.print(resultado);
        } catch (Exception e) {
        }
    }

    public static BigInteger calcularSucesion(BigInteger a, BigInteger b, long N) {
        BigInteger resultado = BigInteger.ZERO;

        for (long i = 3; i <= N; i++) {
            resultado = b.multiply(b).add(a);
            a = b;
            b = resultado;
        }

        return resultado;
    }
}