package io.setud.se_newspaper.models.concretes.tuoitre;

import io.setud.se_newspaper.models.categories.Business;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:25
 * Description: ...
 */
public class TuoiTreBusiness extends Business {
    public TuoiTreBusiness() {
        super();
    }

    public TuoiTreBusiness(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
