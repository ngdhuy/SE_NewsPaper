package io.setud.se_newspaper.models;

import com.rometools.rome.feed.synd.SyndEntry;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * io.setud.se_newspaper.models
 * Created by ndhuy
 * Date 10/09/2021 - 16:06
 * Description: ...
 */
public class News {
    private String title;
    private String link;
    private Date date;
    private String urlThumbnail;
    private String brand;
    private String urlBrandLogo;

    public News() {
        this.title = "";
        this.link = "";
        this.date = new Date();
        this.urlThumbnail = "";
    }

    public News(String title, String link, Date date, String urlThumbnail, String brand, String urlBrandLogo) {
        this.title = title;
        this.link = link;
        this.date = date;
        this.urlThumbnail = urlThumbnail;
        this.brand = brand;
    }

    public News(SyndEntry entry, String brand) {
        this.title = entry.getTitle();
        this.link = entry.getLink();
        this.date = entry.getPublishedDate();

        this.brand = brand;

        String description = entry.getDescription().getValue();
        String regex = "src=\"(.*?)\"";
        Matcher m = Pattern.compile(regex).matcher(description);
        if (m.find())
            this.urlThumbnail = m.group(1);
        else
            this.urlThumbnail = "";
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrlThumbnail() {
        return urlThumbnail;
    }

    public void setUrlThumbnail(String urlThumbnail) {
        this.urlThumbnail = urlThumbnail;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        String sNews = "";
        sNews += "Title: " + this.title + "\n";
        sNews += "Link: " + this.link + "\n";
        sNews += (this.date != null) ? "Date: " + this.date.toString() + "\n" : "";
        sNews += "Image: " + this.urlThumbnail;
        return sNews;
    }
}
