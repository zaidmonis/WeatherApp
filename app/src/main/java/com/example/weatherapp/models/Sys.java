package com.example.weatherapp.models;

public class Sys {
    String country;
    long sunrise;
    long sunset;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public Sys(String country, long sunrise, long sunset) {
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
}
