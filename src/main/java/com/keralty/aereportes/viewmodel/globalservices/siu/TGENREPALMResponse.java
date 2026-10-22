package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGENREPALMResponse extends ServiceResponse {

    @JsonProperty("oafichero")
    private byte[] tGENREPALMoaFichero;

    @JsonProperty("oanombrefichero")
    private String tGENREPALMoaNombreFichero;

    public TGENREPALMResponse() {
        super();
    }

    @JsonIgnore
    public byte[] getTGENREPALMoaFichero() {
        return this.tGENREPALMoaFichero;
    }

    public void setTGENREPALMoaFichero(byte[] tGENREPALMoaFichero) {
        this.tGENREPALMoaFichero = tGENREPALMoaFichero;
    }

    @JsonIgnore
    public String getTGENREPALMoaNombreFichero() {
        return this.tGENREPALMoaNombreFichero;
    }

    public void setTGENREPALMoaNombreFichero(String tGENREPALMoaNombreFichero) {
        this.tGENREPALMoaNombreFichero = tGENREPALMoaNombreFichero;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGENREPALMoaFichero", tGENREPALMoaFichero);
        outArgs.put("tGENREPALMoaNombreFichero", tGENREPALMoaNombreFichero);
        return outArgs;
    }
}
