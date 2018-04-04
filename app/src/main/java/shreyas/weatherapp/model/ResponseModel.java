package shreyas.weatherapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by shreyasmp on 4/2/18.
 */

public class ResponseModel implements Serializable {

    @SerializedName("version")
    private String version;

    @SerializedName("termsofService")
    private String termsOfService;

    @SerializedName("features")
    private FeaturesModel features;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public FeaturesModel getFeatures() {
        return features;
    }

    public void setFeatures(FeaturesModel features) {
        this.features = features;
    }
}
