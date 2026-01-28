package Estructuras;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();

        // isEmpty → ¿Está vacía?
        System.out.println("isEmpty: " + cola.isEmpty()); // true

        // add → agrega al final
        cola.add("A");
        cola.add("B");

        // offer → agrega al final (igual que add, pero sin error)
        cola.offer("C");

        System.out.println("la cola es " + cola);

        // size → tamaño de la cola
        System.out.println("size: " + cola.size()); // 3

        // peek → muestra el primero (NO lo borra)
        System.out.println("peek: " + cola.peek()); // A

        // element → muestra el primero (NO lo borra, pero lanza error si está vacía)
        System.out.println("element: " + cola.element()); // A

        // poll → muestra y BORRA el primero
        System.out.println("poll: " + cola.poll()); // A

        // remove → BORRA y muestra el primero (lanza error si está vacía)
        System.out.println("remove: " + cola.remove()); // B

        // Estado final
        System.out.println("cola final: " + cola); // [C]
    }
}
