package io.setud.se_newspaper.models.concretes.vtcnews;

import io.setud.se_newspaper.models.categories.Newest;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:11
 * Description: ...
 */
public class VtcNewsNewest extends Newest {
    public VtcNewsNewest() {
        super();
    }

    public VtcNewsNewest(String urlSource) throws Exception {
        super(urlSource);
    }
}
