package com.keralty.aereportes.service;

import com.keralty.aereportes.global.AnexoNeoConstants;
import com.keralty.aereportes.global.Constants;
import com.keralty.aereportes.persistence.AnexoNeo;
import com.keralty.aereportes.persistence.oid.AnexoNeoOid;
import com.keralty.aereportes.repository.AnexoNeoJpaRepository;
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
public class AnexoNeoService extends AbstractService {

    AnexoNeoJpaRepository repository;

    AnexoNeoService anexoNeoSrv;

    @Inject
    public AnexoNeoService(
            AnexoNeoService anexoNeoSrv,
            AnexoNeoJpaRepository repository) {
        this.anexoNeoSrv = anexoNeoSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of AnexoNeo by ID
     *
     * @param anexoNeoIdentificador Identification field anexoNeoIdentificador
     *
     * @return Instance of AnexoNeo
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoNeo getById(Long anexoNeoIdentificador) {
        return getByOID(new AnexoNeoOid(anexoNeoIdentificador));
    }
    
    /*
     * Returns an instance of AnexoNeo by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AnexoNeo
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoNeo getByOID(AnexoNeoOid oid) {
        Optional<AnexoNeo> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of AnexoNeo by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AnexoNeo
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public AnexoNeo getByOIDWithHV(AnexoNeoOid oid) {
        Optional<AnexoNeo> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<AnexoNeo> getInstanceByOid(AnexoNeoOid oid) {
        return oid != null && oid.getAnexoNeoIdentificador() != null
               ? repository.findById(oid.getAnexoNeoIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of AnexoNeo by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of AnexoNeo
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public AnexoNeo getByJsonOid(String jsonOid) {
        AnexoNeoOid oid = new AnexoNeoOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            AnexoNeoOid oid = new AnexoNeoOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(AnexoNeoConstants.ATTR_FIELD_ANEXONEOIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAnexoNeoIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(AnexoNeoService.class).error(e.getMessage());
        }
    }

}
