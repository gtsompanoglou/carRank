package tsobi.soft;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.HttpRequest;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HttpClient client = HttpClient.newHttpClient();
        Builder builder = new Builder();
        HttpRequest request = HttpRequest.uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
    }
}
