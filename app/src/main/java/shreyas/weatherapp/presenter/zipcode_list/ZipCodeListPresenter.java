package shreyas.weatherapp.presenter.zipcode_list;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shreyas.weatherapp.idling.EspressoIdling;
import shreyas.weatherapp.model.MainWeatherModel;
import shreyas.weatherapp.service.WeatherDetailedResponseServiceCall;
import shreyas.weatherapp.views.zipcode_list.ZipCodeListView;

/**
 * Created by shreyasmp on 4/2/18.
 *
 *  Presenter which holds the logic of performing the service call and basic UI operations
 *  like show / hide progress bar and show / hide error over
 */

public class ZipCodeListPresenter implements ZipCodeListActions {


    private static final String TAG = ZipCodeListPresenter.class.getSimpleName();
    private final ZipCodeListView zipCodeListView;
    private final WeatherDetailedResponseServiceCall serviceCall;
    private MainWeatherModel model;

    public ZipCodeListPresenter(ZipCodeListView zipCodeListView) {
        this.zipCodeListView = zipCodeListView;
        this.serviceCall = new WeatherDetailedResponseServiceCall();
    }

    @Override
    public void searchWeatherDetailForZip(String zipcode) {
        zipCodeListView.setLoader(true);
        zipCodeListView.hideErrorMessage();

        // Informing espresso that network call is triggered
        EspressoIdling.incrementCounter();

        // service call to get the response and map the response to MainModel class

        serviceCall.getClient()
                .getWeatherDetailedResponse(zipcode)
                .enqueue(new Callback<MainWeatherModel>() {
                    @Override
                    public void onResponse(Call<MainWeatherModel> call, Response<MainWeatherModel> response) {

                        // decrementing counter for idle resource time
                        EspressoIdling.decrementCounter();

                        model = response.body();
                        if (null == model.getCurrentObservationModel()) {
                            zipCodeListView.setLoader(false);
                            zipCodeListView.showErrorMessage();
                        } else {
                            zipCodeListView.setLoader(false);
                            zipCodeListView.showWeatherResults(model);
                        }
                    }

                    @Override
                    public void onFailure(Call<MainWeatherModel> call, Throwable t) {
                        zipCodeListView.setLoader(false);
                        zipCodeListView.showErrorMessage();
                    }
                });
    }

    @Override
    public void showWeatherDetail() {
        zipCodeListView.showWeatherResults(model);
    }

    @Override
    public void showError() {
        zipCodeListView.showErrorMessage();
    }

    @Override
    public void hideError() {
        zipCodeListView.hideErrorMessage();
    }

    @Override
    public void setLoader() {
        zipCodeListView.setLoader(true);
        zipCodeListView.setLoader(false);
    }
}
