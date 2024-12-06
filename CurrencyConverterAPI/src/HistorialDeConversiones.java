import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HistorialDeConversiones {

    private List<String> historial;

    public HistorialDeConversiones() {
        historial = new ArrayList<>();
    }

    public void agregarAlHistorial(String conversion, LocalDateTime fechaHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = fechaHora.format(formatter);

        historial.add("[" + fechaFormateada + "] " + conversion);
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No se han realizado conversiones aún.");
        } else {
            System.out.println("Historial de Conversiones:");
            for (String conversion : historial) {
                System.out.println(conversion);
            }
        }
    }
}
