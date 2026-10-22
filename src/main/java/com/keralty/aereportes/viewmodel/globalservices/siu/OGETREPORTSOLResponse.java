package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class OGETREPORTSOLResponse extends ServiceResponse {

    @JsonProperty("oaarchivo")
    private byte[] oGETREPORTSOLoaArchivo;

    @JsonProperty("oanombrearchivo")
    private String oGETREPORTSOLoaNombreArchivo;

    public OGETREPORTSOLResponse() {
        super();
    }

    @JsonIgnore
    public byte[] getOGETREPORTSOLoaArchivo() {
        return this.oGETREPORTSOLoaArchivo;
    }

    public void setOGETREPORTSOLoaArchivo(byte[] oGETREPORTSOLoaArchivo) {
        this.oGETREPORTSOLoaArchivo = oGETREPORTSOLoaArchivo;
    }

    @JsonIgnore
    public String getOGETREPORTSOLoaNombreArchivo() {
        return this.oGETREPORTSOLoaNombreArchivo;
    }

    public void setOGETREPORTSOLoaNombreArchivo(String oGETREPORTSOLoaNombreArchivo) {
        this.oGETREPORTSOLoaNombreArchivo = oGETREPORTSOLoaNombreArchivo;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("oGETREPORTSOLoaArchivo", oGETREPORTSOLoaArchivo);
        outArgs.put("oGETREPORTSOLoaNombreArchivo", oGETREPORTSOLoaNombreArchivo);
        return outArgs;
    }
}
