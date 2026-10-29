package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.CuestionarioP;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface CuestionarioPJpaRepositoryCustom {

    List<CuestionarioP> solveQuery(SQLSelect query);
    
    List<CuestionarioP> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<CuestionarioP> executeQuery(String query);

    public List<CuestionarioP> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
