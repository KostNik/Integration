package com.edu.sandbox.weather;

import com.edu.sandbox.weather.domain.WeatherPrediction;
import lombok.extern.log4j.Log4j2;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Log4j2
public class WeatherReceiverServiceImpl implements WeatherReceiverService {


    @Override
    public WeatherPrediction getCurrentWeatherInfo(WeatherPredictionQuery query) {
        log.info("Weather query {}", query);
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        try {
            CloseableHttpResponse execute = httpClient.execute(null);
            execute.getEntity();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
