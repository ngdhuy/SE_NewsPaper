package io.setud.se_newspaper;

import io.setud.se_newspaper.models.*;
import io.setud.se_newspaper.models.brands.*;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) throws Exception {
//        String url = "https://tienphong.vn/rss/kinh-te-3.rss";
//        Feed feed = new Feed(url);
//        for(News news : feed.getLstNews()) {
//            System.out.println(news);
//        }

        ArrayList<Category> lstCategories = new ArrayList<Category>();
        
        NguoiLaoDong nguoiLaoDong = new NguoiLaoDong("https://boxmedia.com.vn/wp-content/uploads/2018/12/2d81e1b8-6d5b-11e7-83d5-cac091044fd5.jpg", "https://nld.com.vn/");
        nguoiLaoDong.setUrlSourceBusiness("https://nld.com.vn/kinh-te.rss");
        nguoiLaoDong.setUrlSourceCovid("");
        nguoiLaoDong.setUrlSourceEntertainment("https://nld.com.vn/giai-tri.rss");
        nguoiLaoDong.setUrlSourceHealth("https://nld.com.vn/suc-khoe.rss");
//        nguoiLaoDong.setUrlSourceNewest("https://nld.com.vn/tin-moi-nhat.rss");
        nguoiLaoDong.setUrlSourceNewest("https://nld.com.vn/tin-doc-quyen.rss");
        nguoiLaoDong.setUrlSourceOthers("https://nld.com.vn/giao-duc-khoa-hoc.rss");
        nguoiLaoDong.setUrlSourcePolitics("https://nld.com.vn/thoi-su.rss");
        nguoiLaoDong.setUrlSourceSports("https://nld.com.vn/the-thao.rss");
        nguoiLaoDong.setUrlSourceTechnology("https://nld.com.vn/cong-nghe.rss");
        nguoiLaoDong.setUrlSourceWorld("https://nld.com.vn/thoi-su-quoc-te.rss");
        lstCategories.add(nguoiLaoDong.createBusiness());
        lstCategories.add(nguoiLaoDong.createCovid());
        lstCategories.add(nguoiLaoDong.createEntertainment());
        lstCategories.add(nguoiLaoDong.createHealth());
        lstCategories.add(nguoiLaoDong.createNewest());
        lstCategories.add(nguoiLaoDong.createOthers());
        lstCategories.add(nguoiLaoDong.createPolitics());
        lstCategories.add(nguoiLaoDong.createSports());
        lstCategories.add(nguoiLaoDong.createTechnology());
        lstCategories.add(nguoiLaoDong.createWorld());
        
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
        lstCategories.add(thanhNien.createBusiness());
        lstCategories.add(thanhNien.createCovid());
        lstCategories.add(thanhNien.createEntertainment());
        lstCategories.add(thanhNien.createHealth());
        lstCategories.add(thanhNien.createNewest());
        lstCategories.add(thanhNien.createOthers());
        lstCategories.add(thanhNien.createPolitics());
        lstCategories.add(thanhNien.createSports());
        lstCategories.add(thanhNien.createTechnology());
        lstCategories.add(thanhNien.createWorld());
        
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
        lstCategories.add(tuoiTre.createBusiness());
        lstCategories.add(tuoiTre.createCovid());
        lstCategories.add(tuoiTre.createEntertainment());
        lstCategories.add(tuoiTre.createHealth());
        lstCategories.add(tuoiTre.createNewest());
        lstCategories.add(tuoiTre.createOthers());
        lstCategories.add(tuoiTre.createPolitics());
        lstCategories.add(tuoiTre.createSports());
        lstCategories.add(tuoiTre.createTechnology());
        lstCategories.add(tuoiTre.createWorld());
        
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
        lstCategories.add(vnExpress.createBusiness());
        lstCategories.add(vnExpress.createCovid());
        lstCategories.add(vnExpress.createEntertainment());
        lstCategories.add(vnExpress.createHealth());
        lstCategories.add(vnExpress.createNewest());
        lstCategories.add(vnExpress.createOthers());
        lstCategories.add(vnExpress.createPolitics());
        lstCategories.add(vnExpress.createSports());
        lstCategories.add(vnExpress.createTechnology());
        lstCategories.add(vnExpress.createWorld());
        
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
        lstCategories.add(vtcNews.createBusiness());
        lstCategories.add(vtcNews.createCovid());
        lstCategories.add(vtcNews.createEntertainment());
        lstCategories.add(vtcNews.createHealth());
        lstCategories.add(vtcNews.createNewest());
        lstCategories.add(vtcNews.createOthers());
        lstCategories.add(vtcNews.createPolitics());
        lstCategories.add(vtcNews.createSports());
        lstCategories.add(vtcNews.createTechnology());
        lstCategories.add(vtcNews.createWorld());

        int i = 1;
        for(Category category : lstCategories) {
            for(News news : category.getFeed().getLstNews()){
                System.out.println("----- Item " + Integer.toString(i++) + " -----" );
                System.out.println(news);
            }
        }
    }
}
