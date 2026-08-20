package com.main.controller;

import com.main.entity.WeatherResponse;
import com.main.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client/weather")
public class WeatherClientController {

    private final WeatherService weatherService;

    public WeatherClientController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {

        return weatherService.getWeather(city);
    }
}