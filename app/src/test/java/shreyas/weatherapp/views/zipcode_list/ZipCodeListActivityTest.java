package shreyas.weatherapp.views.zipcode_list;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import shreyas.weatherapp.model.MainWeatherModel;
import shreyas.weatherapp.presenter.zipcode_list.ZipCodeListPresenter;

import static org.mockito.Mockito.verify;

/**
 * Created by shreyasmp on 4/3/18.
 */

@RunWith(MockitoJUnitRunner.class)
public class ZipCodeListActivityTest {

    private ZipCodeListPresenter zipCodeListPresenter;

    @Mock
    private ZipCodeListView zipCodeListView;

    @Before
    public void setup() throws IOException {
        zipCodeListPresenter = new ZipCodeListPresenter(zipCodeListView);
    }

    @Test
    public void showError() throws IOException {
        zipCodeListPresenter.showError();

        verify(zipCodeListView).showErrorMessage();
    }

    @Test
    public void hideError() throws IOException {
        zipCodeListPresenter.hideError();

        verify(zipCodeListView).hideErrorMessage();
    }

    @Test
    public void setLoaderTrue() throws IOException {
        zipCodeListPresenter.setLoader();

        verify(zipCodeListView).setLoader(true);
    }

    @Test
    public void setLoaderFalse() throws IOException {
        zipCodeListPresenter.setLoader();

        verify(zipCodeListView).setLoader(false);
    }

    @Test
    public void showZipCodeList() throws IOException {
        zipCodeListPresenter.showWeatherDetail();

        MainWeatherModel model = null;
        verify(zipCodeListView).showWeatherResults(model);
    }
}
