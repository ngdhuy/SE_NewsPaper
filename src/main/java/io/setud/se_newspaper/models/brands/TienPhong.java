package io.setud.se_newspaper.models.brands;

import io.setud.se_newspaper.models.Brand;
import io.setud.se_newspaper.models.NewsPaperFactory;
import io.setud.se_newspaper.models.categories.*;
import io.setud.se_newspaper.models.concretes.tienphong.*;

/**
 * io.setud.se_newspaper.models.brands
 * Created by ndhuy
 * Date 11/09/2021 - 23:04
 * Description: ...
 */
public class TienPhong extends Brand implements NewsPaperFactory {
    public TienPhong() {
        super();
    }

    public TienPhong(String urlLogo, String homepage) {
        super("Tien Phong", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new TienPhongNewest(this.getUrlSourceNewest());
    }

    @Override
    public Covid createCovid() throws Exception {
        return new TienPhongCovid(this.getUrlSourceCovid());
    }

    @Override
    public Politics createPolitics() throws Exception {
        return new TienPhongPolitics(this.getUrlSourcePolitics());
    }

    @Override
    public Business createBusiness() throws Exception {
        return new TienPhongBusiness(this.getUrlSourceBusiness());
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new TienPhongTechnology(this.getUrlSourceTechnology());
    }

    @Override
    public Health createHealth() throws Exception {
        return new TienPhongHealth(this.getUrlSourceHealth());
    }

    @Override
    public Sports createSports() throws Exception{
        return new TienPhongSports(this.getUrlSourceSports());
    }

    @Override
    public Entertainment createEntertainment() throws Exception{
        return new TienPhongEntertainment(this.getUrlSourceEntertainment());
    }

    @Override
    public World createWorld() throws Exception {
        return new TienPhongWorld(this.getUrlSourceWorld());
    }

    @Override
    public Others createOthers() throws Exception {
        return new TienPhongOthers(this.getUrlSourceOthers());
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new TienPhongNewest(urlSource);
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new TienPhongCovid(urlSource);
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception {
        this.setUrlSourcePolitics(urlSource);
        return new TienPhongPolitics(urlSource);
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new TienPhongBusiness(urlSource);
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new TienPhongTechnology(urlSource);
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new TienPhongHealth(urlSource);
    }

    @Override
    public Sports createSports(String urlSource) throws Exception{
        this.setUrlSourceSports(urlSource);
        return new TienPhongSports(urlSource);
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception{
        this.setUrlSourceEntertainment(urlSource);
        return new TienPhongEntertainment(urlSource);
    }

    @Override
    public World createWorld(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new TienPhongWorld(urlSource);
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new TienPhongOthers(urlSource);
    }
}
