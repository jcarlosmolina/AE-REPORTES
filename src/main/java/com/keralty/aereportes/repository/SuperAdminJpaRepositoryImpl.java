package com.keralty.aereportes.repository;

import com.keralty.aereportes.global.FuncionarioConstants;
import com.keralty.aereportes.global.SuperAdminConstants;
import com.keralty.aereportes.global.UserFunctions;
import com.keralty.aereportes.persistence.Funcionario;
import com.keralty.aereportes.persistence.SuperAdmin;
import com.keralty.aereportes.sqlutils.SQLJoin;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import com.keralty.aereportes.sqlutils.TypedQueryBuilder;
import com.keralty.aereportes.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class SuperAdminJpaRepositoryImpl extends AbstractRepository implements SuperAdminJpaRepositoryCustom {

    @Inject
    public SuperAdminJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<SuperAdmin> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<SuperAdmin> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<SuperAdmin> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<SuperAdmin> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, SuperAdmin.class);
    }

    @Override	
    public List<SuperAdmin> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<SuperAdmin> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public Funcionario findParent(Long oid) {
        return em.find(Funcionario.class, oid);
    }

    /**
     * Adds facet where
     * @param myAlias Entity/Table alias.
     * @param join Join clause to add the where to.
     * @param parentAlias Alias of the parent entity.
     */
    public void addFacetWhereparentfuncionario (String myAlias, SQLJoin join, String parentAlias) {
        join.addWhere(myAlias + "." + SuperAdminConstants.FLD_FUNCIONARIOID + " = " + parentAlias + "." + FuncionarioConstants.ATTR_FIELD_FUNCIONARIOID);
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
