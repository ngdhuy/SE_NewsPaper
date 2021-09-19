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
        super("Nguoi Lao Dong", urlLogo, homepage);
    }

    @Override
    public Newest createNewest() throws Exception {
        return new NguoiLaoDongNewest(this.getUrlSourceNewest(), "Nguoi Lao Dong");
    }

    @Override
    public Covid createCovid() throws Exception {
        return new NguoiLaoDongCovid(this.getUrlSourceCovid(), "Nguoi Lao Dong");
    }

    @Override
    public Politics createPolitics() throws Exception {
        return new NguoiLaoDongPolitics(this.getUrlSourcePolitics(), "Nguoi Lao Dong");
    }

    @Override
    public Business createBusiness() throws Exception {
        return new NguoiLaoDongBusiness(this.getUrlSourceBusiness(), "Nguoi Lao Dong");
    }

    @Override
    public Technology createTechnology() throws Exception {
        return new NguoiLaoDongTechnology(this.getUrlSourceTechnology(), "Nguoi Lao Dong");
    }

    @Override
    public Health createHealth() throws Exception {
        return new NguoiLaoDongHealth(this.getUrlSourceHealth(), "Nguoi Lao Dong");
    }

    @Override
    public Sports createSports() throws Exception{
        return new NguoiLaoDongSports(this.getUrlSourceSports(), "Nguoi Lao Dong");
    }

    @Override
    public Entertainment createEntertainment() throws Exception{
        return new NguoiLaoDongEntertainment(this.getUrlSourceEntertainment(), "Nguoi Lao Dong");
    }

    @Override
    public World createWorld() throws Exception {
        return new NguoiLaoDongWorld(this.getUrlSourceWorld(), "Nguoi Lao Dong");
    }

    @Override
    public Others createOthers() throws Exception {
        return new NguoiLaoDongOthers(this.getUrlSourceOthers(), "Nguoi Lao Dong");
    }

    @Override
    public Newest createNewest(String urlSource) throws Exception {
        this.setUrlSourceNewest(urlSource);
        return new NguoiLaoDongNewest(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Covid createCovid(String urlSource) throws Exception {
        this.setUrlSourceCovid(urlSource);
        return new NguoiLaoDongCovid(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Politics createPolitics(String urlSource) throws Exception {
        this.setUrlSourcePolitics(urlSource);
        return new NguoiLaoDongPolitics(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Business createBusiness(String urlSource) throws Exception {
        this.setUrlSourceBusiness(urlSource);
        return new NguoiLaoDongBusiness(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Technology createTechnology(String urlSource) throws Exception {
        this.setUrlSourceTechnology(urlSource);
        return new NguoiLaoDongTechnology(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Health createHealth(String urlSource) throws Exception {
        this.setUrlSourceHealth(urlSource);
        return new NguoiLaoDongHealth(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Sports createSports(String urlSource) throws Exception{
        this.setUrlSourceSports(urlSource);
        return new NguoiLaoDongSports(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Entertainment createEntertainment(String urlSource) throws Exception{
        this.setUrlSourceEntertainment(urlSource);
        return new NguoiLaoDongEntertainment(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public World createWorld(String urlSource) throws Exception {
        this.setUrlSourceWorld(urlSource);
        return new NguoiLaoDongWorld(urlSource, "Nguoi Lao Dong");
    }

    @Override
    public Others createOthers(String urlSource) throws Exception {
        this.setUrlSourceOthers(urlSource);
        return new NguoiLaoDongOthers(urlSource, "Nguoi Lao Dong");
    }
}
