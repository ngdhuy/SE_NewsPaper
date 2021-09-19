package io.setud.se_newspaper.models.concretes.tuoitre;

import io.setud.se_newspaper.models.categories.Health;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:36
 * Description: ...
 */
public class TuoiTreHealth extends Health {
    public TuoiTreHealth() {
        super();
    }

    public TuoiTreHealth(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
