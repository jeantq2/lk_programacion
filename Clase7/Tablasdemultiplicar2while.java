package Clase7;

import java.util.Scanner;

public class Tablasdemultiplicar2while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero tabla: ");
        int n = sc.nextInt();
        while (n < 1 || n > 10) {
            System.out.println("Número inválido. Ingrese un número entre 1 y 10.");
            n = sc.nextInt();
        }
    }
}
