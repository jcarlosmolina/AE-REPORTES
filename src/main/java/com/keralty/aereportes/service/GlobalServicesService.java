package com.keralty.aereportes.service;

import com.keralty.aereportes.exception.ModelException;
import com.keralty.aereportes.exception.SystemException;
import com.keralty.aereportes.global.UserFunctions;
import com.keralty.aereportes.persistence.oid.ReportesProcAlmOid;
import com.keralty.aereportes.persistence.ReportesProcAlm;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import com.keralty.aereportes.repository.GlobalServicesJpaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.sql.Date;

@Transactional
@ApplicationScoped
public class GlobalServicesService extends AbstractService {

    GlobalServicesService globalServicesSrv;

    UserFunctions userFunctionsSrv;

    SolicitudService solicitudSrv;

    SolicitudNovedadService solicitudNovedadSrv;

    ReportesProcAlmService reportesProcAlmSrv;

    GlobalServicesJpaRepository globalServicesRepository;

    @Inject
    public GlobalServicesService(
            SolicitudService solicitudSrv,
            SolicitudNovedadService solicitudNovedadSrv,
            ReportesProcAlmService reportesProcAlmSrv,
            GlobalServicesJpaRepository globalServicesRepository,
            UserFunctions userFunctionsSrv,
            GlobalServicesService globalServicesSrv) {
        this.solicitudSrv = solicitudSrv;
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.reportesProcAlmSrv = reportesProcAlmSrv;
        this.globalServicesRepository = globalServicesRepository;
        this.userFunctionsSrv = userFunctionsSrv;
        this.globalServicesSrv = globalServicesSrv;
    }

    /*
     * Entry point for global service TGENFILELEGALIZACOM
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse tGENFILELEGALIZACOM(
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest request) {
        com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse();
        try {
            response = globalServicesSrv.tGENFILELEGALIZACOMTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for global service TGENFILELEGALIZACOM
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse tGENFILELEGALIZACOMTxn(
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest request) throws ModelException, SystemException {
        return globalServicesSrv.tGENFILELEGALIZACOMImplementation(request);
    }

    /*
     * Implements global service TGENFILELEGALIZACOM
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse tGENFILELEGALIZACOMImplementation(
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest request) throws ModelException, SystemException {
        com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse();
        Date tGENFILELEGALIZACOMpFInicio = request.getTGENFILELEGALIZACOMpFInicio();
        Date tGENFILELEGALIZACOMpFFin = request.getTGENFILELEGALIZACOMpFFin();

        request.checkArguments();

        /* Action 1: IF (1 > 2) */
        boolean ifCondition1 = Long.valueOf(1) > Long.valueOf(2);
        if (ifCondition1) {
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest step10Request = new com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest();
            step10Request.setTGENFILELEGALIZACOMpFInicio(tGENFILELEGALIZACOMpFInicio);
            step10Request.setTGENFILELEGALIZACOMpFFin(tGENFILELEGALIZACOMpFFin);
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse step10Response = globalServicesSrv.tGENFILELEGALIZACOMImplementation(step10Request);
            response.setTGENFILELEGALIZACOMpsArchivoResultado(step10Response.getTGENFILELEGALIZACOMpsArchivoResultado());
            response.setTGENFILELEGALIZACOMpsNombreArchivoResultado(step10Response.getTGENFILELEGALIZACOMpsNombreArchivoResultado());
            response.setTGENFILELEGALIZACOMpsResultado(step10Response.getTGENFILELEGALIZACOMpsResultado());
        }
        return response;
    }

    /*
     * Entry point for global service OGETREPORTSOL
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse oGETREPORTSOL(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLRequest request) {
        com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse();
        try {
            response = globalServicesSrv.oGETREPORTSOLTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for global service OGETREPORTSOL
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse oGETREPORTSOLTxn(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLRequest request) throws ModelException, SystemException {
        request.setOGETREPORTSOLptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getOGETREPORTSOLptSolicitud()));
        return globalServicesSrv.oGETREPORTSOLImplementation(request);
    }

    /*
     * Implements global service OGETREPORTSOL
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse oGETREPORTSOLImplementation(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLRequest request) throws ModelException, SystemException {
        com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLResponse();
        Solicitud oGETREPORTSOLptSolicitud = request.getOGETREPORTSOLptSolicitudInstance();

        request.checkArguments();

        try {
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTERequest step1Request = new com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTERequest();
            step1Request.setOGETREPORTEptSolicitudInstance(oGETREPORTSOLptSolicitud);
            step1Request.setOGETREPORTEptTipo(Long.valueOf(0));
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse step1Response = globalServicesSrv.oGETREPORTETxn(step1Request);
            response.setOGETREPORTSOLoaArchivo(step1Response.getOGETREPORTEoaArchivo());
            
            response.setOGETREPORTSOLoaNombreArchivo(step1Response.getOGETREPORTEoaNombreArchivo());
            globalServicesRepository.refreshEntity(oGETREPORTSOLptSolicitud);
        } catch (Exception e) { }
        return response;
    }

    /*
     * Entry point for global service OGETREPORTSOLNOV
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse oGETREPORTSOLNOV(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVRequest request) {
        com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse();
        try {
            response = globalServicesSrv.oGETREPORTSOLNOVTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for global service OGETREPORTSOLNOV
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse oGETREPORTSOLNOVTxn(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVRequest request) throws ModelException, SystemException {
        request.setOGETREPORTSOLNOVptSolicitudNovedadInstance(solicitudNovedadSrv.getByOIDWithHV(request.getOGETREPORTSOLNOVptSolicitudNovedad()));
        return globalServicesSrv.oGETREPORTSOLNOVImplementation(request);
    }

    /*
     * Implements global service OGETREPORTSOLNOV
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse oGETREPORTSOLNOVImplementation(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVRequest request) throws ModelException, SystemException {
        com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse();
        SolicitudNovedad oGETREPORTSOLNOVptSolicitudNovedad = request.getOGETREPORTSOLNOVptSolicitudNovedadInstance();

        request.checkArguments();

        try {
            com.keralty.aereportes.viewmodel.solicitudnovedad.siu.GetRutaPlantillaRequest step1Request = new com.keralty.aereportes.viewmodel.solicitudnovedad.siu.GetRutaPlantillaRequest();
            step1Request.setSolicitudNovedadgetRutaPlantillapthisSolicitudNovedadInstance(oGETREPORTSOLNOVptSolicitudNovedad);
            com.keralty.aereportes.viewmodel.solicitudnovedad.siu.GetRutaPlantillaResponse step1Response = solicitudNovedadSrv.getRutaPlantillaTxn(step1Request);
            response.setOGETREPORTSOLNOVoaRuta(step1Response.getSolicitudNovedadgetRutaPlantillaoaRuta());
            response.setOGETREPORTSOLNOVoaNombreArchivo(step1Response.getSolicitudNovedadgetRutaPlantillaoaNombreArchivo());
            response.setOGETREPORTSOLNOVoaArchivo(step1Response.getSolicitudNovedadgetRutaPlantillaoaReporte());
            globalServicesRepository.refreshEntity(oGETREPORTSOLNOVptSolicitudNovedad);
        } catch (Exception e) { }
        return response;
    }

    /*
     * Entry point for global service TGENREPALM
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse tGENREPALM(
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMRequest request) {
        com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse();
        try {
            response = globalServicesSrv.tGENREPALMTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for global service TGENREPALM
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse tGENREPALMTxn(
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMRequest request) throws ModelException {
        request.setTGENREPALMptReportesProcAlmInstance(reportesProcAlmSrv.getByOIDWithHV(new ReportesProcAlmOid().fromJsonString(request.getTGENREPALMptReportesProcAlm())));
        return globalServicesSrv.tGENREPALMImplementation(request);
    }

    /*
     * Implements global service TGENREPALM
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse tGENREPALMImplementation(
            com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMRequest request) throws ModelException {
        com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.TGENREPALMResponse();
        ReportesProcAlm tGENREPALMptReportesProcAlm = request.getTGENREPALMptReportesProcAlmInstance();
        String tGENREPALMptValorArgumentos = request.getTGENREPALMptValorArgumentos();

        request.checkArguments();

        com.keralty.aereportes.viewmodel.reportesprocalm.siu.EvGenerarRequest step1Request = new com.keralty.aereportes.viewmodel.reportesprocalm.siu.EvGenerarRequest();
        step1Request.setReportesProcAlmevGenerarpthisReportesProcAlmInstance(tGENREPALMptReportesProcAlm);
        step1Request.setReportesProcAlmevGenerarpValorArgumentos(tGENREPALMptValorArgumentos);
        com.keralty.aereportes.viewmodel.reportesprocalm.siu.EvGenerarResponse step1Response = reportesProcAlmSrv.evGenerarImplementation(step1Request);
        response.setTGENREPALMoaFichero(step1Response.getReportesProcAlmevGeneraroaFichero());
        response.setTGENREPALMoaNombreFichero(step1Response.getReportesProcAlmevGeneraroaNombreFichero());
        return response;
    }

    /*
     * Entry point for global service OGETREPORTE
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse oGETREPORTE(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTERequest request) {
        com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse();
        try {
            response = globalServicesSrv.oGETREPORTETxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for global service OGETREPORTE
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse oGETREPORTETxn(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTERequest request) throws ModelException, SystemException {
        request.setOGETREPORTEptSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getOGETREPORTEptSolicitud()));
        return globalServicesSrv.oGETREPORTEImplementation(request);
    }

    /*
     * Implements global service OGETREPORTE
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse oGETREPORTEImplementation(
            com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTERequest request) throws ModelException, SystemException {
        com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse response = new com.keralty.aereportes.viewmodel.globalservices.siu.OGETREPORTEResponse();
        Solicitud oGETREPORTEptSolicitud = request.getOGETREPORTEptSolicitudInstance();
        Long oGETREPORTEptTipo = request.getOGETREPORTEptTipo();

        request.checkArguments();

        try {
            com.keralty.aereportes.viewmodel.solicitud.siu.TGETPLANTILLAREPORTERequest step1Request = new com.keralty.aereportes.viewmodel.solicitud.siu.TGETPLANTILLAREPORTERequest();
            step1Request.setSolicitudTGETPLANTILLAREPORTEpthisSolicitudInstance(oGETREPORTEptSolicitud);
            step1Request.setSolicitudTGETPLANTILLAREPORTEptTipo(oGETREPORTEptTipo);
            com.keralty.aereportes.viewmodel.solicitud.siu.TGETPLANTILLAREPORTEResponse step1Response = solicitudSrv.tGETPLANTILLAREPORTETxn(step1Request);
            response.setOGETREPORTEoaPlantillaInstance(step1Response.getSolicitudTGETPLANTILLAREPORTEoaPlantillaInstance());
            response.setOGETREPORTEoaArchivo(step1Response.getSolicitudTGETPLANTILLAREPORTEoaReporte());
            response.setOGETREPORTEoaNombreArchivo(step1Response.getSolicitudTGETPLANTILLAREPORTEoaNombreArchivo());
            globalServicesRepository.refreshEntity(oGETREPORTEptSolicitud);
        } catch (Exception e) { }
        return response;
    }
}
