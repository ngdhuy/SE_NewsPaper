package io.setud.se_newspaper.models.concretes.thanhnien;

import io.setud.se_newspaper.models.categories.Health;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:36
 * Description: ...
 */
public class ThanhNienHealth extends Health {
    public ThanhNienHealth() {
        super();
    }

    public ThanhNienHealth(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
