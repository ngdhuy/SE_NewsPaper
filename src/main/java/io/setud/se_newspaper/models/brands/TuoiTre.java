package io.setud.se_newspaper.models.brands;

import io.setud.se_newspaper.models.Brand;
import io.setud.se_newspaper.models.NewsPaperFactory;
import io.setud.se_newspaper.models.categories.*;
import io.setud.se_newspaper.models.concretes.tuoitre.*;

/**
 * io.setud.se_newspaper.models.brands
 * Created by ndhuy
 * Date 11/09/2021 - 23:14
 * Description: ...
 */
public class TuoiTre extends Brand implements NewsPaperFactory {
    public TuoiTre() {
        super();
    }

    public TuoiTre(String urlLogo, String homepage) {
        super("Tuoi Tre", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new TuoiTreNewest(this.getUrlSourceNewest(), "Tuoi Tre");
    }

    @Override
    public Covid createCovid() throws Exception {
        return new TuoiTreCovid(this.getUrlSourceCovid(), "Tuoi Tre");
    }

    @Override
    public Politics createPolitics() throws Exception {
        return new TuoiTrePolitics(this.getUrlSourcePolitics(), "Tuoi Tre");
    }

    @Override
    public Business createBusiness() throws Exception {
        return new TuoiTreBusiness(this.getUrlSourceBusiness(), "Tuoi Tre");
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new TuoiTreTechnology(this.getUrlSourceTechnology(), "Tuoi Tre");
    }

    @Override
    public Health createHealth() throws Exception {
        return new TuoiTreHealth(this.getUrlSourceHealth(), "Tuoi Tre");
    }

    @Override
    public Sports createSports() throws Exception {
        return new TuoiTreSports(this.getUrlSourceSports(), "Tuoi Tre");
    }

    @Override
    public Entertainment createEntertainment() throws Exception {
        return new TuoiTreEntertainment(this.getUrlSourceEntertainment(), "Tuoi Tre");
    }

    @Override
    public World createWorld() throws Exception {
        return new TuoiTreWorld(this.getUrlSourceWorld(), "Tuoi Tre");
    }

    @Override
    public Others createOthers() throws Exception {
        return new TuoiTreOthers(this.getUrlSourceOthers(), "Tuoi Tre");
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new TuoiTreNewest(urlSource, "Tuoi Tre");
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new TuoiTreCovid(urlSource, "Tuoi Tre");
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception {
        this.setUrlSourcePolitics(urlSource);
        return new TuoiTrePolitics(urlSource, "Tuoi Tre");
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new TuoiTreBusiness(urlSource, "Tuoi Tre");
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new TuoiTreTechnology(urlSource, "Tuoi Tre");
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new TuoiTreHealth(urlSource, "Tuoi Tre");
    }

    @Override
    public Sports createSports(String urlSource) throws Exception {
        this.setUrlSourceSports(urlSource);
        return new TuoiTreSports(urlSource, "Tuoi Tre");
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception {
        this.setUrlSourceEntertainment(urlSource);
        return new TuoiTreEntertainment(urlSource, "Tuoi Tre");
    }

    @Override
    public World createWorld(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new TuoiTreWorld(urlSource, "Tuoi Tre");
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new TuoiTreOthers(urlSource, "Tuoi Tre");
    }
}
