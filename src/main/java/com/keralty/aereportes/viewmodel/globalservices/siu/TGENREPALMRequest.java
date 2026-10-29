package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.exception.NotNullArgumentException;
import com.keralty.aereportes.global.GlobalServiceConstants;
import com.keralty.aereportes.persistence.ReportesProcAlm;

public class TGENREPALMRequest {

    @JsonProperty("ptreportesprocalm_json")
    private String tGENREPALMptReportesProcAlm;
    
    @JsonIgnore
    private ReportesProcAlm tGENREPALMptReportesProcAlmInstance;

    @JsonProperty("ptvalorargumentos")
    private String tGENREPALMptValorArgumentos;

    public void checkArguments() throws NotNullArgumentException {
        checkTGENREPALMptReportesProcAlm();
    }

    @JsonIgnore
    public String getTGENREPALMptReportesProcAlm() {
        return this.tGENREPALMptReportesProcAlm;
    }
    
    public void setTGENREPALMptReportesProcAlm(String tGENREPALMptReportesProcAlm) {
        this.tGENREPALMptReportesProcAlm = tGENREPALMptReportesProcAlm;
    }

    @JsonIgnore
    public ReportesProcAlm getTGENREPALMptReportesProcAlmInstance() {
        return this.tGENREPALMptReportesProcAlmInstance;
    }
    
    public void setTGENREPALMptReportesProcAlmInstance(ReportesProcAlm tGENREPALMptReportesProcAlm) {
        this.tGENREPALMptReportesProcAlmInstance = tGENREPALMptReportesProcAlm;
        this.tGENREPALMptReportesProcAlm = tGENREPALMptReportesProcAlm != null ? tGENREPALMptReportesProcAlm.getOid().toJson() : "";
    }

    private void checkTGENREPALMptReportesProcAlm() throws NotNullArgumentException {
        if(this.getTGENREPALMptReportesProcAlmInstance() == null || this.getTGENREPALMptReportesProcAlmInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGENREPALM, GlobalServiceConstants.GS_ARG_ID_TGENREPALM_TGENREPALMPTREPORTESPROCALM, GlobalServiceConstants.G_SERV_ALIAS_TGENREPALM, GlobalServiceConstants.GS_ARG_ALIAS_TGENREPALM_TGENREPALMPTREPORTESPROCALM);
        }
    }

    @JsonIgnore
    public String getTGENREPALMptValorArgumentos() {
        return this.tGENREPALMptValorArgumentos;
    }
    
    public void setTGENREPALMptValorArgumentos(String tGENREPALMptValorArgumentos) {
        this.tGENREPALMptValorArgumentos = tGENREPALMptValorArgumentos;
    }
}
