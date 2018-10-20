package sda.rest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PostSender {

    HttpClient httpClient = new DefaultHttpClient();

    public String send(String url, String payload) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setEntity(new StringEntity(payload));

        HttpResponse response = httpClient.execute(httpPost);

        String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
        return responseString;

    }
}
