package shreyas.weatherapp.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import shreyas.weatherapp.model.MainWeatherModel;

/**
 * Created by shreyasmp on 4/2/18.
 *
 * Service API for getting the json response for weather app
 */

public interface WeatherDetailedResponseAPI {

    @GET("q/{zipcode}.json")
    Call<MainWeatherModel> getWeatherDetailedResponse(@Path("zipcode") String zipCode);
}
