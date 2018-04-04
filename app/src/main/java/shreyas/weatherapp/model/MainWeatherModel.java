package shreyas.weatherapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by shreyasmp on 4/2/18.
 *
 * Main model class of the weather api response
 */

public class MainWeatherModel implements Serializable {

    @SerializedName("response")
    private ResponseModel responseModel;

    @SerializedName("current_observation")
    private CurrentObservationModel currentObservationModel;


    public ResponseModel getResponseModel() {
        return responseModel;
    }

    public void setResponseModel(ResponseModel responseModel) {
        this.responseModel = responseModel;
    }

    public CurrentObservationModel getCurrentObservationModel() {
        return currentObservationModel;
    }

    public void setCurrentObservationModel(CurrentObservationModel currentObservationModel) {
        this.currentObservationModel = currentObservationModel;
    }
}
