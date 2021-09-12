package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:29
 * Description: ...
 */
public abstract class Entertainment extends Category {
    public Entertainment() {
        super();
        super.setName("Entertainment");
    }

    public Entertainment(String urlSource) throws Exception {
        super("Entertainment", urlSource);
    }
}
