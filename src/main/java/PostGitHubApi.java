import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.body.RequestBodyEntity;

public class PostGitHubApi {
    public void  Execute() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        String httpBody = "{\r\n\r\n    \"title\":\"Something\",\r\n    \"body\":\"Created with Java 2\",\r\n    \"labels\":[\"bug\"]\r\n}";
        RequestBodyEntity request = Unirest.post("https://api.github.com/repos/emoalb/FistTest/issues")
                .header("Authorization", "Basic ZW1vYWxiOjMwMGRjNjNhMjBiODA3NTY5ZDYwZjlkNDgyYzE2Yzk3YmRjMDkxYTA=")
                .header("Content-Type", "application/json")
                .body(httpBody);
     HttpResponse<JsonNode> response = request.asJson();
     JsonNode node =  response.getBody();
        System.out.println(node);

    }
}
