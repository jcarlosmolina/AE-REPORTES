package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.PlantillaEmail;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface PlantillaEmailJpaRepositoryCustom {

    List<PlantillaEmail> solveQuery(SQLSelect query);
    
    List<PlantillaEmail> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<PlantillaEmail> executeQuery(String query);

    public List<PlantillaEmail> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
