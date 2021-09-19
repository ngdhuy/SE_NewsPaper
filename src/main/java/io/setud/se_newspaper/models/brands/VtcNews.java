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
        super("VTC News", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new VtcNewsNewest(this.getUrlSourceNewest(), "VTC News");
    }

    @Override
    public Covid createCovid() throws Exception {
        return new VtcNewsCovid(this.getUrlSourceCovid(), "VTC News");
    }

    @Override
    public Politics createPolitics() throws Exception{
        return new VtcNewsPolitics(this.getUrlSourcePolitics(), "VTC News");
    }

    @Override
    public Business createBusiness() throws Exception {
        return new VtcNewsBusiness(this.getUrlSourceBusiness(), "VTC News");
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new VtcNewsTechnology(this.getUrlSourceTechnology(), "VTC News");
    }

    @Override
    public Health createHealth() throws Exception {
        return new VtcNewsHealth(this.getUrlSourceHealth(), "VTC News");
    }

    @Override
    public Sports createSports() throws Exception {
        return new VtcNewsSports(this.getUrlSourceSports(), "VTC News");
    }

    @Override
    public Entertainment createEntertainment() throws Exception{
        return new VtcNewsEntertainment(this.getUrlSourceEntertainment(), "VTC News");
    }

    @Override
    public World createWorld() throws Exception{
        return new VtcNewsWorld(this.getUrlSourceWorld(), "VTC News");
    }

    @Override
    public Others createOthers() throws Exception {
        return new VtcNewsOthers(this.getUrlSourceOthers(), "VTC News");
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new VtcNewsNewest(urlSource, "VTC News");
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new VtcNewsCovid(urlSource, "VTC News");
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception{
        this.setUrlSourcePolitics(urlSource);
        return new VtcNewsPolitics(urlSource, "VTC News");
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new VtcNewsBusiness(urlSource, "VTC News");
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new VtcNewsTechnology(urlSource, "VTC News");
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new VtcNewsHealth(urlSource, "VTC News");
    }

    @Override
    public Sports createSports(String urlSource) throws Exception {
        this.setUrlSourceSports(urlSource);
        return new VtcNewsSports(urlSource, "VTC News");
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception{
        this.setUrlSourceEntertainment(urlSource);
        return new VtcNewsEntertainment(urlSource, "VTC News");
    }

    @Override
    public World createWorld(String urlSource) throws Exception{
        this.setUrlSourceWorld(urlSource);
        return new VtcNewsWorld(urlSource, "VTC News");
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new VtcNewsOthers(urlSource, "VTC News");
    }
}
