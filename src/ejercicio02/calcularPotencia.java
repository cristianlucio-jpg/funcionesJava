package ejercicio02;

import java.util.Scanner;

/**
 * Clase calcularPotencia.
 * 
 * Objetivo: Calcular la potencia de un número.
 * 
 * Contenido temático:
 * - Estructuras de repetición (for): permiten calcular la potencia paso a paso.
 * - Entrada de datos con Scanner: captura base y exponente.
 * - Acumuladores: multiplican valores sucesivos para obtener el resultado.
 * 
 * Ejemplo:
 * Ingrese: base=2, exponente=3 → Resultado: 8
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class calcularPotencia {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario una base y un exponente,
     * calcula la potencia mediante un ciclo for y muestra el resultado.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = teclado.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = teclado.nextInt();

        // Se inicializa el acumulador en 1
        long potencia = 1;

        // Se multiplica la base tantas veces como indique el exponente
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        // Se muestra el resultado final
        System.out.println(base + "^" + exponente + " = " + potencia);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
