package shreyas.weatherapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by shreyasmp on 4/2/18.
 */

public class CurrentObservationModel implements Serializable {

    @SerializedName("image")
    private ImageModel imageModel;

    @SerializedName("display_location")
    private DisplayLocationModel displayLocationModel;

    @SerializedName("observation_location")
    private ObservationLocationModel observationLocationModel;

    @SerializedName("estimated")
    private EstimatedModel estimatedModel;

    @SerializedName("station_id")
    private String stationID;

    @SerializedName("observation_time")
    private String observationTime;

    @SerializedName("observation_time_rfc822")
    private String observationTimeRFC;

    @SerializedName("precip_1hr_metric")
    private String precip_1hr_metric;

    @SerializedName("wind_gust_mph")
    private String wind_gust_mph;

    @SerializedName("local_tz_offset")
    private String local_tz_offset;

    @SerializedName("precip_today_metric")
    private String precip_today_metric;

    @SerializedName("pressure_trend")
    private String pressure_trend;

    @SerializedName("wind_kph")
    private String wind_kph;

    @SerializedName("forecast_url")
    private String forecast_url;

    @SerializedName("windchill_f")
    private String windchill_f;

    @SerializedName("windchill_c")
    private String windchill_c;

    @SerializedName("history_url")
    private String history_url;

    @SerializedName("wind_degrees")
    private String wind_degrees;

    @SerializedName("pressure_in")
    private String pressure_in;

    @SerializedName("dewpoint_c")
    private String dewpoint_c;

    @SerializedName("pressure_mb")
    private String pressure_mb;

    @SerializedName("")
    private String windchill_string;

    @SerializedName("windchill_string")
    private String weather;

    @SerializedName("UV")
    private String UV;

    @SerializedName("observation_epoch")
    private String observation_epoch;

    @SerializedName("wind_gust_kph")
    private String wind_gust_kph;

    @SerializedName("icon")
    private String icon;

    @SerializedName("precip_1hr_in")
    private String precip_1hr_in;

    @SerializedName("feelslike_string")
    private String feelslike_string;

    @SerializedName("temp_f")
    private String temp_f;

    @SerializedName("local_tz_long")
    private String local_tz_long;

    @SerializedName("relative_humidity")
    private String relative_humidity;

    @SerializedName("local_time_rfc822")
    private String local_time_rfc822;

    @SerializedName("precip_1hr_string")
    private String precip_1hr_string;

    @SerializedName("temp_c")
    private String temp_c;

    @SerializedName("icon_url")
    private String icon_url;

    @SerializedName("wind_dir")
    private String wind_dir;

    @SerializedName("solarradiation")
    private String solarradiation;

    @SerializedName("dewpoint_f")
    private String dewpoint_f;

    @SerializedName("nowcast")
    private String nowcast;

    @SerializedName("visibility_mi")
    private String visibility_mi;

    @SerializedName("visibility_km")
    private String visibility_km;

    @SerializedName("heat_index_c")
    private String heat_index_c;

    @SerializedName("temperature_string")
    private String temperature_string;

    @SerializedName("wind_mph")
    private String wind_mph;

    @SerializedName("precip_today_string")
    private String precip_today_string;

    @SerializedName("feelslike_f")
    private String feelslike_f;

    @SerializedName("feelslike_c")
    private String feelslike_c;

    @SerializedName("heat_index_f")
    private String heat_index_f;

    @SerializedName("local_tz_short")
    private String local_tz_short;

    @SerializedName("local_epoch")
    private String local_epoch;

    @SerializedName("heat_index_string")
    private String heat_index_string;

    @SerializedName("wind_string")
    private String wind_string;

    @SerializedName("precip_today_in")
    private String precip_today_in;

    @SerializedName("ob_url")
    private String ob_url;

    @SerializedName("dewpoint_string")
    private String dewpoint_string;

    public ImageModel getImageModel() {
        return imageModel;
    }

    public void setImageModel(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    public DisplayLocationModel getDisplayLocationModel() {
        return displayLocationModel;
    }

    public void setDisplayLocationModel(DisplayLocationModel displayLocationModel) {
        this.displayLocationModel = displayLocationModel;
    }

    public ObservationLocationModel getObservationLocationModel() {
        return observationLocationModel;
    }

    public void setObservationLocationModel(ObservationLocationModel observationLocationModel) {
        this.observationLocationModel = observationLocationModel;
    }

    public EstimatedModel getEstimatedModel() {
        return estimatedModel;
    }

    public void setEstimatedModel(EstimatedModel estimatedModel) {
        this.estimatedModel = estimatedModel;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObservationTimeRFC() {
        return observationTimeRFC;
    }

    public void setObservationTimeRFC(String observationTimeRFC) {
        this.observationTimeRFC = observationTimeRFC;
    }

    public String getPrecip_1hr_metric() {
        return precip_1hr_metric;
    }

    public void setPrecip_1hr_metric(String precip_1hr_metric) {
        this.precip_1hr_metric = precip_1hr_metric;
    }

    public String getWind_gust_mph() {
        return wind_gust_mph;
    }

    public void setWind_gust_mph(String wind_gust_mph) {
        this.wind_gust_mph = wind_gust_mph;
    }

    public String getLocal_tz_offset() {
        return local_tz_offset;
    }

    public void setLocal_tz_offset(String local_tz_offset) {
        this.local_tz_offset = local_tz_offset;
    }

    public String getPrecip_today_metric() {
        return precip_today_metric;
    }

    public void setPrecip_today_metric(String precip_today_metric) {
        this.precip_today_metric = precip_today_metric;
    }

    public String getPressure_trend() {
        return pressure_trend;
    }

    public void setPressure_trend(String pressure_trend) {
        this.pressure_trend = pressure_trend;
    }

    public String getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(String wind_kph) {
        this.wind_kph = wind_kph;
    }

    public String getForecast_url() {
        return forecast_url;
    }

    public void setForecast_url(String forecast_url) {
        this.forecast_url = forecast_url;
    }

    public String getWindchill_f() {
        return windchill_f;
    }

    public void setWindchill_f(String windchill_f) {
        this.windchill_f = windchill_f;
    }

    public String getWindchill_c() {
        return windchill_c;
    }

    public void setWindchill_c(String windchill_c) {
        this.windchill_c = windchill_c;
    }

    public String getHistory_url() {
        return history_url;
    }

    public void setHistory_url(String history_url) {
        this.history_url = history_url;
    }

    public String getWind_degrees() {
        return wind_degrees;
    }

    public void setWind_degrees(String wind_degrees) {
        this.wind_degrees = wind_degrees;
    }

    public String getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(String pressure_in) {
        this.pressure_in = pressure_in;
    }

    public String getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(String dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public String getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(String pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public String getWindchill_string() {
        return windchill_string;
    }

    public void setWindchill_string(String windchill_string) {
        this.windchill_string = windchill_string;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getUV() {
        return UV;
    }

    public void setUV(String UV) {
        this.UV = UV;
    }

    public String getObservation_epoch() {
        return observation_epoch;
    }

    public void setObservation_epoch(String observation_epoch) {
        this.observation_epoch = observation_epoch;
    }

    public String getWind_gust_kph() {
        return wind_gust_kph;
    }

    public void setWind_gust_kph(String wind_gust_kph) {
        this.wind_gust_kph = wind_gust_kph;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPrecip_1hr_in() {
        return precip_1hr_in;
    }

    public void setPrecip_1hr_in(String precip_1hr_in) {
        this.precip_1hr_in = precip_1hr_in;
    }

    public String getFeelslike_string() {
        return feelslike_string;
    }

    public void setFeelslike_string(String feelslike_string) {
        this.feelslike_string = feelslike_string;
    }

    public String getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(String temp_f) {
        this.temp_f = temp_f;
    }

    public String getLocal_tz_long() {
        return local_tz_long;
    }

    public void setLocal_tz_long(String local_tz_long) {
        this.local_tz_long = local_tz_long;
    }

    public String getRelative_humidity() {
        return relative_humidity;
    }

    public void setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
    }

    public String getLocal_time_rfc822() {
        return local_time_rfc822;
    }

    public void setLocal_time_rfc822(String local_time_rfc822) {
        this.local_time_rfc822 = local_time_rfc822;
    }

    public String getPrecip_1hr_string() {
        return precip_1hr_string;
    }

    public void setPrecip_1hr_string(String precip_1hr_string) {
        this.precip_1hr_string = precip_1hr_string;
    }

    public String getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(String temp_c) {
        this.temp_c = temp_c;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public String getDewpoint_f() {
        return dewpoint_f;
    }

    public void setDewpoint_f(String dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public String getNowcast() {
        return nowcast;
    }

    public void setNowcast(String nowcast) {
        this.nowcast = nowcast;
    }

    public String getVisibility_mi() {
        return visibility_mi;
    }

    public void setVisibility_mi(String visibility_mi) {
        this.visibility_mi = visibility_mi;
    }

    public String getVisibility_km() {
        return visibility_km;
    }

    public void setVisibility_km(String visibility_km) {
        this.visibility_km = visibility_km;
    }

    public String getHeat_index_c() {
        return heat_index_c;
    }

    public void setHeat_index_c(String heat_index_c) {
        this.heat_index_c = heat_index_c;
    }

    public String getTemperature_string() {
        return temperature_string;
    }

    public void setTemperature_string(String temperature_string) {
        this.temperature_string = temperature_string;
    }

    public String getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(String wind_mph) {
        this.wind_mph = wind_mph;
    }

    public String getPrecip_today_string() {
        return precip_today_string;
    }

    public void setPrecip_today_string(String precip_today_string) {
        this.precip_today_string = precip_today_string;
    }

    public String getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(String feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public String getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(String feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public String getHeat_index_f() {
        return heat_index_f;
    }

    public void setHeat_index_f(String heat_index_f) {
        this.heat_index_f = heat_index_f;
    }

    public String getLocal_tz_short() {
        return local_tz_short;
    }

    public void setLocal_tz_short(String local_tz_short) {
        this.local_tz_short = local_tz_short;
    }

    public String getLocal_epoch() {
        return local_epoch;
    }

    public void setLocal_epoch(String local_epoch) {
        this.local_epoch = local_epoch;
    }

    public String getHeat_index_string() {
        return heat_index_string;
    }

    public void setHeat_index_string(String heat_index_string) {
        this.heat_index_string = heat_index_string;
    }

    public String getWind_string() {
        return wind_string;
    }

    public void setWind_string(String wind_string) {
        this.wind_string = wind_string;
    }

    public String getPrecip_today_in() {
        return precip_today_in;
    }

    public void setPrecip_today_in(String precip_today_in) {
        this.precip_today_in = precip_today_in;
    }

    public String getOb_url() {
        return ob_url;
    }

    public void setOb_url(String ob_url) {
        this.ob_url = ob_url;
    }

    public String getDewpoint_string() {
        return dewpoint_string;
    }

    public void setDewpoint_string(String dewpoint_string) {
        this.dewpoint_string = dewpoint_string;
    }


}
