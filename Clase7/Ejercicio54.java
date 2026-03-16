package Clase7;

import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables para almacenar los datos
        int suma = 0;
        int cantidad = 0;
        int numero;
        
        // Solicitar números positivos hasta que se ingrese uno no positivo
        System.out.println("Ingrese números positivos (termine con un número no positivo):");
        
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            
            // Si el número es positivo, agregarlo a la suma
            if (numero > 0) {
                suma += numero;
                cantidad++;
            }
        } while (numero > 0); // Continuar mientras sea positivo
        
        // Calcular y mostrar la media
        if (cantidad > 0) {
            double media = (double) suma / cantidad;
            System.out.println("\nTotal de números ingresados: " + cantidad);
            System.out.println("Suma total: " + suma);
            System.out.println("Media aritmética: " + media);
        } else {
            System.out.println("\nNo se ingresaron números positivos.");
        }
        
        scanner.close();
    }
}
