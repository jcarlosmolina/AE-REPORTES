package com.keralty.aereportes.viewmodel.reportesprocalm.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aereportes.viewmodel.QueryResponse;
import com.keralty.aereportes.viewmodel.reportesprocalm.ds.DSReportesProcAlm;

public class PIUReportesProcAlmResponse extends QueryResponse {

    private List<DSReportesProcAlm> results;

    public PIUReportesProcAlmResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUReportesProcAlmResponse(List<DSReportesProcAlm> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSReportesProcAlm> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSReportesProcAlm> results) {
        this.results = results;
    }
}
