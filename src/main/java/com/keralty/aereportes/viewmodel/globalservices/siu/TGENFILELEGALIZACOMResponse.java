package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGENFILELEGALIZACOMResponse extends ServiceResponse {

    @JsonProperty("ps_archivoresultado")
    private byte[] tGENFILELEGALIZACOMpsArchivoResultado;

    @JsonProperty("ps_nombrearchivoresultado")
    private String tGENFILELEGALIZACOMpsNombreArchivoResultado;

    @JsonProperty("ps_resultado")
    private String tGENFILELEGALIZACOMpsResultado;

    public TGENFILELEGALIZACOMResponse() {
        super();
    }

    @JsonIgnore
    public byte[] getTGENFILELEGALIZACOMpsArchivoResultado() {
        return this.tGENFILELEGALIZACOMpsArchivoResultado;
    }

    public void setTGENFILELEGALIZACOMpsArchivoResultado(byte[] tGENFILELEGALIZACOMpsArchivoResultado) {
        this.tGENFILELEGALIZACOMpsArchivoResultado = tGENFILELEGALIZACOMpsArchivoResultado;
    }

    @JsonIgnore
    public String getTGENFILELEGALIZACOMpsNombreArchivoResultado() {
        return this.tGENFILELEGALIZACOMpsNombreArchivoResultado;
    }

    public void setTGENFILELEGALIZACOMpsNombreArchivoResultado(String tGENFILELEGALIZACOMpsNombreArchivoResultado) {
        this.tGENFILELEGALIZACOMpsNombreArchivoResultado = tGENFILELEGALIZACOMpsNombreArchivoResultado;
    }

    @JsonIgnore
    public String getTGENFILELEGALIZACOMpsResultado() {
        return this.tGENFILELEGALIZACOMpsResultado;
    }

    public void setTGENFILELEGALIZACOMpsResultado(String tGENFILELEGALIZACOMpsResultado) {
        this.tGENFILELEGALIZACOMpsResultado = tGENFILELEGALIZACOMpsResultado;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGENFILELEGALIZACOMpsArchivoResultado", tGENFILELEGALIZACOMpsArchivoResultado);
        outArgs.put("tGENFILELEGALIZACOMpsNombreArchivoResultado", tGENFILELEGALIZACOMpsNombreArchivoResultado);
        outArgs.put("tGENFILELEGALIZACOMpsResultado", tGENFILELEGALIZACOMpsResultado);
        return outArgs;
    }
}
