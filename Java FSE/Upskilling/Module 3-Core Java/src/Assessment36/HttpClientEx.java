package Assessment36;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientEx {

    public static void main(String[] args) {

        try {

            // Create HttpClient

            HttpClient client =
                    HttpClient.newHttpClient();

            // Create Request

            HttpRequest request =
                    HttpRequest.newBuilder()

                            .uri(
                                    URI.create(
                                            "https://api.github.com"
                                    )
                            )

                            .build();

            // Send Request

            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers.ofString()
                    );

            // Display Response

            System.out.println(
                    "Status Code: "
                            + response.statusCode()
            );

            System.out.println(
                    "\nResponse Body:\n"
            );

            System.out.println(
                    response.body()
            );

        }

        catch(Exception e) {

            System.out.println(
                    e.getMessage()
            );

        }

    }

}