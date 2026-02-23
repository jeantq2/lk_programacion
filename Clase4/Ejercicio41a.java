package Clase4;

import java.util.Scanner;

public class Ejercicio41a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedir el àngulo por parte del usuario
        System.out.println("Digite el àngulo: ");
        int angulo = sc.nextInt();
        // Condicional
        if (angulo == 90) {
            System.out.println("El àngulo es un àngulo recto");
        } else {
            System.out.println("El àngulo no es un àngulo recto");

        }

        sc.close();
    }
}
