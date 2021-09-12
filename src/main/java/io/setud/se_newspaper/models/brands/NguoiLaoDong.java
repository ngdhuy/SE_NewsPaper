package io.setud.se_newspaper.models.brands;

import io.setud.se_newspaper.models.Brand;
import io.setud.se_newspaper.models.NewsPaperFactory;
import io.setud.se_newspaper.models.categories.*;
import io.setud.se_newspaper.models.concretes.nguoilaodong.*;

/**
 * io.setud.se_newspaper.models.brands
 * Created by ndhuy
 * Date 11/09/2021 - 23:04
 * Description: ...
 */
public class NguoiLaoDong extends Brand implements NewsPaperFactory {
    public NguoiLaoDong() {
        super();
    }

    public NguoiLaoDong(String urlLogo, String homepage) {
        super("Tien Phong", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new NguoiLaoDongNewest(this.getUrlSourceNewest());
    }

    @Override
    public Covid createCovid() throws Exception {
        return new NguoiLaoDongCovid(this.getUrlSourceCovid());
    }

    @Override
    public Politics createPolitics() throws Exception {
        return new NguoiLaoDongPolitics(this.getUrlSourcePolitics());
    }

    @Override
    public Business createBusiness() throws Exception {
        return new NguoiLaoDongBusiness(this.getUrlSourceBusiness());
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new NguoiLaoDongTechnology(this.getUrlSourceTechnology());
    }

    @Override
    public Health createHealth() throws Exception {
        return new NguoiLaoDongHealth(this.getUrlSourceHealth());
    }

    @Override
    public Sports createSports() throws Exception{
        return new NguoiLaoDongSports(this.getUrlSourceSports());
    }

    @Override
    public Entertainment createEntertainment() throws Exception{
        return new NguoiLaoDongEntertainment(this.getUrlSourceEntertainment());
    }

    @Override
    public World createWorld() throws Exception {
        return new NguoiLaoDongWorld(this.getUrlSourceWorld());
    }

    @Override
    public Others createOthers() throws Exception {
        return new NguoiLaoDongOthers(this.getUrlSourceOthers());
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new NguoiLaoDongNewest(urlSource);
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new NguoiLaoDongCovid(urlSource);
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception {
        this.setUrlSourcePolitics(urlSource);
        return new NguoiLaoDongPolitics(urlSource);
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new NguoiLaoDongBusiness(urlSource);
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new NguoiLaoDongTechnology(urlSource);
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new NguoiLaoDongHealth(urlSource);
    }

    @Override
    public Sports createSports(String urlSource) throws Exception{
        this.setUrlSourceSports(urlSource);
        return new NguoiLaoDongSports(urlSource);
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception{
        this.setUrlSourceEntertainment(urlSource);
        return new NguoiLaoDongEntertainment(urlSource);
    }

    @Override
    public World createWorld(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new NguoiLaoDongWorld(urlSource);
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new NguoiLaoDongOthers(urlSource);
    }
}
