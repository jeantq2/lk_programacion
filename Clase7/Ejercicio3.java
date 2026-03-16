package Clase7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese números enteros. Ingrese 0 para terminar.");

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.print("Número: ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma total es: " + suma);

        scanner.close();
    }
}

