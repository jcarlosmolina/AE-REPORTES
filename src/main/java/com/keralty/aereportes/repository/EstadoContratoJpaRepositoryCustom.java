package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.EstadoContrato;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface EstadoContratoJpaRepositoryCustom {

    List<EstadoContrato> solveQuery(SQLSelect query);
    
    List<EstadoContrato> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<EstadoContrato> executeQuery(String query);

    public List<EstadoContrato> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
