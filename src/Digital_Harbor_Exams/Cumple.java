package Digital_Harbor_Exams;

import java.util.Scanner;

public class Cumple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer Y (duración del período en años) y P (número de Dhrs)
        int Y = sc.nextInt(); // 20
        int P = sc.nextInt(); // 20

        // Leer los años de nacimiento de los Dhrs (están ordenados cronológicamente)
        int[] years = new int[P];
        for (int i = 0; i < P; i++) {
            years[i] = sc.nextInt(); // 1981 1982 1983 1986 1988 1992 1993 1993 1994 1996 1997 1998 1999 2000 2000
                                     // 2001 2005 2006 2010 2011
        }

        // Primera pasada: encontrar el MÁXIMO número de Dhrs nacidos en cualquier
        // período de Y años
        // (es decir, máximo - mínimo <= Y-1)
        int maxCount = 0;
        int izquierda = 0;
        for (int derecha = 0; derecha < P; derecha++) {
            // Ajustar la ventana: mientras el intervalo sea mayor a Y años, movemos
            // izquierda
            while (years[derecha] - years[izquierda] > Y - 1 && izquierda <= derecha) {
                izquierda++;
            }
            int actual = derecha - izquierda + 1;
            if (actual > maxCount) {
                maxCount = actual;
            }
        }

        // Segunda pasada: encontrar el período MÁS ANTIGUO (el que termina primero)
        // que tenga exactamente maxCount personas
        izquierda = 0;
        int mejorAnioInicio = -1;
        int mejorAnioFin = -1;

        for (int derecha = 0; derecha < P; derecha++) {
            while (years[derecha] - years[izquierda] > Y - 1 && izquierda <= derecha) {
                izquierda++;
            }
            int actual = derecha - izquierda + 1;
            if (actual == maxCount) {
                // Como recorremos de izquierda a derecha, la primera vez que encontramos
                // un período con maxCount es el más antiguo (termina antes)
                if (mejorAnioInicio == -1) {
                    mejorAnioInicio = years[izquierda];
                    mejorAnioFin = years[derecha];
                }
            }
        }

        // Imprimir el resultado solicitado:
        // cantidad máxima - año del primer Dhr en ese período - año del último Dhr
        System.out.println(maxCount + " " + mejorAnioInicio + " " + mejorAnioFin);

        sc.close();
    }
}
