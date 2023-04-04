/**
 * Dado el vector {10, 20, 5, 15, 30, 20}. A) Totalizar el vector e informar el
 * total. B) Informar el contenido de las posiciones impares (por ejemplo, las
 * posiciones 1, 3, 5, etc.). C) Informar el mayor número. D) Informar cuantas
 * veces aparece el número 20.
 */
package actividad01;

public class Actividad01 {

    public static void main(String[] args) {

        //Inicializacion y asignacion de variables
        int[] numeros = {10, 20, 5, 15, 30, 20};
        int totalVector = 0;

        // Total del vector
        for (int i = 0; i < numeros.length; i++) {
            totalVector = totalVector + numeros[i];
        }

        System.out.println("El total de valores dentro del vector es de: " + totalVector);

        // 
        //Busqueda e Impresion de elementos de indice impares
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 != 0) {
                System.out.println("El contenido de la posicion " + i + " es " + numeros[i]);
            }
        }

        int valorMaximo = numeros[0];
        // Busqueda e Impresion del mayor valor dl vector numeros
        for (int i = 0; i < numeros.length; i++) {
            if (valorMaximo < numeros[i]) {
                valorMaximo = numeros[i];

            }
        }
        System.out.println("El valor maximo del vector es: " + valorMaximo);
        
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 20) {
                contador++;

            }
        }
        System.out.println("El valor 20 se repite " + contador + " veces");

    }
}
