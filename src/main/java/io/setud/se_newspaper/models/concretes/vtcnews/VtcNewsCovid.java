package io.setud.se_newspaper.models.concretes.vtcnews;

import io.setud.se_newspaper.models.categories.Covid;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:32
 * Description: ...
 */
public class VtcNewsCovid extends Covid {
    public VtcNewsCovid() {
        super();
    }

    public VtcNewsCovid(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
