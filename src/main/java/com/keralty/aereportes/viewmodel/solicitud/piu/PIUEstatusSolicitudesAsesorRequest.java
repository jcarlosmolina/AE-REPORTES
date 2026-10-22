package com.keralty.aereportes.viewmodel.solicitud.piu;

import com.keralty.aereportes.viewmodel.PopulationRequestViewModel;
import com.keralty.aereportes.viewmodel.QueryRequest;
import com.keralty.aereportes.viewmodel.solicitud.filter.FSolicitudStatusEstHomo;

public class PIUEstatusSolicitudesAsesorRequest extends PopulationRequestViewModel{

    private FSolicitudStatusEstHomo fSolicitudStatusEstHomo;
    
    public void setFSolicitudStatusEstHomo(FSolicitudStatusEstHomo fSolicitudStatusEstHomo) {
        this.fSolicitudStatusEstHomo = fSolicitudStatusEstHomo;
    }
    
    public FSolicitudStatusEstHomo getFSolicitudStatusEstHomo() {
        return fSolicitudStatusEstHomo;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudStatusEstHomo != null)
            queryRequest.addFilterRequest(fSolicitudStatusEstHomo.buildFilterRequest());
        return queryRequest;
    }
}
