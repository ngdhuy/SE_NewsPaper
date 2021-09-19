package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:31
 * Description: ...
 */
public abstract class Others extends Category {
    public Others() {
        super();
        super.setName("Other");
    }

    public Others(String urlSource, String brand) throws Exception {
        super("Other", urlSource, brand);
    }
}
