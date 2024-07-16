import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaValorDeConversion {
        Moneda buscaValor (String monedaOrigen, String monedaDestino, String cantidadConvertir) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9111b4c7498905659fa9469a/pair/"+monedaOrigen+"/"+monedaDestino+"/"+cantidadConvertir);
        HttpClient client = HttpClient.newHttpClient(); // solicitud
        HttpRequest request = HttpRequest.newBuilder() // lo que se solicta, build construye la solicitud
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

                return new Gson().fromJson(response.body(), Moneda.class);

        }
}
