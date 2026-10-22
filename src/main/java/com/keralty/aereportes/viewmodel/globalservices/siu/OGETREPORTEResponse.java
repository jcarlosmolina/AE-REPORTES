package com.keralty.aereportes.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aereportes.persistence.oid.ReportesDominioOid;
import com.keralty.aereportes.persistence.ReportesDominio;
import com.keralty.aereportes.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class OGETREPORTEResponse extends ServiceResponse {

    @JsonProperty("oaarchivo")
    private byte[] oGETREPORTEoaArchivo;

    @JsonProperty("oaplantilla")
    private ReportesDominioOid oGETREPORTEoaPlantilla;
    
    @JsonIgnore
    private ReportesDominio oGETREPORTEoaPlantillaInstance;

    @JsonProperty("oanombrearchivo")
    private String oGETREPORTEoaNombreArchivo;

    public OGETREPORTEResponse() {
        super();
    }

    @JsonIgnore
    public byte[] getOGETREPORTEoaArchivo() {
        return this.oGETREPORTEoaArchivo;
    }

    public void setOGETREPORTEoaArchivo(byte[] oGETREPORTEoaArchivo) {
        this.oGETREPORTEoaArchivo = oGETREPORTEoaArchivo;
    }

    @JsonIgnore
    public ReportesDominioOid getOGETREPORTEoaPlantilla() {
        return this.oGETREPORTEoaPlantilla;
    }

    public void setOGETREPORTEoaPlantilla(ReportesDominioOid oGETREPORTEoaPlantilla) {
        this.oGETREPORTEoaPlantilla = oGETREPORTEoaPlantilla;
    }
    @JsonIgnore
    public ReportesDominio getOGETREPORTEoaPlantillaInstance() {
        return this.oGETREPORTEoaPlantillaInstance;
    }
    
    public void setOGETREPORTEoaPlantillaInstance(ReportesDominio oGETREPORTEoaPlantilla) {
        if (oGETREPORTEoaPlantilla != null && !oGETREPORTEoaPlantilla.isNull()) {
            this.oGETREPORTEoaPlantilla = oGETREPORTEoaPlantilla.getOid();
            this.oGETREPORTEoaPlantillaInstance = oGETREPORTEoaPlantilla;
        } else {
            this.oGETREPORTEoaPlantilla = null;
            this.oGETREPORTEoaPlantillaInstance = null;
        }
    }

    @JsonIgnore
    public String getOGETREPORTEoaNombreArchivo() {
        return this.oGETREPORTEoaNombreArchivo;
    }

    public void setOGETREPORTEoaNombreArchivo(String oGETREPORTEoaNombreArchivo) {
        this.oGETREPORTEoaNombreArchivo = oGETREPORTEoaNombreArchivo;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("oGETREPORTEoaArchivo", oGETREPORTEoaArchivo);
        outArgs.put("oGETREPORTEoaPlantilla", oGETREPORTEoaPlantilla);
        outArgs.put("oGETREPORTEoaNombreArchivo", oGETREPORTEoaNombreArchivo);
        return outArgs;
    }
}
