package Digital_Harbor_Exams;

import java.util.Scanner;

public class Gato {

    static String linea1Orejas = "/\\/\\";
    static String linea2Emocionado = "(*_*)";
    static String linea2Asustado = "(o_o)";
    static String linea2Enojado = "(-_-)";
    static String linea2Amoroso = "(>_<)";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numero; i++) {

            String linea1 = sc.nextLine();
            String linea2 = sc.nextLine();

            String orejas = limpiar(linea1);

            if (!orejas.equals(linea1Orejas)) {
                System.out.println("No identificado");
                continue;
            }

            String cara = limpiar(linea2);

            if (cara.equals(linea2Asustado)) {
                System.out.println("Asustado");
            } else if (cara.equals(linea2Emocionado)) {
                System.out.println("Emocionado");
            } else if (cara.equals(linea2Enojado)) {
                System.out.println("Enojado");
            } else if (cara.equals(linea2Amoroso)) {
                System.out.println("Amoroso");
            } else {
                System.out.println("No identificado");
            }
        }

        sc.close();
    }

    public static String limpiar(String palabra) {

        // Si hay doble espacio se invalida
        if (palabra.contains("  "))
            return "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);

            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
