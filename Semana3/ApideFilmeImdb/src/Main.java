import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        // fazer uma conexão HTTP E buscar os top 250 filmes

         String url= "https://alura-filmes.herokuapp.com/conteudos";
         URI  endereco = URI.create(url);
         var cliente=HttpClient.newHttpClient();
         var  request = HttpRequest.newBuilder(endereco).GET().build();
         HttpResponse<String> reponse = cliente.send(request, BodyHandlers.ofString());
         String body=reponse.body();
         //System.out.println(body);
        // extrair os dados que nos interessam(titulo, poster,classificação)
         var parser=new JsonParser();
         List< Map<String,String>> listadeFimes= parser.parse(body);
        //System.out.println(listadeFimes.size());
        //System.out.println(listadeFimes.get(0));

        //depois exibir e manipular os dados
         for (Map<String, String> filme : listadeFimes){
             System.out.println(filme.get("title"));
             System.out.println(filme.get("image"));
             System.out.println(filme.get("imdbRating"));
             System.out.println();
         }
    }
}