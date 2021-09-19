package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:32
 * Description: ...
 */
public abstract class Business extends Category {
    public Business() {
        super();
        super.setName("Business");
    }

    public Business(String urlSource, String brand) throws Exception {
        super("Business", urlSource, brand);
    }
}
