package Digital_Harbor_Exams;

import java.util.Scanner;
import java.util.ArrayList;

public class Gato {

    static String linea1Orejas = " /\\/\\";

    static String linea2Emocionado = "(*_*)";

    static String line2Asustado = "(o_o)";

    static String linea2Enojado = "(-_-)";

    static String linea2Amoroso = "(>_<)";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> emociones = new ArrayList<>();

        int numero = sc.nextInt();
        sc.nextLine(); // limpiamos el salto de linea

        for (int index = 0; index < numero; index++) {
            String linea1 = sc.nextLine();
            String linea2 = sc.nextLine();

            emociones.add(linea1);
            emociones.add(linea2);
        }
        sc.close();

        // System.out.print(salida);
        int i = 0;
        boolean verCara = false;
        while (i < emociones.size()) {
            String palabra = emociones.get(i);
            if (i % 2 == 0) {
                String orejas = LimpiarOrejas(palabra);
                if (orejas.equals(linea1Orejas)) {
                    verCara = true;
                    i = i + 1;
                } else {
                    System.out.println("No identificado");
                    i = i + 2;
                }
            } else {
                if (i % 2 != 0 && verCara) {
                    String cara = LimpiarRostro(palabra);
                    if (cara.equals(line2Asustado)) {
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

                    i++;

                }
            }

        }

    }

    public static String LimpiarOrejas(String palabra) {

        int i = 0;
        String nuevaPalabra = "";

        while (i < palabra.length()) {
            if (i == 0) {
                if (palabra.charAt(i) == ' ') {
                    nuevaPalabra = nuevaPalabra + palabra.charAt(i);
                }
                i++;
            } else {
                if (palabra.charAt(i) != ' ') {
                    nuevaPalabra = nuevaPalabra + palabra.charAt(i);
                    i++;
                } else {
                    if (palabra.charAt(i) == ' ' && palabra.charAt(i + 1) != ' ' && i < palabra.length()) {
                        i++;
                    } else {
                        if (palabra.charAt(i) == ' ' && palabra.charAt(i + 1) == ' ' && i < palabra.length()) {
                            return "";
                        }

                    }
                }

            }

        }

        return nuevaPalabra;
    }

    public static String LimpiarRostro(String palabra) {
        int i = 0;
        String nuevaPalabra = "";

        while (i < palabra.length()) {
            if (i == 0) {
                if (palabra.charAt(i) == '(') {
                    nuevaPalabra = nuevaPalabra + palabra.charAt(i);
                }
                i++;
            } else {
                if (palabra.charAt(i) != ' ') {
                    nuevaPalabra = nuevaPalabra + palabra.charAt(i);
                    i++;
                } else {
                    if (palabra.charAt(i) == ' ' && palabra.charAt(i + 1) != ' ' && i < palabra.length()) {
                        i++;
                    } else {
                        if (palabra.charAt(i) == ' ' && palabra.charAt(i + 1) == ' ' && i < palabra.length()) {
                            return "";
                        }

                    }
                }

            }

        }
        return nuevaPalabra;
    }
}
