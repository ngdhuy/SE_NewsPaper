package io.setud.se_newspaper.models;

/**
 * io.setud.se_newspaper.models
 * Created by ndhuy
 * Date 11/09/2021 - 21:10
 * Description: ...
 */
public abstract class Brand {
    private String name;
    private String urlLogo;
    private String urlHomepage;

    private String urlSourceBusiness;
    private String urlSourceCovid;
    private String urlSourceEntertainment;
    private String urlSourceHealth;
    private String urlSourceNewest;
    private String urlSourceOthers;
    private String urlSourcePolitics;
    private String urlSourceSports;
    private String urlSourceTechnology;
    private String urlSourceWorld;

    public Brand() {
        this.name = "";
        this.urlLogo = "";
        this.urlHomepage = "";
    }

    public Brand(String name, String urlLogo, String urlHomepage) {
        this.name = name;
        this.urlLogo = urlLogo;
        this.urlHomepage = urlHomepage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public String getUrlHomepage() {
        return urlHomepage;
    }

    public void setUrlHomepage(String urlHomepage) {
        this.urlHomepage = urlHomepage;
    }

    public String getUrlSourceBusiness() {
        return urlSourceBusiness;
    }

    public void setUrlSourceBusiness(String urlSourceBusiness) {
        this.urlSourceBusiness = urlSourceBusiness;
    }

    public String getUrlSourceCovid() {
        return urlSourceCovid;
    }

    public void setUrlSourceCovid(String urlSourceCovid) {
        this.urlSourceCovid = urlSourceCovid;
    }

    public String getUrlSourceEntertainment() {
        return urlSourceEntertainment;
    }

    public void setUrlSourceEntertainment(String urlSourceEntertainment) {
        this.urlSourceEntertainment = urlSourceEntertainment;
    }

    public String getUrlSourceHealth() {
        return urlSourceHealth;
    }

    public void setUrlSourceHealth(String urlSourceHealth) {
        this.urlSourceHealth = urlSourceHealth;
    }

    public String getUrlSourceNewest() {
        return urlSourceNewest;
    }

    public void setUrlSourceNewest(String urlSourceNewest) {
        this.urlSourceNewest = urlSourceNewest;
    }

    public String getUrlSourceOthers() {
        return urlSourceOthers;
    }

    public void setUrlSourceOthers(String urlSourceOthers) {
        this.urlSourceOthers = urlSourceOthers;
    }

    public String getUrlSourcePolitics() {
        return urlSourcePolitics;
    }

    public void setUrlSourcePolitics(String urlSourcePolitics) {
        this.urlSourcePolitics = urlSourcePolitics;
    }

    public String getUrlSourceSports() {
        return urlSourceSports;
    }

    public void setUrlSourceSports(String urlSourceSports) {
        this.urlSourceSports = urlSourceSports;
    }

    public String getUrlSourceTechnology() {
        return urlSourceTechnology;
    }

    public void setUrlSourceTechnology(String urlSourceTechnology) {
        this.urlSourceTechnology = urlSourceTechnology;
    }

    public String getUrlSourceWorld() {
        return urlSourceWorld;
    }

    public void setUrlSourceWorld(String urlSourceWorld) {
        this.urlSourceWorld = urlSourceWorld;
    }
}
