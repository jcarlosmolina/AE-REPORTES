package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.UsuarioReg;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface UsuarioRegJpaRepositoryCustom {

    List<UsuarioReg> solveQuery(SQLSelect query);
    
    List<UsuarioReg> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);
    
    Long nextUsuarioRegIdentificador(Long aesolicitudesidsolicitud);

    public List<UsuarioReg> executeQuery(String query);

    public List<UsuarioReg> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
