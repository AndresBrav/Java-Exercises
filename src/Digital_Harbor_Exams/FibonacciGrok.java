package Digital_Harbor_Exams;

import java.util.Scanner;

public class FibonacciGrok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(); // T1
        long b = sc.nextLong(); // T2
        int n = sc.nextInt(); // posición deseada (3 ≤ n ≤ 7)

        long prev2 = a; // T_{i-2}
        long prev1 = b; // T_{i-1}
        long actual = 0;

        // Como n ≥ 3, empezamos desde i=3
        for (int i = 3; i <= n; i++) {
            actual = prev1 * prev1 + prev2;
            prev2 = prev1;
            prev1 = actual;
        }

        System.out.println(actual);

        sc.close();
    }
}
