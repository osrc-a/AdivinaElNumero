/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Oscar
 */
import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        // Variable para el intento del usuario
        int intento;
        // Contador de intentos
        int intentos = 0;

        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("Adivina un número entre 1 y 100.");

        // Bucle hasta que el usuario adivine el número
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            intentos++;

            // Comprobar si el intento es mayor, menor o igual al número secreto
            if (intento > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (intento != numeroSecreto);

        // Cerrar el escáner
        scanner.close();
    }
}