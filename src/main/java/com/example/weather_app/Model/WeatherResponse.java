package com.example.weather_app.Model;

public class WeatherResponse {
    private String name;
    private Sys sys;
    private List<Weather> weather;
    private Main main;
    private Wind wind;

    public static class Sys{
        private String country;


        public String getCountry(){
            return country;
        }
        
        public void setCountry(String country){
            this.country = country;
        }
    }
    public static class Weather{}
}
