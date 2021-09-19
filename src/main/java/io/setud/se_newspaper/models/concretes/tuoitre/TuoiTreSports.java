package io.setud.se_newspaper.models.concretes.tuoitre;

import io.setud.se_newspaper.models.categories.Sports;

/**
 * io.setud.se_newspaper.models.concretes
 * Created by ndhuy
 * Date 11/09/2021 - 22:41
 * Description: ...
 */
public class TuoiTreSports extends Sports {
    public TuoiTreSports() {
        super();
    }

    public TuoiTreSports(String urlSource, String brand) throws Exception {
        super(urlSource, brand);
    }
}
