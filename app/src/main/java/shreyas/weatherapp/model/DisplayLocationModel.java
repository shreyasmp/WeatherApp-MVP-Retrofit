package shreyas.weatherapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by shreyasmp on 4/2/18.
 */

public class DisplayLocationModel implements Serializable {

    @SerializedName("zip")
    private String zip;

    @SerializedName("magic")
    private String magic;

    @SerializedName("full")
    private String full;

    @SerializedName("elevation")
    private String elevation;

    @SerializedName("state")
    private String state;

    @SerializedName("wmo")
    private String wmo;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("state_name")
    private String state_name;

    @SerializedName("country_iso3166")
    private String country_iso3166;

    @SerializedName("country")
    private String country;

    @SerializedName("city")
    private String city;

    public String getZip ()
    {
        return zip;
    }

    public void setZip (String zip)
    {
        this.zip = zip;
    }

    public String getMagic ()
    {
        return magic;
    }

    public void setMagic (String magic)
    {
        this.magic = magic;
    }

    public String getFull ()
    {
        return full;
    }

    public void setFull (String full)
    {
        this.full = full;
    }

    public String getElevation ()
    {
        return elevation;
    }

    public void setElevation (String elevation)
    {
        this.elevation = elevation;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getWmo ()
    {
        return wmo;
    }

    public void setWmo (String wmo)
    {
        this.wmo = wmo;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getState_name ()
    {
        return state_name;
    }

    public void setState_name (String state_name)
    {
        this.state_name = state_name;
    }

    public String getCountry_iso3166 ()
    {
        return country_iso3166;
    }

    public void setCountry_iso3166 (String country_iso3166)
    {
        this.country_iso3166 = country_iso3166;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }
}
