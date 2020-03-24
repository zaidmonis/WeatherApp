package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weatherapp.models.Weather;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);


        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<Weather> call = service.getWeather("Najibabad", "15c2d7622febfb6c44b614332359fbee");
        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                //Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                Weather weather = response.body();
                textView.setText(String.valueOf(weather.getMain().getFeels_like()));
                //progressDoalog.dismiss();
                //generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                //progressDoalog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
