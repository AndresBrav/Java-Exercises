package Digital_Harbor_Exams;

import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra = sc.nextLine();
        String texto = sc.nextLine();

        System.out.println(letra);
        System.out.println(texto);

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.print(contador);
    }
}
