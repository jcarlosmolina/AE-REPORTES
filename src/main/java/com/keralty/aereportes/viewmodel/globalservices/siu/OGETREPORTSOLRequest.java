package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.exception.NotNullArgumentException;
import com.keralty.aereportes.global.GlobalServiceConstants;
import com.keralty.aereportes.persistence.oid.SolicitudOid;
import com.keralty.aereportes.persistence.Solicitud;

public class OGETREPORTSOLRequest {

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid oGETREPORTSOLptSolicitud;
    
    @JsonIgnore
    private Solicitud oGETREPORTSOLptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkOGETREPORTSOLptSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getOGETREPORTSOLptSolicitud() {
        return this.oGETREPORTSOLptSolicitud;
    }
    
    public void setOGETREPORTSOLptSolicitud(SolicitudOid oGETREPORTSOLptSolicitud) {
        this.oGETREPORTSOLptSolicitud = oGETREPORTSOLptSolicitud;
    }

    @JsonIgnore
    public Solicitud getOGETREPORTSOLptSolicitudInstance() {
        return this.oGETREPORTSOLptSolicitudInstance;
    }
    
    public void setOGETREPORTSOLptSolicitudInstance(Solicitud oGETREPORTSOLptSolicitud) {
        this.oGETREPORTSOLptSolicitudInstance = oGETREPORTSOLptSolicitud;
        this.oGETREPORTSOLptSolicitud = oGETREPORTSOLptSolicitud != null ? oGETREPORTSOLptSolicitud.getOid() : null;
    }

    private void checkOGETREPORTSOLptSolicitud() throws NotNullArgumentException {
        if(this.getOGETREPORTSOLptSolicitudInstance() == null || this.getOGETREPORTSOLptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_OGETREPORTSOL, GlobalServiceConstants.GS_ARG_ID_OGETREPORTSOL_OGETREPORTSOLPTSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_OGETREPORTSOL, GlobalServiceConstants.GS_ARG_ALIAS_OGETREPORTSOL_OGETREPORTSOLPTSOLICITUD);
        }
    }
}
