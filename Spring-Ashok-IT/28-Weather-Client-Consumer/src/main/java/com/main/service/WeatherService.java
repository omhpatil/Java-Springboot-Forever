package com.main.service;

import com.main.entity.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeather(String city) {

        String url = "http://localhost:8081/weather/" + city;

        WeatherResponse response =
                restTemplate.getForObject(
                        url,
                        WeatherResponse.class
                );

        return response;
    }
}