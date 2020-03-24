package com.example.weatherapp;

import com.example.weatherapp.models.Weather;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetDataService {

    @POST("/data/2.5/weather/")
    Call<Weather> getWeather(@Query("q") String city, @Query("appid") String appid);
}
