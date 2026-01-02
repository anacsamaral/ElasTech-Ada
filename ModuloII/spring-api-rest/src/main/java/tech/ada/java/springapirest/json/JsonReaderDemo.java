package tech.ada.java.springapirest.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class JsonReaderDemo {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        //lerComScanner();
        lerComHttpClient();
    }

    private static void lerComHttpClient() {
        try(HttpClient cliente = HttpClient.newBuilder().build()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dummyjson.com/posts/1"))
                    .build();
            cliente.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(stringHttpResponse -> convertJsonToPost(stringHttpResponse.body()))
                    .thenAccept(post -> System.out.println(post.getTitle()))
                    .join();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void lerComScanner() {
        try(Scanner scanner = new Scanner(new URL("https://dummyjson.com/posts/1").openStream())){
            String json = scanner.nextLine();
            Post post = convertJsonToPost(json);
            System.out.println(json);
            System.out.println(post.getTitle());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @SneakyThrows
    private static Post convertJsonToPost(String json){
        return mapper.readValue(json, Post.class);
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Post {
    private Long id;
    private String title;
    private String body;
    private Long userId;
    private Long views;
    private String[] tags;
    private Reaction reactions;
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Reaction {
    private Long likes;
    private Long dislikes;
}
