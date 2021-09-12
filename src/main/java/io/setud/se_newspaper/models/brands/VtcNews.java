package io.setud.se_newspaper.models.brands;

import io.setud.se_newspaper.models.Brand;
import io.setud.se_newspaper.models.NewsPaperFactory;
import io.setud.se_newspaper.models.categories.*;
import io.setud.se_newspaper.models.concretes.vtcnews.*;

/**
 * io.setud.se_newspaper.models.brands
 * Created by ndhuy
 * Date 11/09/2021 - 23:19
 * Description: ...
 */
public class VtcNews extends Brand implements NewsPaperFactory {
    public VtcNews() {
        super();
    }

    public VtcNews(String urlLogo, String homepage) {
        super("Zing News", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new VtcNewsNewest(this.getUrlSourceNewest());
    }

    @Override
    public Covid createCovid() throws Exception {
        return new VtcNewsCovid(this.getUrlSourceCovid());
    }

    @Override
    public Politics createPolitics() throws Exception{
        return new VtcNewsPolitics(this.getUrlSourcePolitics());
    }

    @Override
    public Business createBusiness() throws Exception {
        return new VtcNewsBusiness(this.getUrlSourceBusiness());
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new VtcNewsTechnology(this.getUrlSourceTechnology());
    }

    @Override
    public Health createHealth() throws Exception {
        return new VtcNewsHealth(this.getUrlSourceHealth());
    }

    @Override
    public Sports createSports() throws Exception {
        return new VtcNewsSports(this.getUrlSourceSports());
    }

    @Override
    public Entertainment createEntertainment() throws Exception{
        return new VtcNewsEntertainment(this.getUrlSourceEntertainment());
    }

    @Override
    public World createWorld() throws Exception{
        return new VtcNewsWorld(this.getUrlSourceWorld());
    }

    @Override
    public Others createOthers() throws Exception {
        return new VtcNewsOthers(this.getUrlSourceOthers());
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new VtcNewsNewest(urlSource);
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new VtcNewsCovid(urlSource);
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception{
        this.setUrlSourcePolitics(urlSource);
        return new VtcNewsPolitics(urlSource);
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new VtcNewsBusiness(urlSource);
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new VtcNewsTechnology(urlSource);
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new VtcNewsHealth(urlSource);
    }

    @Override
    public Sports createSports(String urlSource) throws Exception {
        this.setUrlSourceSports(urlSource);
        return new VtcNewsSports(urlSource);
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception{
        this.setUrlSourceEntertainment(urlSource);
        return new VtcNewsEntertainment(urlSource);
    }

    @Override
    public World createWorld(String urlSource) throws Exception{
        this.setUrlSourceWorld(urlSource);
        return new VtcNewsWorld(urlSource);
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new VtcNewsOthers(urlSource);
    }
}
