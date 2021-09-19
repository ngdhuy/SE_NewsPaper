package io.setud.se_newspaper.util;

import io.setud.se_newspaper.models.Category;
import io.setud.se_newspaper.models.brands.*;

import java.util.ArrayList;

public class Loader {
    public ArrayList<Category> lstBusiness;
    public ArrayList<Category> lstCovid;
    public ArrayList<Category> lstEntertainment;
    public ArrayList<Category> lstHealth;
    public ArrayList<Category> lstNewest;
    public ArrayList<Category> lstOthers;
    public ArrayList<Category> lstPolitics;
    public ArrayList<Category> lstSports;
    public ArrayList<Category> lstTechnology;
    public ArrayList<Category> lstWorld;

    public Loader() {
        this.lstBusiness = new ArrayList<Category>();
        this.lstCovid = new ArrayList<Category>();
        this.lstEntertainment = new ArrayList<Category>();
        this.lstHealth = new ArrayList<Category>();
        this.lstNewest = new ArrayList<io.setud.se_newspaper.models.Category>();
        this.lstOthers = new ArrayList<Category>();
        this.lstPolitics = new ArrayList<Category>();
        this.lstSports = new ArrayList<Category>();
        this.lstTechnology = new ArrayList<Category>();
        this.lstWorld = new ArrayList<Category>();
    }

    public void LoadData() throws Exception {
        ThanhNien thanhNien = new ThanhNien("https://static.thanhnien.vn/v2/App_Themes/images/logo-tn-2.png", "https://thanhnien.vn/");
        thanhNien.setUrlSourceBusiness("https://thanhnien.vn/rss/tai-chinh-kinh-doanh.rss");
        thanhNien.setUrlSourceCovid("https://thanhnien.vn/rss/thoi-su/vuot-qua-covid-19.rss");
        thanhNien.setUrlSourceEntertainment("https://thanhnien.vn/rss/giai-tri.rss");
        thanhNien.setUrlSourceHealth("https://thanhnien.vn/rss/suc-khoe.rss");
        thanhNien.setUrlSourceNewest("https://thanhnien.vn/rss/home.rss");
        thanhNien.setUrlSourceOthers("https://thanhnien.vn/rss/giao-duc.rss");
        thanhNien.setUrlSourcePolitics("https://thanhnien.vn/rss/thoi-su/chinh-tri.rss");
        thanhNien.setUrlSourceSports("https://thethao.thanhnien.vn/rss/home.rss");
        thanhNien.setUrlSourceTechnology("https://thanhnien.vn/rss/cong-nghe.rss");
        thanhNien.setUrlSourceWorld("https://thanhnien.vn/rss/the-gioi.rss");
        this.lstBusiness.add(thanhNien.createBusiness());
        this.lstCovid.add(thanhNien.createCovid());
        this.lstEntertainment.add(thanhNien.createEntertainment());
        this.lstHealth.add(thanhNien.createHealth());
        this.lstNewest.add(thanhNien.createNewest());
        this.lstOthers.add(thanhNien.createOthers());
        this.lstPolitics.add(thanhNien.createPolitics());
        this.lstSports.add(thanhNien.createSports());
        this.lstTechnology.add(thanhNien.createTechnology());
        this.lstWorld.add(thanhNien.createWorld());
        
        TuoiTre tuoiTre = new TuoiTre("https://brandcom.vn/wp-content/uploads/2016/02/tuoitre-online-logo.png", "https://tuoitre.vn");
        tuoiTre.setUrlSourceBusiness("https://tuoitre.vn/rss/kinh-doanh.rss");
        tuoiTre.setUrlSourceCovid("");
        tuoiTre.setUrlSourceEntertainment("https://tuoitre.vn/rss/giai-tri.rss");
        tuoiTre.setUrlSourceHealth("https://tuoitre.vn/rss/suc-khoe.rss");
        tuoiTre.setUrlSourceNewest("https://tuoitre.vn/rss/tin-moi-nhat.rss");
        tuoiTre.setUrlSourceOthers("https://tuoitre.vn/rss/giao-duc.rss");
        tuoiTre.setUrlSourcePolitics("https://tuoitre.vn/rss/thoi-su.rss");
        tuoiTre.setUrlSourceSports("https://tuoitre.vn/rss/the-thao.rss");
        tuoiTre.setUrlSourceTechnology("https://tuoitre.vn/rss/nhip-song-so.rss");
        tuoiTre.setUrlSourceWorld("https://tuoitre.vn/rss/the-gioi.rss");
        this.lstBusiness.add(tuoiTre.createBusiness());
        this.lstCovid.add(tuoiTre.createCovid());
        this.lstEntertainment.add(tuoiTre.createEntertainment());
        this.lstHealth.add(tuoiTre.createHealth());
        this.lstNewest.add(tuoiTre.createNewest());
        this.lstOthers.add(tuoiTre.createOthers());
        this.lstPolitics.add(tuoiTre.createPolitics());
        this.lstSports.add(tuoiTre.createSports());
        this.lstTechnology.add(tuoiTre.createTechnology());
        this.lstWorld.add(tuoiTre.createWorld());
        
        VtcNews vtcNews = new VtcNews("https://vtc.vn/Content/pc/theme/images/logo.png", "https://vtc.vn/");
        vtcNews.setUrlSourceBusiness("https://vtc.vn/rss/kinh-te.rss");
        vtcNews.setUrlSourceCovid("");
        vtcNews.setUrlSourceEntertainment("https://vtc.vn/rss/van-hoa-giai-tri.rss");
        vtcNews.setUrlSourceHealth("https://vtc.vn/rss/suc-khoe.rss");
        vtcNews.setUrlSourceNewest("https://vtc.vn/rss/feed.rss");
        vtcNews.setUrlSourceOthers("https://vtc.vn/rss/giao-duc.rss");
        vtcNews.setUrlSourcePolitics("https://vtc.vn/rss/thoi-su.rss");
        vtcNews.setUrlSourceSports("https://vtc.vn/rss/the-thao.rss");
        vtcNews.setUrlSourceTechnology("https://vtc.vn/rss/khoa-hoc-cong-nghe.rss");
        vtcNews.setUrlSourceWorld("https://vtc.vn/rss/the-gioi.rss");
        this.lstBusiness.add(vtcNews.createBusiness());
        this.lstCovid.add(vtcNews.createCovid());
        this.lstEntertainment.add(vtcNews.createEntertainment());
        this.lstHealth.add(vtcNews.createHealth());
        this.lstNewest.add(vtcNews.createNewest());
        this.lstOthers.add(vtcNews.createOthers());
        this.lstPolitics.add(vtcNews.createPolitics());
        this.lstSports.add(vtcNews.createSports());
        this.lstTechnology.add(vtcNews.createTechnology());
        this.lstWorld.add(vtcNews.createWorld());

        NguoiLaoDong nguoiLaoDong = new NguoiLaoDong("https://boxmedia.com.vn/wp-content/uploads/2018/12/2d81e1b8-6d5b-11e7-83d5-cac091044fd5.jpg", "https://nld.com.vn/");
        nguoiLaoDong.setUrlSourceBusiness("https://nld.com.vn/kinh-te.rss");
        nguoiLaoDong.setUrlSourceCovid("");
        nguoiLaoDong.setUrlSourceEntertainment("https://nld.com.vn/giai-tri.rss");
        nguoiLaoDong.setUrlSourceHealth("https://nld.com.vn/suc-khoe.rss");
        nguoiLaoDong.setUrlSourceNewest("https://nld.com.vn/tin-doc-quyen.rss");
        nguoiLaoDong.setUrlSourceOthers("https://nld.com.vn/giao-duc-khoa-hoc.rss");
        nguoiLaoDong.setUrlSourcePolitics("https://nld.com.vn/thoi-su.rss");
        nguoiLaoDong.setUrlSourceSports("https://nld.com.vn/the-thao.rss");
        nguoiLaoDong.setUrlSourceTechnology("https://nld.com.vn/cong-nghe.rss");
        nguoiLaoDong.setUrlSourceWorld("https://nld.com.vn/thoi-su-quoc-te.rss");
        this.lstBusiness.add(nguoiLaoDong.createBusiness());
        this.lstCovid.add(nguoiLaoDong.createCovid());
        this.lstEntertainment.add(nguoiLaoDong.createEntertainment());
        this.lstHealth.add(nguoiLaoDong.createHealth());
        this.lstNewest.add(nguoiLaoDong.createNewest());
        this.lstOthers.add(nguoiLaoDong.createOthers());
        this.lstPolitics.add(nguoiLaoDong.createPolitics());
        this.lstSports.add(nguoiLaoDong.createSports());
        this.lstTechnology.add(nguoiLaoDong.createTechnology());
        this.lstWorld.add(nguoiLaoDong.createWorld());

        VnExpress vnExpress = new VnExpress("https://s1.vnecdn.net/vnexpress/restruct/i/v427/v2_2019/pc/graphics/logo.svg", "https://vnexpress.net/");
        vnExpress.setUrlSourceBusiness("https://vnexpress.net/rss/kinh-doanh.rss");
        vnExpress.setUrlSourceCovid("");
        vnExpress.setUrlSourceEntertainment("https://vnexpress.net/rss/giai-tri.rss");
        vnExpress.setUrlSourceHealth("https://vnexpress.net/rss/suc-khoe.rss");
        vnExpress.setUrlSourceNewest("https://vnexpress.net/rss/tin-moi-nhat.rss");
        vnExpress.setUrlSourceOthers("https://vnexpress.net/rss/giao-duc.rss");
        vnExpress.setUrlSourcePolitics("https://vnexpress.net/rss/thoi-su.rss");
        vnExpress.setUrlSourceSports("https://vnexpress.net/rss/the-thao.rss");
        vnExpress.setUrlSourceTechnology("https://vnexpress.net/rss/so-hoa.rss");
        vnExpress.setUrlSourceWorld("https://vnexpress.net/rss/the-gioi.rss");
        this.lstBusiness.add(vnExpress.createBusiness());
        this.lstCovid.add(vnExpress.createCovid());
        this.lstEntertainment.add(vnExpress.createEntertainment());
        this.lstHealth.add(vnExpress.createHealth());
        this.lstNewest.add(vnExpress.createNewest());
        this.lstOthers.add(vnExpress.createOthers());
        this.lstPolitics.add(vnExpress.createPolitics());
        this.lstSports.add(vnExpress.createSports());
        this.lstTechnology.add(vnExpress.createTechnology());
        this.lstWorld.add(vnExpress.createWorld());
    }
}
