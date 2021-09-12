package io.setud.se_newspaper.models.concretes.thanhnien;

import io.setud.se_newspaper.models.categories.Newest;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:11
 * Description: ...
 */
public class ThanhNienNewest extends Newest {
    public ThanhNienNewest() {
        super();
    }

    public ThanhNienNewest(String urlSource) throws Exception {
        super(urlSource);
    }
}
