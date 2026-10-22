package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.TipoNovedad;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface TipoNovedadJpaRepositoryCustom {

    List<TipoNovedad> solveQuery(SQLSelect query);
    
    List<TipoNovedad> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<TipoNovedad> executeQuery(String query);

    public List<TipoNovedad> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
