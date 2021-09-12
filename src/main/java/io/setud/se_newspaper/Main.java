package io.setud.se_newspaper;

import io.setud.se_newspaper.models.brands.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        String url = "https://thanhnien.vn/rss/home.rss";
//        Feed feed = new Feed(url);
//        for(News news : feed.getLstNews()) {
//            System.out.println(news);
//        }

        TienPhong tienPhong = new TienPhong("https://images.tienphong.vn/v3/web/styles/img/logo-web-red.png", "https://tienphong.vn/");
        tienPhong.setUrlSourceBusiness("https://tienphong.vn/rss/kinh-te-3.rss");
        tienPhong.setUrlSourceCovid("");
        tienPhong.setUrlSourceEntertainment("https://tienphong.vn/rss/giai-tri-36.rss");
        tienPhong.setUrlSourceHealth("https://tienphong.vn/rss/suc-khoe-210.rss");
        tienPhong.setUrlSourceNewest("https://tienphong.vn/rss/home.rss");
        tienPhong.setUrlSourceOthers("https://tienphong.vn/rss/giao-duc-71.rss");
        tienPhong.setUrlSourcePolitics("https://tienphong.vn/rss/chinh-tri-308.rss");
        tienPhong.setUrlSourceSports("https://tienphong.vn/rss/the-thao-11.rss");
        tienPhong.setUrlSourceTechnology("https://tienphong.vn/rss/cong-nghe-khoa-hoc-46.rss");
        tienPhong.setUrlSourceWorld("https://tienphong.vn/rss/the-gioi-5.rss");
        
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
        
        ZingNews zingNews = new ZingNews("https://static-znews.zadn.vn/images/logo-zing-home.svg", "https://zingnews.vn/");
        zingNews.setUrlSourceBusiness("");
        zingNews.setUrlSourceCovid("");
        zingNews.setUrlSourceEntertainment("");
        zingNews.setUrlSourceHealth("");
        zingNews.setUrlSourceNewest("");
        zingNews.setUrlSourceOthers("");
        zingNews.setUrlSourcePolitics("");
        zingNews.setUrlSourceSports("");
        zingNews.setUrlSourceTechnology("");
        zingNews.setUrlSourceWorld("");
    }
}
