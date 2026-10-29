package com.keralty.aereportes.repository;

import com.keralty.aereportes.exception.SystemException;
import com.keralty.aereportes.persistence.Admin;
import com.keralty.aereportes.persistence.Afiliaciones;
import com.keralty.aereportes.persistence.AreaMedica;
import com.keralty.aereportes.persistence.Asesor;
import com.keralty.aereportes.persistence.Funcionario;
import com.keralty.aereportes.persistence.Gestor;
import com.keralty.aereportes.persistence.MesaDeApoyo;
import com.keralty.aereportes.persistence.RespRegional;
import com.keralty.aereportes.persistence.SuperAdmin;
import com.keralty.aereportes.sqlutils.SQLCount;
import com.keralty.aereportes.sqlutils.SQLParam;
import com.keralty.aereportes.sqlutils.SQLSelect;
import java.util.List;

public interface FuncionarioJpaRepositoryCustom {

    List<Funcionario> solveQuery(SQLSelect query);
    
    List<Funcionario> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Admin findChildAdmin(Long oid);

    SuperAdmin findChildSuperAdmin(Long oid);

    Asesor findChildAsesor(Long oid);

    AreaMedica findChildAreaMedica(Long oid);

    Afiliaciones findChildAfiliaciones(Long oid);

    RespRegional findChildRespRegional(Long oid);

    Gestor findChildGestor(Long oid);

    MesaDeApoyo findChildMesaDeApoyo(Long oid);

    Long assocOperator000(Funcionario instance) throws SystemException;

    Long assocOperator000Range1(Funcionario instance) throws SystemException;
    
    SQLCount assocOperator000Range1Query(Funcionario instance) throws SystemException;

    public List<Funcionario> executeQuery(String query);

    public List<Funcionario> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
