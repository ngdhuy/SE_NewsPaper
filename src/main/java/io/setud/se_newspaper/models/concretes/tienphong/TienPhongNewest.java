package io.setud.se_newspaper.models.concretes.tienphong;

import io.setud.se_newspaper.models.categories.Newest;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:11
 * Description: ...
 */
public class TienPhongNewest extends Newest {
    public TienPhongNewest() {
        super();
    }

    public TienPhongNewest(String urlSource) throws Exception {
        super(urlSource);
    }
}