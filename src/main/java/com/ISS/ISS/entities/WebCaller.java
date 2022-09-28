package com.ISS.ISS.entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class WebCaller {
    private final String URL = "http://api.open-notify.org/iss-now";

    public Iss getNewData() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(URL)
                .build();
        Call call = client.newCall(request);
        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        Iss currentIss = null;
        try {
            currentIss = objectMapper.readValue(response.body().string(), Iss.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return currentIss;
    }
}
