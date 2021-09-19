package io.setud.se_newspaper.models.categories;

import io.setud.se_newspaper.models.Category;

/**
 * io.setud.se_newspaper.models.categories
 * Created by ndhuy
 * Date 11/09/2021 - 21:29
 * Description: ...
 */
public abstract class World extends Category {
    public World() {
        super();
        super.setName("World");
    }

    public World(String urlSource, String brand) throws Exception {
        super("World", urlSource, brand);
    }
}
