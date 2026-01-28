package Estructuras;

import java.util.Stack;

public class Pila {

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // isEmpty → ¿Está vacía?
        System.out.println("isEmpty: " + pila.isEmpty()); // true

        // push → agrega arriba
        pila.push("A");
        pila.push("B");
        pila.push("C");

        // size → tamaño
        System.out.println("size: " + pila.size()); // 3

        // peek → muestra el de arriba (NO borra)
        System.out.println("peek: " + pila.peek()); // C

        // pop → muestra y BORRA el de arriba
        System.out.println("pop: " + pila.pop()); // C

        // Estado final
        System.out.println("pila final: " + pila); // [A, B]
    }
}