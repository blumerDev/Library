package com.example.Library.Client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public abstract class WebClientConfiguration {

    private static final Logger log = LogManager.getLogger(WebClientConfiguration.class);

    public String getBaseClientUrl() {
        return null;
    }

    public String executeGet(String url) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(getBaseClientUrl() + url)).build();

        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(200)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 200) {
            try {
                return response.body();
            } catch (Exception e) {
                log.error("Error parsing: .Url: " + e + getBaseClientUrl() + url);
            }
        } else {
            log.error("[getRequest] Error, api response status is: " + response.statusCode() + "but expect: " + HttpStatus.OK);
        }
        return null;
    }

}
