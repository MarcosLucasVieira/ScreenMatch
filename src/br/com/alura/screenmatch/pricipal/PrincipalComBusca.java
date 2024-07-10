package br.com.alura.screenmatch.pricipal;

import br.com.alura.screenmatch.exception.ErroDeconversaoException;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        String busca ="";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

      while(!busca.equalsIgnoreCase("sair")) {

          System.out.println("Digite um filme para busca");
          busca = leitor.nextLine();

          if(busca.equalsIgnoreCase("sair")){
              break;
          }

          String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=cec54ced";

          try {
              HttpClient client = HttpClient.newHttpClient();
              HttpRequest request = HttpRequest.newBuilder()
                      .uri(URI.create(endereco))
                      .build();
              HttpResponse<String> response = client
                      .send(request, HttpResponse.BodyHandlers.ofString());

              System.out.println(response.body());
              String json = response.body();


              TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
              System.out.println("Titulo:" + meuTituloOmdb);

              Titulo meuTitulo = new Titulo(meuTituloOmdb);

              titulos.add(meuTitulo);
          } catch (NumberFormatException e) {
              System.out.println("Aconteceu um erro");
              System.out.println(e.getMessage());
          } catch (IllegalArgumentException e) {
              System.out.println("Algum erro na busca, verifique o endereço");
          } catch (ErroDeconversaoException e) {
              System.out.println(e.getMessage());
          }
      }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
         escrita.write(gson.toJson(titulos));
        escrita.close();
    }
}
