package com.example.weather_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class WeatherController{

    @Value("${api.key}")
    private String apiKey;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
    
    @GetMapping("/weather")
    public String getWeather(@RequestParam("city")String city, Model model) {
        String url = "http:api.openweathermap.org/data/2.5/weather?q" + city + "&appId" + apiKey +"&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse;
    }
    
}