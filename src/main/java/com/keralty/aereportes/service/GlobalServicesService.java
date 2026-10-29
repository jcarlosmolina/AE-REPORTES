package com.keralty.aereportes.service;

import com.keralty.aereportes.exception.ModelException;
import com.keralty.aereportes.exception.SystemException;
import com.keralty.aereportes.global.UserFunctions;
import com.keralty.aereportes.persistence.oid.ReportesProcAlmOid;
import com.keralty.aereportes.persistence.ReportesProcAlm;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.reports.ReportGenerator;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import java.security.spec.KeySpec;

import org.eclipse.microprofile.config.inject.ConfigProperty;
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

    ReportGenerator repGen;
    
	@ConfigProperty(name="com.keralty.integraciones.reactivacion_contratos.token.url", defaultValue = "")
	String reactivacion_contratos_token_url;
	
	@ConfigProperty(name="com.keralty.integraciones.reactivacion_contratos.token.usr", defaultValue = "")
	String reactivacion_contratos_token_usr;
	
	@ConfigProperty(name="com.keralty.integraciones.reactivacion_contratos.token.pwd", defaultValue = "")
	String reactivacion_contratos_token_pwd;
	
	@ConfigProperty(name="com.keralty.integraciones.reactivacion_contratos.token.hash", defaultValue = "")
	String reactivacion_contratos_token_hash;
	
	@ConfigProperty(name="com.keralty.integraciones.reactivacion_contratos.aeskey", defaultValue = "")
	String reactivacion_contratos_aeskey;
	
	@ConfigProperty(name="com.keralty.integraciones.reactivacion_contratos.aessalt", defaultValue = "")
	String reactivacion_contratos_aessalt;
	
	@ConfigProperty(name="com.keralty.integraciones.reactivacion_contratos.url", defaultValue = "")
	String reactivacion_contratos_url;
	
    @Inject
    public GlobalServicesService(
            SolicitudService solicitudSrv,
            SolicitudNovedadService solicitudNovedadSrv,
            ReportesProcAlmService reportesProcAlmSrv,
            GlobalServicesJpaRepository globalServicesRepository,
            UserFunctions userFunctionsSrv,
            GlobalServicesService globalServicesSrv,
            ReportGenerator repGen) {
        this.solicitudSrv = solicitudSrv;
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.reportesProcAlmSrv = reportesProcAlmSrv;
        this.globalServicesRepository = globalServicesRepository;
        this.userFunctionsSrv = userFunctionsSrv;
        this.globalServicesSrv = globalServicesSrv;
        this.repGen = repGen;
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
        // Formamos la ruta completa de la plantilla
        String rutaParcial = step1Response.getSolicitudNovedadgetRutaPlantillaoaRuta();
        String prefijo = this.userFunctionsSrv.fugetValorParametroConfFun("PATH_PLANTILLAS_REPORTS_RT");
        if (prefijo == null || prefijo.isEmpty()) {
        	prefijo = "CLASSPATH:";
        }
        String rutaCompleta = prefijo + rutaParcial;
        if (!"CLASSPATH:".equalsIgnoreCase(prefijo) && !prefijo.endsWith("/") && !rutaParcial.startsWith("/")) {
        	rutaCompleta = prefijo + "/" + rutaParcial;
        }
        
        // Invocamos al generador de reportes
        SolicitudNovedad instancia = request.getOGETREPORTSOLNOVptSolicitudNovedadInstance();
        byte[] pdf = null;
        try {
        	pdf = repGen.generateReport(instancia, rutaCompleta);
        } catch(Exception e) {
        	throw new SystemException(e);
        }        

        
        
        response.setOGETREPORTSOLNOVoaRuta(step1Response.getSolicitudNovedadgetRutaPlantillaoaRuta());
        response.setOGETREPORTSOLNOVoaNombreArchivo(step1Response.getSolicitudNovedadgetRutaPlantillaoaNombreArchivo());
        response.setOGETREPORTSOLNOVoaArchivo(pdf);
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
        // Formamos la ruta completa de la plantilla
        String rutaParcial = step1Response.getSolicitudTGETPLANTILLAREPORTEoaPlantillaInstance().getPlantillaReporte().getPlantillaReporteRutaArchivos();
        String prefijo = this.userFunctionsSrv.fugetValorParametroConfFun("PATH_PLANTILLAS_REPORTS_RT");
        if (prefijo == null || prefijo.isEmpty()) {
        	prefijo = "CLASSPATH:";
        }
        String rutaCompleta = prefijo + rutaParcial;
        if (!"CLASSPATH:".equalsIgnoreCase(prefijo) && !prefijo.endsWith("/") && !rutaParcial.startsWith("/")) {
        	rutaCompleta = prefijo + "/" + rutaParcial;
        }
        
        // Invocamos al generador de reportes
        byte[] pdf = null;
        try {
        	pdf = repGen.generateReport(oGETREPORTEptSolicitud, rutaCompleta);
        } catch(Exception e) {
        	throw new SystemException(e);
        }
        
        response.setOGETREPORTEoaArchivo(pdf);
        String nombreArchivo = step1Response.getSolicitudTGETPLANTILLAREPORTEoaPlantillaInstance().getPlantillaReporte().getPlantillaReporteNombreArchivoPDF() + 
        		"_" + oGETREPORTEptSolicitud.getSolicitudNumRadicado().toString() + ".pdf";
        response.setOGETREPORTEoaNombreArchivo(nombreArchivo);
            globalServicesRepository.refreshEntity(oGETREPORTEptSolicitud);
        } catch (Exception e) { }
        return response;
    }
}
