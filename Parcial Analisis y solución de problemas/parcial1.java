import java.util.Scanner;

public class parcial1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int CLAVE = 1234;
        final int SALDOINICIAL = 800000;

        int claveUsuario;
        int retiro;
        int totalRetiro;
        int nuevoSaldo;

        System.out.print("Digite por favor la clave: ");
        claveUsuario = sc.nextInt();

        if (claveUsuario == CLAVE) {

            System.out.println("Bienvenido al Cajero UNIAJC");
            System.out.print("Digite la cantidad a retirar: ");
            retiro = sc.nextInt();

            // Si el retiro es mayor a 200000 se cobra comisión
            if (retiro > 200000) {
                totalRetiro = retiro + 2000;
            } else {
                totalRetiro = retiro;
            }

            // Validar que no supere el saldo
            if (totalRetiro <= SALDOINICIAL) {

                nuevoSaldo = SALDOINICIAL - totalRetiro;
                System.out.println("Su saldo actual es: " + nuevoSaldo + " Muchas Gracias!!!!");

            } else {

                System.out.println("El valor solicitado más el costo de la transacción es mayor al saldo");

            }

        } else {

            System.out.println("Su clave no es correcta...intenta nuevamente....");

        }

        sc.close();
    }
}