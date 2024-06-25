import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String conversion;
        while (true) {
            try {
                System.out.println("Elige el tipo de conversion que deseas realizar: " +
                        "\n1. USD - COP " +
                        "\n2. COP - USD " +
                        "\n3. ARS - USD " +
                        "\n4. USD - ARS " +
                        "\n5. EUR - COP " +
                        "\n6. COP - EUR " +
                        "\n7. Salir");

                conversion = sc.nextLine();

                if (conversion.equals("7")) {
                    break;
                }

                System.out.print("Digite el monto a convertir: ");
                String valor = sc.nextLine();

                String aux = Conversor.convertirMoneda(conversion);
                String url = aux + valor;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

                HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

                Gson gson = new Gson();

                String json = (String) response.body();
                MonedaConver monedaConver = gson.fromJson(json, MonedaConver.class);

                System.out.println(monedaConver.toString());

            } catch (Exception e) {
                System.out.println("A ocurrido un error: " + e.getMessage());
            }
        }
    }
}