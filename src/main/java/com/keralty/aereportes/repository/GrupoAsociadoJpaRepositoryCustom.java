package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.GrupoAsociado;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface GrupoAsociadoJpaRepositoryCustom {

    List<GrupoAsociado> solveQuery(SQLSelect query);
    
    List<GrupoAsociado> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<GrupoAsociado> executeQuery(String query);

    public List<GrupoAsociado> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
