package io.setud.se_newspaper.models.brands;

import io.setud.se_newspaper.models.Brand;
import io.setud.se_newspaper.models.NewsPaperFactory;
import io.setud.se_newspaper.models.categories.*;
import io.setud.se_newspaper.models.concretes.zingnews.*;

/**
 * io.setud.se_newspaper.models.brands
 * Created by ndhuy
 * Date 11/09/2021 - 23:19
 * Description: ...
 */
public class ZingNews extends Brand implements NewsPaperFactory {
    public ZingNews() {
        super();
    }

    public ZingNews(String urlLogo, String homepage) {
        super("Zing News", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new ZingNewsNewest(this.getUrlSourceNewest());
    }

    @Override
    public Covid createCovid() throws Exception {
        return new ZingNewsCovid(this.getUrlSourceCovid());
    }

    @Override
    public Politics createPolitics() throws Exception{
        return new ZingNewsPolitics(this.getUrlSourcePolitics());
    }

    @Override
    public Business createBusiness() throws Exception {
        return new ZingNewsBusiness(this.getUrlSourceBusiness());
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new ZingNewsTechnology(this.getUrlSourceTechnology());
    }

    @Override
    public Health createHealth() throws Exception {
        return new ZingNewsHealth(this.getUrlSourceHealth());
    }

    @Override
    public Sports createSports() throws Exception {
        return new ZingNewsSports(this.getUrlSourceSports());
    }

    @Override
    public Entertainment createEntertainment() throws Exception{
        return new ZingNewsEntertainment(this.getUrlSourceEntertainment());
    }

    @Override
    public World createWorld() throws Exception{
        return new ZingNewsWorld(this.getUrlSourceWorld());
    }

    @Override
    public Others createOthers() throws Exception {
        return new ZingNewsOthers(this.getUrlSourceOthers());
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new ZingNewsNewest(urlSource);
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new ZingNewsCovid(urlSource);
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception{
        this.setUrlSourcePolitics(urlSource);
        return new ZingNewsPolitics(urlSource);
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new ZingNewsBusiness(urlSource);
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new ZingNewsTechnology(urlSource);
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new ZingNewsHealth(urlSource);
    }

    @Override
    public Sports createSports(String urlSource) throws Exception {
        this.setUrlSourceSports(urlSource);
        return new ZingNewsSports(urlSource);
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception{
        this.setUrlSourceEntertainment(urlSource);
        return new ZingNewsEntertainment(urlSource);
    }

    @Override
    public World createWorld(String urlSource) throws Exception{
        this.setUrlSourceWorld(urlSource);
        return new ZingNewsWorld(urlSource);
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new ZingNewsOthers(urlSource);
    }
}
