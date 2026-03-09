package Clase6;

import java.util.Scanner;

public class Ejercicio412segunsea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double num1, num2, resultado;
        int opcion;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        System.out.print("Ingrese la opción (1=Suma, 2=Multiplicación, 3=División): ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            resultado = num1 + num2;
            System.out.println("La suma es: " + resultado);

        } else if (opcion == 2) {
            resultado = num1 * num2;
            System.out.println("La multiplicación es: " + resultado);

        } else if (opcion == 3) {
            if (num2 == 0) {
                resultado = num1 / num2;
                System.out.println("La división es: " + resultado);
            } else {
                System.out.println("Error: no se puede dividir entre 0");
            }

        } else {
            System.out.println("Opción inválida");
        }

        sc.close();
    }
}
