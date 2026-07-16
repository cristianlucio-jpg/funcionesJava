package ejercicio01;

import java.util.Scanner;

/**
 * Clase calcularFactorial.
 * 
 * Objetivo: Calcular el factorial de un número entero positivo.
 * 
 * Contenido temático:
 * - Estructuras de repetición (for): permiten calcular el factorial paso a paso.
 * - Entrada de datos con Scanner: captura el número ingresado por el usuario.
 * - Acumuladores: multiplican valores sucesivos para obtener el resultado.
 * 
 * Ejemplo:
 * Ingrese: 5 → Resultado: 120
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class calcularFactorial {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario un número entero positivo,
     * calcula su factorial mediante un ciclo for y muestra el resultado.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroIngresado = teclado.nextInt();

        // Se inicializa el acumulador en 1
        long factorial = 1;

        // Se multiplica desde 1 hasta el número ingresado
        for (int i = 1; i <= numeroIngresado; i++) {
            factorial *= i;
        }

        // Se muestra el resultado final
        System.out.println("El factorial de " + numeroIngresado + " es: " + factorial);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
