package com.keralty.aereportes.service;

import com.keralty.aereportes.global.AesolicitudesConstants;
import com.keralty.aereportes.global.Constants;
import com.keralty.aereportes.global.SolicitudConstants;
import com.keralty.aereportes.global.TitularConstants;
import com.keralty.aereportes.persistence.oid.TitularOid;
import com.keralty.aereportes.persistence.Titular;
import com.keralty.aereportes.repository.TitularJpaRepository;
import com.keralty.aereportes.sqlutils.SQLSelect;
import com.keralty.aereportes.sqlutils.SQLWhereComparison;
import com.keralty.aereportes.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aereportes.sqlutils.SQLWhereOperandPathAttribute;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class TitularService extends AbstractService {

    TitularJpaRepository repository;

    TitularService titularSrv;

    @Inject
    public TitularService(
            TitularService titularSrv,
            TitularJpaRepository repository) {
        this.titularSrv = titularSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Titular by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Titular
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Titular getById(Long aesolicitudesidsolicitud) {
        return getByOID(new TitularOid(aesolicitudesidsolicitud));
    }
    
    /*
     * Returns an instance of Titular by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Titular
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Titular getByOID(TitularOid oid) {
        Optional<Titular> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Titular by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Titular
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Titular getByOIDWithHV(TitularOid oid) {
        Optional<Titular> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Titular> getInstanceByOid(TitularOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid.getAesolicitudesidsolicitud())
               : Optional.empty();
    }

    /*
     * Returns an instance of Titular by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Titular
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Titular getByJsonOid(String jsonOid) {
        TitularOid oid = new TitularOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            TitularOid oid = new TitularOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(TitularConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(TitularService.class).error(e.getMessage());
        }
    }

}
