package com.keralty.aereportes.api.globalservices;

import com.keralty.aereportes.service.GlobalServicesService;
import com.keralty.aereportes.utils.TokenUtilities;
import com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTERequest;
import com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse;
import com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVRequest;
import com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse;
import com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLRequest;
import com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse;
import com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest;
import com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse;
import com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMRequest;
import com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.jwt.JsonWebToken;

@Path("/api/GlobalServicesApi")
@RequestScoped
public class GlobalServicesApi {

    GlobalServicesService service;

    public GlobalServicesApi(GlobalServicesService service, JsonWebToken jwt) {
        this.service = service;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @POST
    @Path(value = "/TGENFILELEGALIZACOM")
    @RolesAllowed({"Admin","SuperAdmin","Afiliaciones"})
    public TGENFILELEGALIZACOMResponse tGENFILELEGALIZACOM(TGENFILELEGALIZACOMRequest request) {
        return service.tGENFILELEGALIZACOM(request);
    }

    @POST
    @Path(value = "/OGETREPORTSOL")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public OGETREPORTSOLResponse oGETREPORTSOL(OGETREPORTSOLRequest request) {
        return service.oGETREPORTSOL(request);
    }

    @POST
    @Path(value = "/OGETREPORTSOLNOV")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public OGETREPORTSOLNOVResponse oGETREPORTSOLNOV(OGETREPORTSOLNOVRequest request) {
        return service.oGETREPORTSOLNOV(request);
    }

    @POST
    @Path(value = "/TGENREPALM")
    @RolesAllowed({"Admin","SuperAdmin","RespRegional","Asesor","Afiliaciones"})
    public TGENREPALMResponse tGENREPALM(TGENREPALMRequest request) {
        return service.tGENREPALM(request);
    }

    @POST
    @Path(value = "/OGETREPORTE")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public OGETREPORTEResponse oGETREPORTE(OGETREPORTERequest request) {
        return service.oGETREPORTE(request);
    }
}
