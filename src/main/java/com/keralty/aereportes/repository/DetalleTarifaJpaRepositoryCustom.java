package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.DetalleTarifa;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface DetalleTarifaJpaRepositoryCustom {

    List<DetalleTarifa> solveQuery(SQLSelect query);
    
    List<DetalleTarifa> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<DetalleTarifa> executeQuery(String query);

    public List<DetalleTarifa> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
