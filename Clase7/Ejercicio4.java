package Clase7;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un entero no negativo: ");
        int n = sc.nextInt();
        

        int suma = 0;
        for (int i = 2; i <= n; i++) {
            suma *= i;
        }

        System.out.println(n + "! = " + suma);
        sc.close();
    }
}
