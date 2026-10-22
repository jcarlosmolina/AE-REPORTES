package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Firma;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface FirmaJpaRepositoryCustom {

    List<Firma> solveQuery(SQLSelect query);
    
    List<Firma> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Firma> executeQuery(String query);

    public List<Firma> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
