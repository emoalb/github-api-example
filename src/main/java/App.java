import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;


public class App {
    public static void main(String[] args) throws UnirestException {
        Unirest.setTimeouts(0, 0);
        GetRequest request = Unirest.get("https://api.github.com/repos/emoalb/FistTest/issues");
        HttpResponse<JsonNode> response = request.asJson();
        JsonNode jsonNode = response.getBody();
        System.out.println(response.getStatus());
        System.out.println("#########################################################################\n#########################################################################\n");

        System.out.println(response.getHeaders());
        System.out.println("#########################################################################\n#########################################################################\n");

        System.out.println(jsonNode);
        System.out.println("#########################################################################\n#########################################################################\n");
        PostGitHubApi postGitHubApi = new PostGitHubApi();
        postGitHubApi.Execute();


    }
}
