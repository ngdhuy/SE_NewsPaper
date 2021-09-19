package io.setud.se_newspaper.models.brands;

import io.setud.se_newspaper.models.Brand;
import io.setud.se_newspaper.models.NewsPaperFactory;
import io.setud.se_newspaper.models.categories.*;
import io.setud.se_newspaper.models.concretes.thanhnien.*;

/**
 * io.setud.se_newspaper.models.brands
 * Created by ndhuy
 * Date 11/09/2021 - 23:10
 * Description: ...
 */
public class ThanhNien extends Brand implements NewsPaperFactory {
    public ThanhNien() {
        super();
    }

    public ThanhNien(String urlLogo, String homepage) {
        super("Thanh Nien", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new ThanhNienNewest(this.getUrlSourceNewest(), "Thanh Nien");
    }

    @Override
    public Covid createCovid() throws Exception {
        return new ThanhNienCovid(this.getUrlSourceCovid(), "Thanh Nien");
    }

    @Override
    public Politics createPolitics() throws Exception {
        return new ThanhNienPolitics(this.getUrlSourcePolitics(), "Thanh Nien");
    }

    @Override
    public Business createBusiness() throws Exception {
        return new ThanhNienBusiness(this.getUrlSourceBusiness(), "Thanh Nien");
    }

    @Override
    public Technology createTechnology() throws Exception{
        return new ThanhNienTechnology(this.getUrlSourceTechnology(), "Thanh Nien");
    }

    @Override
    public Health createHealth() throws Exception{
        return new ThanhNienHealth(this.getUrlSourceHealth(), "Thanh Nien");
    }

    @Override
    public Sports createSports() throws Exception {
        return new ThanhNienSports(this.getUrlSourceSports(), "Thanh Nien");
    }

    @Override
    public Entertainment createEntertainment() throws Exception {
        return new ThanhNienEntertainment(this.getUrlSourceEntertainment(), "Thanh Nien");
    }

    @Override
    public World createWorld() throws Exception {
        return new ThanhNienWorld(this.getUrlSourceWorld(), "Thanh Nien");
    }

    @Override
    public Others createOthers() throws Exception {
        return new ThanhNienOthers(this.getUrlSourceOthers(), "Thanh Nien");
    }
    
    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new ThanhNienNewest(urlSource, "Thanh Nien");
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new ThanhNienCovid(urlSource, "Thanh Nien");
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception {
        this.setUrlSourcePolitics(urlSource);
        return new ThanhNienPolitics(urlSource, "Thanh Nien");
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new ThanhNienBusiness(urlSource, "Thanh Nien");
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception{
        this.setUrlSourceTechnology(urlSource);
        return new ThanhNienTechnology(urlSource, "Thanh Nien");
    }

    @Override
    public Health createHealth(String urlSource) throws Exception{
        this.setUrlSourceHealth(urlSource);
        return new ThanhNienHealth(urlSource, "Thanh Nien");
    }

    @Override
    public Sports createSports(String urlSource) throws Exception {
        this.setUrlSourceSports(urlSource);
        return new ThanhNienSports(urlSource, "Thanh Nien");
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception {
        this.setUrlSourceEntertainment(urlSource);
        return new ThanhNienEntertainment(urlSource, "Thanh Nien");
    }

    @Override
    public World createWorld(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new ThanhNienWorld(urlSource, "Thanh Nien");
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new ThanhNienOthers(urlSource, "Thanh Nien");
    }
}
