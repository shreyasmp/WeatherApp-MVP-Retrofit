package shreyas.weatherapp.presenter.zipcode_list;

/**
 * Created by shreyasmp on 4/2/18.
 *
 * Actions interface which is implemented by Presenter
 */

public interface ZipCodeListActions {

    void searchWeatherDetailForZip(String zipcode);

    void showWeatherDetail();

    void showError();

    void hideError();

    void setLoader();
}
