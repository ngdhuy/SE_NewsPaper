package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:34
 * Description: ...
 */
public abstract class Covid extends Category {
    public Covid() {
        super();
        super.setName("Covid");
    }

    public Covid(String urlSource, String brand) throws Exception {
        super("Covid", urlSource, brand);
    }
}
