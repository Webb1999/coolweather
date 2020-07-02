package com.example.coolweather.gson;

/**
 * Created by Webb on 2020/7/2.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
