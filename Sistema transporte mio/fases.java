import java.util.Scanner;

public class fases {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n+------------------------------+");
            System.out.println("|      SISTEMA MIO CALI        |");
            System.out.println("+------------------------------+");
            System.out.println("| 1. Cobrar tarifa             |");
            System.out.println("| 2. Control de ruta           |");
            System.out.println("| 3. Reporte del dia           |");
            System.out.println("| 0. Salir                     |");
            System.out.println("+------------------------------+");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                // ================= FASE 1 =================
                case 1:
                    System.out.print("Ingrese la hora (0-23): ");
                    int hora = sc.nextInt();

                    System.out.println("1. Normal");
                    System.out.println("2. Estudiante");
                    System.out.println("3. Adulto mayor");
                    System.out.println("4. Discapacitado");
                    System.out.print("Seleccione tipo: ");
                    int tipo = sc.nextInt();

                    double tarifaBase = 0;
                    double descuento = 0;
                    double totalPagar = 0;
                    String nombreTipo = "";

                    boolean esHoraValle = (hora >= 9 && hora <= 16);

                    switch (tipo) {
                        case 1:
                            nombreTipo = "Normal";
                            tarifaBase = 3000;
                            break;

                        case 2:
                            nombreTipo = "Estudiante";
                            tarifaBase = 1500;
                            if (esHoraValle) {
                                descuento = tarifaBase * 0.10;
                            }
                            break;

                        case 3:
                            nombreTipo = "Adulto mayor";
                            tarifaBase = 0;
                            break;

                        case 4:
                            nombreTipo = "Discapacitado";
                            tarifaBase = 0;
                            break;

                        default:
                            System.out.println("Tipo invalido");
                    }

                    totalPagar = tarifaBase - descuento;

                    System.out.println("\n--- TIQUETE ---");
                    System.out.println("Tipo: " + nombreTipo);
                    System.out.println("Tarifa base: $" + tarifaBase);
                    System.out.println("Descuento: $" + descuento);
                    System.out.println("TOTAL: $" + totalPagar);
                    break;

                // ================= FASE 2 =================
                case 2:
                    int capacidadMaxima = 80;
                    int pasajerosActuales = 0;
                    int totalSubieron = 0;
                    int totalBajaron = 0;
                    int paradasRecorridas = 0;
                    int paradasConAforo = 0;
                    int parada = 1;
                    boolean rutaActiva = true;

                    while (parada <= 25 && rutaActiva) {

                        System.out.println("\nPARADA " + parada);
                        System.out.println("Pasajeros: " + pasajerosActuales);

                        System.out.print("Suben (-1 salir): ");
                        int suben = sc.nextInt();

                        if (suben == -1) {
                            rutaActiva = false;
                        } else {

                            System.out.print("Bajan: ");
                            int bajan = sc.nextInt();

                            if (bajan > pasajerosActuales) {
                                System.out.println("Error: bajan mas de los que hay");
                                bajan = pasajerosActuales;
                            }

                            if (pasajerosActuales + suben - bajan > capacidadMaxima) {
                                System.out.println("Excede capacidad, se ajusta");
                                suben = capacidadMaxima - pasajerosActuales + bajan;
                            }

                            pasajerosActuales = pasajerosActuales + suben - bajan;
                            totalSubieron += suben;
                            totalBajaron += bajan;

                            if (pasajerosActuales == 80) {
                                paradasConAforo++;
                            }

                            double porcentaje = (pasajerosActuales * 100.0) / capacidadMaxima;

                            String estado;
                            if (pasajerosActuales == 80) {
                                estado = "AFORO MAXIMO";
                            } else if (porcentaje >= 60) {
                                estado = "BUS LLENO";
                            } else {
                                estado = "NORMAL";
                            }

                            System.out.println("Estado: " + estado);

                            parada++;
                            paradasRecorridas++;
                        }
                    }

                    System.out.println("\n--- RESUMEN ---");
                    System.out.println("Paradas: " + paradasRecorridas);
                    System.out.println("Subieron: " + totalSubieron);
                    System.out.println("Bajaron: " + totalBajaron);
                    System.out.println("Final: " + pasajerosActuales);
                    System.out.println("Aforo maximo: " + paradasConAforo);
                    break;

                // ================= FASE 4 + 5 =================
                case 3:

                    int totalPasajerosDia = 0;
                    double totalRecaudoDia = 0;
                    int maxPasajeros = 0;
                    int minPasajeros = Integer.MAX_VALUE;
                    String rutaMax = "", rutaMin = "", rutaMayorRecaudo = "";
                    double maxRecaudo = 0;

                    int rutasConAlerta = 0;

                    for (int i = 1; i <= 3; i++) {

                        String nombreRuta = (i == 1) ? "T31" : (i == 2) ? "A10" : "P22A";

                        System.out.println("\nRuta: " + nombreRuta);

                        System.out.print("Pasajeros: ");
                        int pasajeros = sc.nextInt();

                        System.out.print("Vueltas: ");
                        int vueltas = sc.nextInt();

                        System.out.print("% Normal: ");
                        int pctNormal = sc.nextInt();

                        int pctEstudiante = 100 - pctNormal;

                        double recaudo = (pasajeros * ((pctNormal / 100.0) * 3000 +
                                (pctEstudiante / 100.0) * 1500));

                        totalPasajerosDia += pasajeros;
                        totalRecaudoDia += recaudo;

                        if (pasajeros > maxPasajeros) {
                            maxPasajeros = pasajeros;
                            rutaMax = nombreRuta;
                        }

                        if (pasajeros < minPasajeros) {
                            minPasajeros = pasajeros;
                            rutaMin = nombreRuta;
                        }

                        if (recaudo > maxRecaudo) {
                            maxRecaudo = recaudo;
                            rutaMayorRecaudo = nombreRuta;
                        }

                        // ===== ALERTAS =====
                        System.out.print("Retraso: ");
                        int retraso = sc.nextInt();

                        boolean alertaDemanda = pasajeros < 500;
                        boolean alertaVueltas = vueltas > 20;
                        boolean alertaRetraso = retraso > 90;
                        boolean alertaRecaudo = recaudo < (pasajeros * 1500 * 0.70);

                        boolean tieneAlerta = alertaDemanda || alertaVueltas || alertaRetraso || alertaRecaudo;

                        if (tieneAlerta) {
                            rutasConAlerta++;
                            System.out.println("ALERTA en " + nombreRuta);
                        } else {
                            System.out.println("OK");
                        }
                    }

                    System.out.println("\n--- REPORTE ---");
                    System.out.println("Total pasajeros: " + totalPasajerosDia);
                    System.out.println("Total recaudo: $" + totalRecaudoDia);
                    System.out.println("Ruta mas concurrida: " + rutaMax);
                    System.out.println("Ruta menos concurrida: " + rutaMin);
                    System.out.println("Mayor recaudo: " + rutaMayorRecaudo);

                    System.out.println("Alertas: " + rutasConAlerta);

                    if (rutasConAlerta == 0)
                        System.out.println("NORMAL");
                    else if (rutasConAlerta == 1)
                        System.out.println("REVISION MENOR");
                    else if (rutasConAlerta == 2)
                        System.out.println("REVISION URGENTE");
                    else
                        System.out.println("CRITICO");

                    break;

                case 0:
                    System.out.println("Cerrando sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }
        sc.close();
    }
}
