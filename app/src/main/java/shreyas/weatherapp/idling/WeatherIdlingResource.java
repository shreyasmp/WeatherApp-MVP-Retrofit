package shreyas.weatherapp.idling;

import android.support.test.espresso.IdlingResource;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by shreyasmp on 4/3/18.
 * <p>
 * Referenced from
 * https://github.com/googlesamples/android-testing/tree/master/ui/espresso/IdlingResourceSample
 * <p>
 * https://github.com/JakeWharton/okhttp-idling-resource
 * <p>
 * helps in sync of multiple threads and keeping track of pending operations.
 * <p>
 * This class also helps in starting a counter if a test runs and ends
 */

public class WeatherIdlingResource implements IdlingResource {

    private String resourceName;

    private final AtomicInteger counter = new AtomicInteger(0);

    private volatile ResourceCallback resourceCallback;

    public WeatherIdlingResource(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public String getName() {
        return resourceName;
    }

    @Override
    public boolean isIdleNow() {
        return counter.get() == 0;
    }

    @Override
    public void registerIdleTransitionCallback(ResourceCallback callback) {
        this.resourceCallback = callback;
    }

    public void incrementCounter() {
        counter.getAndIncrement();
    }

    public void decrementCounter() {
        int value = counter.decrementAndGet();
        if (value == 0) {
            if (resourceCallback != null) {
                resourceCallback.onTransitionToIdle();
            }
        }

        if (value < 0) {
            throw new IllegalArgumentException("Counter value is invalid");
        }
    }

}
