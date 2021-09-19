package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:26
 * Description: ...
 */
public abstract class Sports extends Category{
    public Sports() {
        super();
        super.setName("Sports");
    }

    public Sports(String urlSource, String brand) throws Exception {
        super("Sports", urlSource, brand);
    }
}
