package modulos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Dollar extends Moeda{

    public Dollar(String nome, Double valor) {
        super(nome, valor);
    }


    public Dollar() {
    }

    @Override
    public void conversor(double qtd) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7dd215c0c3737f1962d5d3c5/pair/USD/BRL/" + qtd))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        MoedaClasse dollar = gson.fromJson(json, MoedaClasse.class);
        System.out.println("Valor " + qtd + " [USD] " + " corresponde ao valor final de ---> " + dollar.conversion_result()  + " [BRL]");
    }


    public void conversorUsdPeso(double qtd) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7dd215c0c3737f1962d5d3c5/pair/USD/ARS/" + qtd))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        MoedaClasse dollar = gson.fromJson(json, MoedaClasse.class);
        System.out.println("Valor " + qtd + " [USD] " + " corresponde ao valor final de ---> " + dollar.conversion_result()  + " [ARS]");
    }

    public void conversorUsdColombiano(double qtd) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7dd215c0c3737f1962d5d3c5/pair/USD/COP/" + qtd))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        MoedaClasse dollar = gson.fromJson(json, MoedaClasse.class);
        System.out.println("Valor " + qtd + " [USD] " + " corresponde ao valor final de ---> " + dollar.conversion_result()  + " [COP]");
    }


}
