package shreyas.weatherapp.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import shreyas.weatherapp.utils.AppConstants;

/**
 * Created by shreyasmp on 4/2/18.
 *
 * Service call API for weather app, which uses the weather API interface in building the URL
 */

public class WeatherDetailedResponseServiceCall implements AppConstants {

    private static final String TAG = WeatherDetailedResponseServiceCall.class.getSimpleName();

    private String BASE_URL = WEATHER_APP_URL;
    private Retrofit retrofit = null;
    private OkHttpClient okHttpClient = null;
    private HttpLoggingInterceptor httpLoggingInterceptor = null;

    public WeatherDetailedResponseAPI getClient() {
        httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofit.create(WeatherDetailedResponseAPI.class);
    }
}
