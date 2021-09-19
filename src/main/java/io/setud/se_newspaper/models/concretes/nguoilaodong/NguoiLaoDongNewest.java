package io.setud.se_newspaper.models.concretes.nguoilaodong;

import io.setud.se_newspaper.models.categories.Newest;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:11
 * Description: ...
 */
public class NguoiLaoDongNewest extends Newest {
    public NguoiLaoDongNewest() {
        super();
    }

    public NguoiLaoDongNewest(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
