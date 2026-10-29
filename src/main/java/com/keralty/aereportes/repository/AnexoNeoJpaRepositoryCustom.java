package com.keralty.aereportes.repository;

import com.keralty.aereportes.exception.SystemException;
import com.keralty.aereportes.persistence.AnexoNeo;
import com.keralty.aereportes.sqlutils.SQLGetOne;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface AnexoNeoJpaRepositoryCustom {

    List<AnexoNeo> solveQuery(SQLSelect query);
    
    List<AnexoNeo> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Double assocOperator000(AnexoNeo instance) throws SystemException;

    Double assocOperator000Range1(AnexoNeo instance) throws SystemException;
    
    SQLGetOne assocOperator000Range1Query(AnexoNeo instance) throws SystemException;

    public List<AnexoNeo> executeQuery(String query);

    public List<AnexoNeo> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
