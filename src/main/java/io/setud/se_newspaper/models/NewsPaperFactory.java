package io.setud.se_newspaper.models;

import io.setud.se_newspaper.models.categories.*;

/**
 * io.setud.se_newspaper.models
 * Created by ndhuy
 * Date 11/09/2021 - 21:36
 * Description: ...
 */
public interface NewsPaperFactory {
    public Newest createNewest(String urlSource) throws Exception;
    public Covid createCovid(String urlSource) throws Exception;
    public Politics createPolitics(String urlSource) throws Exception;
    public Business createBusiness(String urlSource) throws Exception;
    public Technology createTechnology(String urlSource) throws Exception;
    public Health createHealth(String urlSource) throws Exception;
    public Sports createSports(String urlSource) throws Exception;
    public Entertainment createEntertainment(String urlSource) throws Exception;
    public World createWorld(String urlSource) throws Exception;
    public Others createOthers(String urlSource) throws Exception;

    public Newest createNewest() throws Exception;
    public Covid createCovid() throws Exception;
    public Politics createPolitics() throws Exception;
    public Business createBusiness() throws Exception;
    public Technology createTechnology() throws Exception;
    public Health createHealth() throws Exception;
    public Sports createSports() throws Exception;
    public Entertainment createEntertainment() throws Exception;
    public World createWorld() throws Exception;
    public Others createOthers() throws Exception;
}
