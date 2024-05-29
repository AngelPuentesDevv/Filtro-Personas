import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = generarListaPersonas();

        System.out.println("Lista inicial:");
        imprimirLista(personas);

        // Ordenar por edad
        Collections.sort(personas, Comparator.comparingInt(Persona::getEdad));
        System.out.println("\nLista ordenada por edad:");
        imprimirLista(personas);

        // Ordenar por salario
        Collections.sort(personas, Comparator.comparingDouble(Persona::getSalario));
        System.out.println("\nLista ordenada por salario:");
        imprimirLista(personas);
    }

    // Método para generar una lista aleatoria de personas
    private static List<Persona> generarListaPersonas() {
        Random rand = new Random();
        int numPersonas = 5 + rand.nextInt(6); // Número aleatorio entre 5 y 10
        List<Persona> personas = new ArrayList<>();

        for (int i = 1; i <= numPersonas; i++) {
            int edad = 18 + rand.nextInt(43); // Edad aleatoria entre 18 y 60
            double salario = 30000 + rand.nextDouble() * 70000; // Salario aleatorio entre 30000 y 100000
            personas.add(new Persona(i, "Persona" + i, edad, salario));
        }
        return personas;
    }

    // Método para imprimir la lista de personas
    private static void imprimirLista(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}