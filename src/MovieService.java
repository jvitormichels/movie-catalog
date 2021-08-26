import com.google.gson.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MovieService {
    static String baseUrl = "http://www.omdbapi.com/?";

    static Movie search(String title) throws Exception {
        URL url = new URL(baseUrl + "apikey=376e6191&t=" + title);

        try {
            HttpURLConnection connection = openConnection(url);
            BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            Gson gson = new Gson();
            Movie movie = gson.fromJson(response, Movie.class);
            return movie;
        }
        catch (Exception e) {
            throw new Exception("Error\n" + e);
        }
    }

    static private HttpURLConnection openConnection(URL url) throws Exception {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        validateConnection(connection);
        return connection;
    }

    private static void validateConnection(HttpURLConnection connection) throws IOException {
        int codeSuccess = 200;
        if (connection.getResponseCode() != codeSuccess) {
            throw new RuntimeException("HTTP error code: " + connection.getResponseCode());
        }
    }
}
