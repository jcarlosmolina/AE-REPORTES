package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.EstadoBeneficiario;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface EstadoBeneficiarioJpaRepositoryCustom {

    List<EstadoBeneficiario> solveQuery(SQLSelect query);
    
    List<EstadoBeneficiario> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<EstadoBeneficiario> executeQuery(String query);

    public List<EstadoBeneficiario> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
