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
        return new ThanhNienNewest(this.getUrlSourceNewest());
    }

    @Override
    public Covid createCovid() throws Exception {
        return new ThanhNienCovid(this.getUrlSourceCovid());
    }

    @Override
    public Politics createPolitics() throws Exception {
        return new ThanhNienPolitics(this.getUrlSourcePolitics());
    }

    @Override
    public Business createBusiness() throws Exception {
        return new ThanhNienBusiness(this.getUrlSourceBusiness());
    }

    @Override
    public Technology createTechnology() throws Exception{
        return new ThanhNienTechnology(this.getUrlSourceTechnology());
    }

    @Override
    public Health createHealth() throws Exception{
        return new ThanhNienHealth(this.getUrlSourceHealth());
    }

    @Override
    public Sports createSports() throws Exception {
        return new ThanhNienSports(this.getUrlSourceSports());
    }

    @Override
    public Entertainment createEntertainment() throws Exception {
        return new ThanhNienEntertainment(this.getUrlSourceEntertainment());
    }

    @Override
    public World createWorld() throws Exception {
        return new ThanhNienWorld(this.getUrlSourceWorld());
    }

    @Override
    public Others createOthers() throws Exception {
        return new ThanhNienOthers(this.getUrlSourceOthers());
    }
    
    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new ThanhNienNewest(urlSource);
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new ThanhNienCovid(urlSource);
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception {
        this.setUrlSourcePolitics(urlSource);
        return new ThanhNienPolitics(urlSource);
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new ThanhNienBusiness(urlSource);
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception{
        this.setUrlSourceTechnology(urlSource);
        return new ThanhNienTechnology(urlSource);
    }

    @Override
    public Health createHealth(String urlSource) throws Exception{
        this.setUrlSourceHealth(urlSource);
        return new ThanhNienHealth(urlSource);
    }

    @Override
    public Sports createSports(String urlSource) throws Exception {
        this.setUrlSourceSports(urlSource);
        return new ThanhNienSports(urlSource);
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception {
        this.setUrlSourceEntertainment(urlSource);
        return new ThanhNienEntertainment(urlSource);
    }

    @Override
    public World createWorld(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new ThanhNienWorld(urlSource);
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new ThanhNienOthers(urlSource);
    }
}
