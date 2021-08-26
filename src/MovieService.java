import com.google.gson.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MovieService {
    static String baseUrl = "http://www.omdbapi.com/?";

    static Movie search(String title) throws Exception {
        title = sanitize(title);
        URL url = new URL(baseUrl + "apikey=376e6191&t=" + title);

        try {
            HttpURLConnection request = sendRequest(url);
            BufferedReader response = new BufferedReader(new InputStreamReader(request.getInputStream()));

            Gson gson = new Gson();
            Movie movie = gson.fromJson(response, Movie.class);
            return movie;
        }
        catch (Exception e) {
            throw new Exception("Error\n" + e);
        }
    }

    static String sanitize(String text) {
        return text.replaceAll(" ", "+");
    }

    static private HttpURLConnection sendRequest(URL url) throws Exception {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        validateResponse(request);
        return request;
    }

    private static void validateResponse(HttpURLConnection request) throws IOException {
        int codeSuccess = 200;
        if (request.getResponseCode() != codeSuccess) {
            throw new RuntimeException("HTTP error code: " + request.getResponseCode());
        }
    }
}
