package io.setud.se_newspaper.models.brands;

import io.setud.se_newspaper.models.Brand;
import io.setud.se_newspaper.models.NewsPaperFactory;
import io.setud.se_newspaper.models.categories.*;
import io.setud.se_newspaper.models.concretes.vnexpress.*;

/**
 * io.setud.se_newspaper.models.brands
 * Created by ndhuy
 * Date 11/09/2021 - 21:41
 * Description: ...
 */
public class VnExpress extends Brand implements NewsPaperFactory {
    public VnExpress() {
        super();
    }

    public VnExpress(String urlLogo, String homepage) {
        super("VnExpress", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new VnExpressNewest(this.getUrlSourceNewest(), "VnExpress");
    }

    @Override
    public Covid createCovid() throws Exception {
        return new VnExpressCovid(this.getUrlSourceCovid(), "VnExpress");
    }

    @Override
    public Politics createPolitics() throws Exception {
        return new VnExpressPolitics(this.getUrlSourcePolitics(), "VnExpress");
    }

    @Override
    public Business createBusiness() throws Exception{
        return new VnExpressBusiness(this.getUrlSourceBusiness(), "VnExpress");
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new VnExpressTechnology(this.getUrlSourceTechnology(), "VnExpress");
    }

    @Override
    public Health createHealth() throws Exception {
        return new VnExpressHealth(this.getUrlSourceHealth(), "VnExpress");
    }

    @Override
    public Sports createSports() throws Exception {
        return new VnExpressSports(this.getUrlSourceSports(), "VnExpress");
    }

    @Override
    public Entertainment createEntertainment() throws Exception{
        return new VnExpressEntertainment(this.getUrlSourceEntertainment(), "VnExpress");
    }

    @Override
    public World createWorld() throws Exception {
        return new VnExpressWorld(this.getUrlSourceWorld(), "VnExpress");
    }

    @Override
    public Others createOthers() throws Exception {
        return new VnExpressOthers(this.getUrlSourceOthers(), "VnExpress");
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new VnExpressNewest(urlSource, "VnExpress");
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new VnExpressCovid(urlSource, "VnExpress");
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception {
        this.setUrlSourcePolitics(urlSource);
        return new VnExpressPolitics(urlSource, "VnExpress");
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception{
        this.setUrlSourceBusiness(urlSource);
        return new VnExpressBusiness(urlSource, "VnExpress");
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new VnExpressTechnology(urlSource, "VnExpress");
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new VnExpressHealth(urlSource, "VnExpress");
    }

    @Override
    public Sports createSports(String urlSource) throws Exception {
        this.setUrlSourceSports(urlSource);
        return new VnExpressSports(urlSource, "VnExpress");
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception{
        this.setUrlSourceEntertainment(urlSource);
        return new VnExpressEntertainment(urlSource, "VnExpress");
    }

    @Override
    public World createWorld(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new VnExpressWorld(urlSource, "VnExpress");
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new VnExpressOthers(urlSource, "VnExpress");
    }
}
