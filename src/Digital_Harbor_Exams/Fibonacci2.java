package Digital_Harbor_Exams;

import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        sc.close();

        // T1 = A, T2 = B
        int t1 = A;
        int t2 = B;
        int tn = 0;

        // Calculamos desde T3 hasta TN
        for (int i = 3; i <= N; i++) {
            tn = t2 + 2 * t1;
            t1 = t2;
            t2 = tn;
        }

        System.out.println(tn);
    }
}
