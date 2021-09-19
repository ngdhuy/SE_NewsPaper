package io.setud.se_newspaper.models.concretes.vnexpress;

import io.setud.se_newspaper.models.categories.World;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:42
 * Description: ...
 */
public class VnExpressWorld extends World {
    public VnExpressWorld() {
        super();
    }

    public VnExpressWorld(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
