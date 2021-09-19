package io.setud.se_newspaper.models.concretes.vnexpress;

import io.setud.se_newspaper.models.categories.Business;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:25
 * Description: ...
 */
public class VnExpressBusiness extends Business {
    public VnExpressBusiness() {
        super();
    }

    public VnExpressBusiness(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
