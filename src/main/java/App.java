
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws UnirestException, IOException {

        //insert the copied code below this line


        System.out.println(new JSONObject(response.body()).toString(2));
    }

}
