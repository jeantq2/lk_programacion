package Parcial Analisis y solución de problemas;

public class parcial1 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

          final int CLAVE = 1234;
        final int SALDO_INICIAL = 800000;
            int claveUsuario;
        int retiro;
        int nuevoSaldo;
        // Pedir la clave del usuario
        System.out.println("Digite su clave: ");
        claveUsuario = sc.nextInt();
        if (claveUsuario == CLAVE) {
            System.out.println("Digite el monto a retirar: ");
            retiro = sc.nextInt();
             if (retiro > 200000) {
                retiro = retiro + 2000; // Se cobra comisión
            }
            if (retiro <= SALDO_INICIAL) {
                nuevoSaldo = SALDO_INICIAL - retiro;
                System.out.println("Su saldo actual es: " + nuevoSaldo + " Muchas Gracias!!!!");
             } else {
                 System.out.println("El valor solicitado más el costo de la transacción es mayor al saldo.");
                } else {
                    System.out.println("Su clave no es correcta... intenta nuevamente.");
                 }
                }
             sc.close();

     }

}
