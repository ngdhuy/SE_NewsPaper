package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:35
 * Description: ...
 */
public abstract class Newest extends Category {
    public Newest() {
        super();
        super.setName("Newest");
    }

    public Newest(String urlSource, String brand) throws Exception {
        super("Newest", urlSource, brand);
    }
}
