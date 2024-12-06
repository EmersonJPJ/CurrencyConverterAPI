import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    public Cambio tipoDeCambio(String monedaBase, String monedaDestino){
            URI direccion = URI.create(
                    "https://v6.exchangerate-api.com/v6/1d3317fef136673834a42593/pair/"+monedaBase+"/"+monedaDestino);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Cambio.class);
            } catch (Exception e) {
                System.out.println(direccion);
                throw new RuntimeException("No encontré ese pais.");
            }
        }

    }
