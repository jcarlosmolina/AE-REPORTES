package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.TipoIdentificacion;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface TipoIdentificacionJpaRepositoryCustom {

    List<TipoIdentificacion> solveQuery(SQLSelect query);
    
    List<TipoIdentificacion> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<TipoIdentificacion> executeQuery(String query);

    public List<TipoIdentificacion> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
