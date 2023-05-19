
package wsfexv1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceSoap", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceSoap {


    /**
     * Autoriza un comprobante, devolviendo  su CAE correspondiente
     * 
     * @param auth
     * @param cmp
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseAuthorize
     */
    @WebMethod(operationName = "FEXAuthorize", action = "http://ar.gov.afip.dif.fexv1/FEXAuthorize")
    @WebResult(name = "FEXAuthorizeResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXAuthorize", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXAuthorize")
    @ResponseWrapper(localName = "FEXAuthorizeResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXAuthorizeResponse")
    public FEXResponseAuthorize fexAuthorize(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth,
        @WebParam(name = "Cmp", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXRequest cmp);

    /**
     * Recupera los datos completos de un comprobante ya autorizado
     * 
     * @param auth
     * @param cmp
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXGetCMPResponse2
     */
    @WebMethod(operationName = "FEXGetCMP", action = "http://ar.gov.afip.dif.fexv1/FEXGetCMP")
    @WebResult(name = "FEXGetCMPResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetCMP", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetCMP")
    @ResponseWrapper(localName = "FEXGetCMPResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetCMPResponse")
    public FEXGetCMPResponse2 fexGetCMP(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth,
        @WebParam(name = "Cmp", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXGetCMP cmp);

    /**
     * Recupera el listado de los tipos de comprobante  y su codigo utilizables en servicio de autorizacion
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseCbteTipo
     */
    @WebMethod(operationName = "FEXGetPARAM_Cbte_Tipo", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_Cbte_Tipo")
    @WebResult(name = "FEXGetPARAM_Cbte_TipoResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_Cbte_Tipo", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMCbteTipo")
    @ResponseWrapper(localName = "FEXGetPARAM_Cbte_TipoResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMCbteTipoResponse")
    public FEXResponseCbteTipo fexGetPARAMCbteTipo(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado de los tipos de exportacion  y sus codigo utilizables en servicio de autorizacion
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseTex
     */
    @WebMethod(operationName = "FEXGetPARAM_Tipo_Expo", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_Tipo_Expo")
    @WebResult(name = "FEXGetPARAM_Tipo_ExpoResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_Tipo_Expo", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMTipoExpo")
    @ResponseWrapper(localName = "FEXGetPARAM_Tipo_ExpoResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMTipoExpoResponse")
    public FEXResponseTex fexGetPARAMTipoExpo(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado Incoterms  utilizables en servicio de autorizacion
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseInc
     */
    @WebMethod(operationName = "FEXGetPARAM_Incoterms", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_Incoterms")
    @WebResult(name = "FEXGetPARAM_IncotermsResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_Incoterms", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMIncoterms")
    @ResponseWrapper(localName = "FEXGetPARAM_IncotermsResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMIncotermsResponse")
    public FEXResponseInc fexGetPARAMIncoterms(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado de los idiomas  y sus codigos utilizables en servicio de autorizacion
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseIdi
     */
    @WebMethod(operationName = "FEXGetPARAM_Idiomas", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_Idiomas")
    @WebResult(name = "FEXGetPARAM_IdiomasResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_Idiomas", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMIdiomas")
    @ResponseWrapper(localName = "FEXGetPARAM_IdiomasResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMIdiomasResponse")
    public FEXResponseIdi fexGetPARAMIdiomas(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado de las unidades de medida  y su codigo utilizables en servicio de autorizacion
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseUmed
     */
    @WebMethod(operationName = "FEXGetPARAM_UMed", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_UMed")
    @WebResult(name = "FEXGetPARAM_UMedResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_UMed", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMUMed")
    @ResponseWrapper(localName = "FEXGetPARAM_UMedResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMUMedResponse")
    public FEXResponseUmed fexGetPARAMUMed(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado de paises
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseDSTPais
     */
    @WebMethod(operationName = "FEXGetPARAM_DST_pais", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_DST_pais")
    @WebResult(name = "FEXGetPARAM_DST_paisResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_DST_pais", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMDSTPais")
    @ResponseWrapper(localName = "FEXGetPARAM_DST_paisResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMDSTPaisResponse")
    public FEXResponseDSTPais fexGetPARAMDSTPais(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado de las cuits de los paises de destinacion
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseDSTCuit
     */
    @WebMethod(operationName = "FEXGetPARAM_DST_CUIT", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_DST_CUIT")
    @WebResult(name = "FEXGetPARAM_DST_CUITResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_DST_CUIT", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMDSTCUIT")
    @ResponseWrapper(localName = "FEXGetPARAM_DST_CUITResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMDSTCUITResponse")
    public FEXResponseDSTCuit fexGetPARAMDSTCUIT(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado  de monedas y su codigo utilizables en servicio de autorizacion
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseMon
     */
    @WebMethod(operationName = "FEXGetPARAM_MON", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_MON")
    @WebResult(name = "FEXGetPARAM_MONResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_MON", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMMON")
    @ResponseWrapper(localName = "FEXGetPARAM_MONResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMMONResponse")
    public FEXResponseMon fexGetPARAMMON(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado  de monedas que tengan cotizacion de ADUANA a una fecha determinada, utilizables en el proceso de autorizacion de comprobantes de servicios
     * 
     * @param auth
     * @param fechaCTZ
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseMonCONCOTIZACION
     */
    @WebMethod(operationName = "FEXGetPARAM_MON_CON_COTIZACION", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_MON_CON_COTIZACION")
    @WebResult(name = "FEXGetPARAM_MON_CON_COTIZACIONResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_MON_CON_COTIZACION", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMMONCONCOTIZACION")
    @ResponseWrapper(localName = "FEXGetPARAM_MON_CON_COTIZACIONResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMMONCONCOTIZACIONResponse")
    public FEXResponseMonCONCOTIZACION fexGetPARAMMONCONCOTIZACION(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth,
        @WebParam(name = "Fecha_CTZ", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        String fechaCTZ);

    /**
     * Recupera el ultimos comprobante autorizado
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseLastCMP
     */
    @WebMethod(operationName = "FEXGetLast_CMP", action = "http://ar.gov.afip.dif.fexv1/FEXGetLast_CMP")
    @WebResult(name = "FEXGetLast_CMPResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetLast_CMP", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetLastCMP")
    @ResponseWrapper(localName = "FEXGetLast_CMPResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetLastCMPResponse")
    public FEXResponseLastCMP fexGetLastCMP(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXLastCMP auth);

    /**
     * Metodo dummy para verificacion de funcionamiento
     * 
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.DummyResponse
     */
    @WebMethod(operationName = "FEXDummy", action = "http://ar.gov.afip.dif.fexv1/FEXDummy")
    @WebResult(name = "FEXDummyResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXDummy", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXDummy")
    @ResponseWrapper(localName = "FEXDummyResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXDummyResponse")
    public DummyResponse fexDummy();

    /**
     * Recupera la cotizacion de la moneda consultada y su  fecha 
     * 
     * @param monId
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseCtz
     */
    @WebMethod(operationName = "FEXGetPARAM_Ctz", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_Ctz")
    @WebResult(name = "FEXGetPARAM_CtzResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_Ctz", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMCtz")
    @ResponseWrapper(localName = "FEXGetPARAM_CtzResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMCtzResponse")
    public FEXResponseCtz fexGetPARAMCtz(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth,
        @WebParam(name = "Mon_id", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        String monId);

    /**
     * Recupera el ultimo ID y su  fecha 
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseLastID
     */
    @WebMethod(operationName = "FEXGetLast_ID", action = "http://ar.gov.afip.dif.fexv1/FEXGetLast_ID")
    @WebResult(name = "FEXGetLast_IDResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetLast_ID", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetLastID")
    @ResponseWrapper(localName = "FEXGetLast_IDResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetLastIDResponse")
    public FEXResponseLastID fexGetLastID(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Recupera el listado de los puntos de venta registrados para Factura electronica de exportacion - WS y su estado
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponsePtoVenta
     */
    @WebMethod(operationName = "FEXGetPARAM_PtoVenta", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_PtoVenta")
    @WebResult(name = "FEXGetPARAM_PtoVentaResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_PtoVenta", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMPtoVenta")
    @ResponseWrapper(localName = "FEXGetPARAM_PtoVentaResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMPtoVentaResponse")
    public FEXResponsePtoVenta fexGetPARAMPtoVenta(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

    /**
     * Verifica la  existencia de la permiso/pais de destinación  de embarque ingresado
     * 
     * @param auth
     * @param idPermiso
     * @param dstMerc
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseCheckPermiso
     */
    @WebMethod(operationName = "FEXCheck_Permiso", action = "http://ar.gov.afip.dif.fexv1/FEXCheck_Permiso")
    @WebResult(name = "FEXCheck_PermisoResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXCheck_Permiso", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXCheckPermiso")
    @ResponseWrapper(localName = "FEXCheck_PermisoResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXCheckPermisoResponse")
    public FEXResponseCheckPermiso fexCheckPermiso(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth,
        @WebParam(name = "ID_Permiso", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        String idPermiso,
        @WebParam(name = "Dst_merc", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        int dstMerc);

    /**
     * Recupera el listado de identificadores para los campos Opcionales
     * 
     * @param auth
     * @return
     *     returns ar.com.expertizen.afip.client.wsfexv1.FEXResponseOpc
     */
    @WebMethod(operationName = "FEXGetPARAM_Opcionales", action = "http://ar.gov.afip.dif.fexv1/FEXGetPARAM_Opcionales")
    @WebResult(name = "FEXGetPARAM_OpcionalesResult", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
    @RequestWrapper(localName = "FEXGetPARAM_Opcionales", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMOpcionales")
    @ResponseWrapper(localName = "FEXGetPARAM_OpcionalesResponse", targetNamespace = "http://ar.gov.afip.dif.fexv1/", className = "ar.com.expertizen.afip.client.wsfexv1.FEXGetPARAMOpcionalesResponse")
    public FEXResponseOpc fexGetPARAMOpcionales(
        @WebParam(name = "Auth", targetNamespace = "http://ar.gov.afip.dif.fexv1/")
        ClsFEXAuthRequest auth);

}
