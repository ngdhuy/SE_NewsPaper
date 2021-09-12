package io.setud.se_newspaper.models;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * io.setud.se_newspaper.models
 * Created by ndhuy
 * Date 10/09/2021 - 16:51
 * Description: ...
 */
public class Feed {
    private String urlSource;
    private ArrayList<News> lstNews;

    public Feed() {
        this.urlSource = "";
        this.lstNews = new ArrayList<News>();
    }

    public Feed(String urlSource) throws Exception {
        this.urlSource = urlSource;
        this.lstNews = new ArrayList<News>();
        if(this.urlSource.length() > 0)
            this.loadData();
    }

    public String getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(String urlSource) throws Exception {
        this.urlSource = urlSource;
        if(this.urlSource.length() > 0)
            this.loadData();
    }

    public ArrayList<News> getLstNews() {
        return lstNews;
    }

    public void setLstNews(ArrayList<News> lstNews) {
        this.lstNews = lstNews;
    }

    public void loadData() throws Exception {
        if(this.urlSource.length() > 0) {
            URL feedUrl = new URL(this.urlSource);
            SyndFeedInput syndFeedInput = new SyndFeedInput();
            SyndFeed syndFeed = syndFeedInput.build(new XmlReader(feedUrl));

            for(SyndEntry entry : (List<SyndEntry>) syndFeed.getEntries()) {
                News news = new News(entry);
                this.lstNews.add(news);
            }
        }
    }
}
