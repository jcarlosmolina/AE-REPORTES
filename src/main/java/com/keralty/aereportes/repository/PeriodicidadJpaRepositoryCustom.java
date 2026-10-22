package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Periodicidad;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface PeriodicidadJpaRepositoryCustom {

    List<Periodicidad> solveQuery(SQLSelect query);
    
    List<Periodicidad> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Periodicidad> executeQuery(String query);

    public List<Periodicidad> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
