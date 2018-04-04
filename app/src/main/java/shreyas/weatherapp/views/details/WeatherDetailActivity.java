package shreyas.weatherapp.views.details;

import android.databinding.DataBindingUtil;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import shreyas.weatherapp.R;
import shreyas.weatherapp.databinding.ActivityWeatherDetailBinding;
import shreyas.weatherapp.model.MainWeatherModel;
import shreyas.weatherapp.utils.AppConstants;

/**
 * Created by shreyasmp on 4/2/18.
 *
 * Weather Detail activity which displays the three basic weather things from Weather response, which are
 * full city name, temperature in C and F.
 */

public class WeatherDetailActivity extends AppCompatActivity implements AppConstants {

    private static final String TAG = WeatherDetailActivity.class.getSimpleName();
    private ActivityWeatherDetailBinding binding;
    private MainWeatherModel mainWeatherModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_weather_detail, null);

        if(null == savedInstanceState) {
            savedInstanceState = getIntent().getExtras();
            mainWeatherModel = (MainWeatherModel) savedInstanceState.getSerializable(WEATHER_MODEL);
        }

        initViews();
    }

    protected void initViews() {
        binding.toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(binding.toolbar);

        // display back arrow for toolbar which navigates back to search activity
        final Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material, null);
        upArrow.setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.detailWeatherValue.setText(mainWeatherModel.getCurrentObservationModel().getDisplayLocationModel().getFull());
        binding.detailWeatherTemperatureCValue.setText(mainWeatherModel.getCurrentObservationModel().getTemp_c());
        binding.detailWeatherTemperatureFValue.setText(mainWeatherModel.getCurrentObservationModel().getTemp_f());
    }

    // Method for back arrow functionality

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
