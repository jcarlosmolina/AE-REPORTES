package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Afiliaciones;
import com.keralty.aereportes.persistence.Funcionario;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface AfiliacionesJpaRepositoryCustom {

    List<Afiliaciones> solveQuery(SQLSelect query);
    
    List<Afiliaciones> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Funcionario findParent(Long oid);

    public List<Afiliaciones> executeQuery(String query);

    public List<Afiliaciones> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
