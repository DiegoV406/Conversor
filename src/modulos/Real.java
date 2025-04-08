package modulos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Real extends Moeda{

    public Real(String nome, Double valor) {
        super(nome, valor);
    }

    public Real() {
    }

    @Override
    public void conversor(double qtd) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7dd215c0c3737f1962d5d3c5/pair/BRL/USD/" + qtd))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        MoedaClasse real = gson.fromJson(json, MoedaClasse.class);
        System.out.println("Valor " + qtd + " [BRL] " + " corresponde ao valor final de ---> " + real.conversion_result()  + " [USD]");
    }
}
