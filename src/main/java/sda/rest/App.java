package sda.rest;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        GetSender getSender = new GetSender();
        String response =
                getSender.send("http://localhost:8080/rest/webapi/myresource/52485521-ba2e-4a0a-8032-34ae197394b1");


        PostSender postSender = new PostSender();

        String jsonToSend = "{\"name\":\"Tomasz\", \"lastName\":\"Nowicki\"}";

        response = postSender.send("http://localhost:8080/rest/webapi/myresource", jsonToSend);
        System.out.println(response);
    }
}
