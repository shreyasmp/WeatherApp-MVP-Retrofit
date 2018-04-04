package shreyas.weatherapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by shreyasmp on 4/2/18.
 */

public class ImageModel implements Serializable {

    @SerializedName("url")
    private String url;

    @SerializedName("title")
    private String title;

    @SerializedName("link")
    private  String link;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
