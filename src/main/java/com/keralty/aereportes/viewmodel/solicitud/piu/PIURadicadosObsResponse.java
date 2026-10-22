package com.keralty.aereportes.viewmodel.solicitud.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aereportes.viewmodel.QueryResponse;
import com.keralty.aereportes.viewmodel.solicitud.ds.DSSolicitudPIURadicado;

public class PIURadicadosObsResponse extends QueryResponse {

    private List<DSSolicitudPIURadicado> results;

    public PIURadicadosObsResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIURadicadosObsResponse(List<DSSolicitudPIURadicado> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSSolicitudPIURadicado> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSSolicitudPIURadicado> results) {
        this.results = results;
    }
}
