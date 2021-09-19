package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:16
 * Description: ...
 */
public abstract class Health extends Category {
    public Health() {
        super();
        super.setName("Health");
    }

    public Health(String urlSource, String brand) throws Exception {
        super("Health", urlSource, brand);
    }
}