package com.main.controller;

import com.main.entity.WeatherResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {

        if (city.equalsIgnoreCase("pune")) {

            return new WeatherResponse(
                    "Pune",
                    "28°C",
                    "Cloudy"
            );
        }

        if (city.equalsIgnoreCase("mumbai")) {

            return new WeatherResponse(
                    "Mumbai",
                    "31°C",
                    "Sunny"
            );
        }

        return new WeatherResponse(
                city,
                "25°C",
                "Pleasant"
        );
    }
}