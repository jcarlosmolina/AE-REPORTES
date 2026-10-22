package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.exception.NotNullArgumentException;
import com.keralty.aereportes.global.GlobalServiceConstants;
import com.keralty.aereportes.persistence.oid.SolicitudNovedadOid;
import com.keralty.aereportes.persistence.SolicitudNovedad;

public class OGETREPORTSOLNOVRequest {

    @JsonProperty("ptsolicitudnovedad_oid")
    private SolicitudNovedadOid oGETREPORTSOLNOVptSolicitudNovedad;
    
    @JsonIgnore
    private SolicitudNovedad oGETREPORTSOLNOVptSolicitudNovedadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkOGETREPORTSOLNOVptSolicitudNovedad();
    }

    @JsonIgnore
    public SolicitudNovedadOid getOGETREPORTSOLNOVptSolicitudNovedad() {
        return this.oGETREPORTSOLNOVptSolicitudNovedad;
    }
    
    public void setOGETREPORTSOLNOVptSolicitudNovedad(SolicitudNovedadOid oGETREPORTSOLNOVptSolicitudNovedad) {
        this.oGETREPORTSOLNOVptSolicitudNovedad = oGETREPORTSOLNOVptSolicitudNovedad;
    }

    @JsonIgnore
    public SolicitudNovedad getOGETREPORTSOLNOVptSolicitudNovedadInstance() {
        return this.oGETREPORTSOLNOVptSolicitudNovedadInstance;
    }
    
    public void setOGETREPORTSOLNOVptSolicitudNovedadInstance(SolicitudNovedad oGETREPORTSOLNOVptSolicitudNovedad) {
        this.oGETREPORTSOLNOVptSolicitudNovedadInstance = oGETREPORTSOLNOVptSolicitudNovedad;
        this.oGETREPORTSOLNOVptSolicitudNovedad = oGETREPORTSOLNOVptSolicitudNovedad != null ? oGETREPORTSOLNOVptSolicitudNovedad.getOid() : null;
    }

    private void checkOGETREPORTSOLNOVptSolicitudNovedad() throws NotNullArgumentException {
        if(this.getOGETREPORTSOLNOVptSolicitudNovedadInstance() == null || this.getOGETREPORTSOLNOVptSolicitudNovedadInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_OGETREPORTSOLNOV, GlobalServiceConstants.GS_ARG_ID_OGETREPORTSOLNOV_OGETREPORTSOLNOVPTSOLICITUDNOVEDAD, GlobalServiceConstants.G_SERV_ALIAS_OGETREPORTSOLNOV, GlobalServiceConstants.GS_ARG_ALIAS_OGETREPORTSOLNOV_OGETREPORTSOLNOVPTSOLICITUDNOVEDAD);
        }
    }
}
