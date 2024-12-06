public class ConversorMoneda {

    public double convertir(Cambio cambio, double monto, int opcionMenu) {
        double resultado = 0.0;

        try {
            if (opcionMenu == 1 || opcionMenu == 3 || opcionMenu == 5 || opcionMenu == 6 || opcionMenu == 7) {
                resultado = monto * cambio.conversion_rate();
            } else if (opcionMenu == 2 || opcionMenu == 4 || opcionMenu == 8) {
                resultado = monto * cambio.conversion_rate();
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: El monto ingresado no es válido. Debe ser un número.");
            return 0.0;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
            return 0.0;
        }

        return resultado;
    }

    public void mostrarResultado(double resultado, Cambio cambio) {
        try {
            if (resultado != 0.0) {
                System.out.println("El resultado de la conversión es: " + resultado + " " + cambio.target_code());
            } else {
                System.out.println("No se pudo realizar la conversión debido a un error.");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al mostrar el resultado: " + e.getMessage());
        }
    }
}
