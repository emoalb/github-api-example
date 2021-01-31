import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import junit.framework.*;
import org.junit.Test;


public class GitHubApi extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testGetReqWithValidURLShouldGiveStatus200 () throws UnirestException {
        GetRequest request = Unirest.get("https://api.github.com/repos/emoalb/FistTest/issues");
        HttpResponse<JsonNode> response = request.asJson();
        assertEquals(200,response.getStatus());

    }
}
