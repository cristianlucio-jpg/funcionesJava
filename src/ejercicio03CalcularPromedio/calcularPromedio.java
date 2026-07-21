package ejercicio03;

import java.util.Scanner;

/**
 * Clase calcularPromedio.
 * 
 * Objetivo: Calcular el promedio de un conjunto de números.
 * 
 * Contenido temático:
 * - Arreglos: permiten almacenar múltiples valores.
 * - Ciclos for: recorren los elementos para lectura y suma.
 * - Operaciones aritméticas: división para obtener el promedio.
 * 
 * Ejemplo:
 * Ingrese: [4, 5, 6] → Resultado: 5
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class calcularPromedio {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de números,
     * luego lee cada uno, calcula la suma total y finalmente
     * obtiene el promedio dividiendo entre la cantidad ingresada.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = teclado.nextInt();

        int[] numeros = new int[cantidadNumeros];
        int suma = 0;

        // Se leen los números y se acumulan en suma
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            suma += numeros[i];
        }

        // Se calcula el promedio final
        double promedio = (double) suma / cantidadNumeros;

        // Se muestra el resultado
        System.out.println("El promedio es: " + promedio);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
