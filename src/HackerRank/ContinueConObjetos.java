package HackerRank;

import java.util.ArrayList;

public class ContinueConObjetos {
    public static void main(String[] args) {
        // Creamos una lista de personas
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Andres", 25));
        personas.add(new Persona(null, 30)); // nombre nulo
        personas.add(new Persona("Maria", null)); // edad nula
        personas.add(new Persona("Luis", 40));

        for (Persona p : personas) {
            System.out.println("Antes del continue: " + p.nombre + " - " + p.edad);

            // Si el nombre o la edad es null, saltamos esta iteración
            if (p.nombre == null || p.edad == null) {
                continue;
            }

            // Esto solo se ejecuta si nombre y edad NO son null
            System.out.println("Después del continue: " + p.nombre + " - " + p.edad);
        }

        System.out.println("se salio del bucle");
    }
}

class Persona {
    String nombre;
    Integer edad;

    // Constructor
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}