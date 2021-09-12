package io.setud.se_newspaper.models;

/**
 * io.setud.se_newspaper.models
 * Created by ndhuy
 * Date 11/09/2021 - 21:12
 * Description: ...
 */
public abstract class Category {
    private String name;
    private String urlSource;
    private Feed feed;

    public Category() {
        this.name = "";
        this.urlSource = "";
        this.feed = new Feed();
    }

    public Category(String name, String urlSource) throws Exception {
        this.name = name;
        this.urlSource = urlSource;
        this.feed = new Feed(urlSource);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(String urlSource) {
        this.urlSource = urlSource;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }
}
