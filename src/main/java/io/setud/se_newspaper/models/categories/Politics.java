package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:33
 * Description: ...
 */
public abstract class Politics extends Category {
    public Politics() {
        super();
        super.setName("Politics");
    }

    public Politics(String urlSource) throws Exception {
        super("Politics", urlSource);
    }
}
