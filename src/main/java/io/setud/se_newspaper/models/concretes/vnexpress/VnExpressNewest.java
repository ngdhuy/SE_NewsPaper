package io.setud.se_newspaper.models.concretes.vnexpress;

import io.setud.se_newspaper.models.brands.VnExpress;
import io.setud.se_newspaper.models.categories.Newest;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:11
 * Description: ...
 */
public class VnExpressNewest extends Newest {
    public VnExpressNewest() {
        super();
    }

    public VnExpressNewest(String urlSource) throws Exception {
        super(urlSource);
    }
}
