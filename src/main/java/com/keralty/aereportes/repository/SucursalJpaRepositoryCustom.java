package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Sucursal;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface SucursalJpaRepositoryCustom {

    List<Sucursal> solveQuery(SQLSelect query);
    
    List<Sucursal> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Sucursal> executeQuery(String query);

    public List<Sucursal> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
