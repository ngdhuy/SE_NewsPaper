package io.setud.se_newspaper.models.concretes.vtcnews;

import io.setud.se_newspaper.models.categories.Entertainment;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:33
 * Description: ...
 */
public class VtcNewsEntertainment extends Entertainment {
    public VtcNewsEntertainment() {
        super();
    }

    public VtcNewsEntertainment(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
