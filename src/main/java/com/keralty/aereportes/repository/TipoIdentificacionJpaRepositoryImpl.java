package com.keralty.aereportes.repository;

import com.keralty.aereportes.global.UserFunctions;
import com.keralty.aereportes.persistence.TipoIdentificacion;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import com.keralty.aereportes.sqlutils.TypedQueryBuilder;
import com.keralty.aereportes.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class TipoIdentificacionJpaRepositoryImpl extends AbstractRepository implements TipoIdentificacionJpaRepositoryCustom {

    @Inject
    public TipoIdentificacionJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<TipoIdentificacion> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<TipoIdentificacion> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<TipoIdentificacion> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<TipoIdentificacion> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, TipoIdentificacion.class);
    }

    @Override	
    public List<TipoIdentificacion> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<TipoIdentificacion> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
