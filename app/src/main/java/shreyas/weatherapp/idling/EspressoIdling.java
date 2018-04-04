package shreyas.weatherapp.idling;

import android.support.test.espresso.IdlingResource;

/**
 * Created by shreyasmp on 4/3/18.
 * <p>
 * This class holds the counter and idle resource tracking for tests that are run
 * Reference {@link IdlingResource}
 */

public class EspressoIdling {

    public static WeatherIdlingResource weatherIdlingResource = new WeatherIdlingResource("TRACK");

    public static void incrementCounter() {
        weatherIdlingResource.incrementCounter();
    }

    public static void decrementCounter() {
        weatherIdlingResource.decrementCounter();
    }

    public static IdlingResource getIdlingResource() {
        return weatherIdlingResource;
    }
}
