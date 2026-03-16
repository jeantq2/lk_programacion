package Clase7;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String PASSWORD = "secreto";
        int intentos = 0;
        boolean autorizado = false;

        while (intentos < 3 && !autorizado) {
            System.out.print("Ingresa la contraseña: ");
            String entrada = sc.nextLine();
            intentos++;

            if (PASSWORD.equals(entrada)) {
                autorizado = true;
                break;
            }

            System.out.println("Contraseña incorrecta. Intentos restantes: " + (3 - intentos));
        }

        if (autorizado) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Usuario bloqueado.");
        }

        sc.close();
    }
}
