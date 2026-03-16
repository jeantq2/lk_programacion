package Clase7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int valor;

        do {
            System.out.print("Ingresa un entero (0 para terminar): ");
            valor = sc.nextInt();
            suma += valor;
        } while (valor != 0);

        System.out.println("Total acumulado: " + suma);
        sc.close();
    }
}
