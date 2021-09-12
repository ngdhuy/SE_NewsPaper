package io.setud.se_newspaper.models.concretes.zingnews;

import io.setud.se_newspaper.models.categories.Newest;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:11
 * Description: ...
 */
public class ZingNewsNewest extends Newest {
    public ZingNewsNewest() {
        super();
    }

    public ZingNewsNewest(String urlSource) throws Exception {
        super(urlSource);
    }
}
