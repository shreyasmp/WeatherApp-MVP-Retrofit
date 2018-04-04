package shreyas.weatherapp.views.zipcode_list;

import shreyas.weatherapp.model.MainWeatherModel;

/**
 * Created by shreyasmp on 4/2/18.
 *
 * View interface which is implemented by Activity allowing loose coupling of UI with Presenter
 */

public interface ZipCodeListView {

    void setLoader(boolean loader);

    void showErrorMessage();

    void hideErrorMessage();

    void showWeatherResults(MainWeatherModel model);
}
