package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.exception.NotNullArgumentException;
import com.keralty.aereportes.global.GlobalServiceConstants;
import com.keralty.aereportes.persistence.oid.SolicitudOid;
import com.keralty.aereportes.persistence.Solicitud;

public class OGETREPORTERequest {

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid oGETREPORTEptSolicitud;
    
    @JsonIgnore
    private Solicitud oGETREPORTEptSolicitudInstance;

    @JsonProperty("pttipo")
    private Long oGETREPORTEptTipo;

    public void checkArguments() throws NotNullArgumentException {
        checkOGETREPORTEptSolicitud();
        checkOGETREPORTEptTipo();
    }

    @JsonIgnore
    public SolicitudOid getOGETREPORTEptSolicitud() {
        return this.oGETREPORTEptSolicitud;
    }
    
    public void setOGETREPORTEptSolicitud(SolicitudOid oGETREPORTEptSolicitud) {
        this.oGETREPORTEptSolicitud = oGETREPORTEptSolicitud;
    }

    @JsonIgnore
    public Solicitud getOGETREPORTEptSolicitudInstance() {
        return this.oGETREPORTEptSolicitudInstance;
    }
    
    public void setOGETREPORTEptSolicitudInstance(Solicitud oGETREPORTEptSolicitud) {
        this.oGETREPORTEptSolicitudInstance = oGETREPORTEptSolicitud;
        this.oGETREPORTEptSolicitud = oGETREPORTEptSolicitud != null ? oGETREPORTEptSolicitud.getOid() : null;
    }

    private void checkOGETREPORTEptSolicitud() throws NotNullArgumentException {
        if(this.getOGETREPORTEptSolicitudInstance() == null || this.getOGETREPORTEptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_OGETREPORTE, GlobalServiceConstants.GS_ARG_ID_OGETREPORTE_OGETREPORTEPTSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_OGETREPORTE, GlobalServiceConstants.GS_ARG_ALIAS_OGETREPORTE_OGETREPORTEPTSOLICITUD);
        }
    }

    @JsonIgnore
    public Long getOGETREPORTEptTipo() {
        return this.oGETREPORTEptTipo;
    }
    
    public void setOGETREPORTEptTipo(Long oGETREPORTEptTipo) {
        this.oGETREPORTEptTipo = oGETREPORTEptTipo;
    }

    private void checkOGETREPORTEptTipo() throws NotNullArgumentException {
        if(this.getOGETREPORTEptTipo() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_OGETREPORTE, GlobalServiceConstants.GS_ARG_ID_OGETREPORTE_OGETREPORTEPTTIPO, GlobalServiceConstants.G_SERV_ALIAS_OGETREPORTE, GlobalServiceConstants.GS_ARG_ALIAS_OGETREPORTE_OGETREPORTEPTTIPO);
        }
    }
}
