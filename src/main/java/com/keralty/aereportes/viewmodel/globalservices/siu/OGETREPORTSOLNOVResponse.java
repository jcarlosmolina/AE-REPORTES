package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class OGETREPORTSOLNOVResponse extends ServiceResponse {

    @JsonProperty("oaruta")
    private String oGETREPORTSOLNOVoaRuta;

    @JsonProperty("oanombrearchivo")
    private String oGETREPORTSOLNOVoaNombreArchivo;

    @JsonProperty("oaarchivo")
    private byte[] oGETREPORTSOLNOVoaArchivo;

    public OGETREPORTSOLNOVResponse() {
        super();
    }

    @JsonIgnore
    public String getOGETREPORTSOLNOVoaRuta() {
        return this.oGETREPORTSOLNOVoaRuta;
    }

    public void setOGETREPORTSOLNOVoaRuta(String oGETREPORTSOLNOVoaRuta) {
        this.oGETREPORTSOLNOVoaRuta = oGETREPORTSOLNOVoaRuta;
    }

    @JsonIgnore
    public String getOGETREPORTSOLNOVoaNombreArchivo() {
        return this.oGETREPORTSOLNOVoaNombreArchivo;
    }

    public void setOGETREPORTSOLNOVoaNombreArchivo(String oGETREPORTSOLNOVoaNombreArchivo) {
        this.oGETREPORTSOLNOVoaNombreArchivo = oGETREPORTSOLNOVoaNombreArchivo;
    }

    @JsonIgnore
    public byte[] getOGETREPORTSOLNOVoaArchivo() {
        return this.oGETREPORTSOLNOVoaArchivo;
    }

    public void setOGETREPORTSOLNOVoaArchivo(byte[] oGETREPORTSOLNOVoaArchivo) {
        this.oGETREPORTSOLNOVoaArchivo = oGETREPORTSOLNOVoaArchivo;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("oGETREPORTSOLNOVoaRuta", oGETREPORTSOLNOVoaRuta);
        outArgs.put("oGETREPORTSOLNOVoaNombreArchivo", oGETREPORTSOLNOVoaNombreArchivo);
        outArgs.put("oGETREPORTSOLNOVoaArchivo", oGETREPORTSOLNOVoaArchivo);
        return outArgs;
    }
}
