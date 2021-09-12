package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:31
 * Description: ...
 */
public abstract class Technology extends Category {
    public Technology() {
        super();
        super.setName("Technology");
    }

    public Technology(String urlSource) throws Exception {
        super("Technology", urlSource);
    }
}
