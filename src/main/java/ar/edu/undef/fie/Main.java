/*
2. Hacer un programa que defina una lista de números enteros, y tenga una función booleana que recibe una lista y un número entero.
La función deberá devolver verdadero si el elemento pasado por parámetro existe.

*/

package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {


        int [] numerosEnteros = {4, 5, 6, 3, 2, 4};
        int valor = 6;


        for (int numero : numerosEnteros) {
                if (numero == valor) {
                     System.out.println("True");

                }
        }

    }
}








