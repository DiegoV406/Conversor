package modulos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PesoArgentino extends Moeda{

    public PesoArgentino(String nome, Double valor) {
        super(nome, valor);
    }

    public PesoArgentino() {
    }

    @Override
    public void conversor(double qtd) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7dd215c0c3737f1962d5d3c5/pair/ARS/USD/" + qtd))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        MoedaClasse pesoArgentino = gson.fromJson(json, MoedaClasse.class);
        System.out.println("Valor " + qtd + " [ARS] " + " corresponde ao valor final de ---> " + pesoArgentino.conversion_result()  + " [USD]");
    }
}
