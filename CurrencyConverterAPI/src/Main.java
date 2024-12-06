import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultaApi consulta = new ConsultaApi();
        ConversorMoneda conversor = new ConversorMoneda();
        HistorialDeConversiones historial = new HistorialDeConversiones();
        Scanner lectura = new Scanner(System.in);
        int opcionMenu = 0;

        while (opcionMenu != 9) {
            System.out.println("***** Bienvenido al conversor de monedas *****");
            System.out.println("1. Colones a Dólares");
            System.out.println("2. Dólares a Colones");
            System.out.println("3. Colones a Euros");
            System.out.println("4. Euros a Colones");
            System.out.println("5. Pesos Argentinos a Colones");
            System.out.println("6. Pesos Argentinos a Dólares");
            System.out.println("7. Dólares a Real Brasileño");
            System.out.println("8. Real Brasileño a Dólares");
            System.out.println("9. Ver historial de conversiones");
            System.out.println("10. Salir");

            System.out.print("Seleccione una opción: ");
            opcionMenu = Integer.valueOf(lectura.nextLine());

            Cambio cambio = null;
            String tipoConversion = "";

            switch (opcionMenu) {
                case 1:
                    cambio = consulta.tipoDeCambio("CRC", "USD");
                    tipoConversion = "Colones a Dólares";
                    break;
                case 2:
                    cambio = consulta.tipoDeCambio("USD", "CRC");
                    tipoConversion = "Dólares a Colones";
                    break;
                case 3:
                    cambio = consulta.tipoDeCambio("CRC", "EUR");
                    tipoConversion = "Colones a Euros";
                    break;
                case 4:
                    cambio = consulta.tipoDeCambio("EUR", "CRC");
                    tipoConversion = "Euros a Colones";
                    break;
                case 5:
                    cambio = consulta.tipoDeCambio("ARS", "CRC");
                    tipoConversion = "Pesos Argentinos a Colones";
                    break;
                case 6:
                    cambio = consulta.tipoDeCambio("ARS", "USD");
                    tipoConversion = "Pesos Argentinos a Dólares";
                    break;
                case 7:
                    cambio = consulta.tipoDeCambio("USD", "BRL");
                    tipoConversion = "Dólares a Real Brasileño";
                    break;
                case 8:
                    cambio = consulta.tipoDeCambio("BRL", "USD");
                    tipoConversion = "Real Brasileño a Dólares";
                    break;
                case 9:
                    historial.mostrarHistorial();
                    continue;
                case 10:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    continue;
            }

            if (cambio != null) {
                System.out.print("Ingrese el monto a convertir: ");
                double monto = Double.valueOf(lectura.nextLine());

                double resultado = conversor.convertir(cambio, monto, opcionMenu);

                conversor.mostrarResultado(resultado, cambio);

                LocalDateTime fechaHora = LocalDateTime.now();

                historial.agregarAlHistorial(tipoConversion + ": " + monto + " -> " + resultado + " " + cambio.target_code(), fechaHora);
            }
        }

        lectura.close();
    }
}
