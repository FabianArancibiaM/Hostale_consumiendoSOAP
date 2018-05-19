
package Modelo.WebServices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld", action = "http://tempuri.org/HelloWorld")
    @WebResult(name = "HelloWorldResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.HelloWorld")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.HelloWorldResponse")
    public String helloWorld();

    /**
     * 
     * @param clave
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ValidarLogin", action = "http://tempuri.org/ValidarLogin")
    @WebResult(name = "ValidarLoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ValidarLogin", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.ValidarLogin")
    @ResponseWrapper(localName = "ValidarLoginResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.ValidarLoginResponse")
    public String validarLogin(
        @WebParam(name = "nombre", targetNamespace = "http://tempuri.org/")
        String nombre,
        @WebParam(name = "clave", targetNamespace = "http://tempuri.org/")
        String clave);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "StockProductos", action = "http://tempuri.org/StockProductos")
    @WebResult(name = "StockProductosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "StockProductos", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.StockProductos")
    @ResponseWrapper(localName = "StockProductosResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.StockProductosResponse")
    public String stockProductos();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Productos_mas_solicitados", action = "http://tempuri.org/Productos_mas_solicitados")
    @WebResult(name = "Productos_mas_solicitadosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Productos_mas_solicitados", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.ProductosMasSolicitados")
    @ResponseWrapper(localName = "Productos_mas_solicitadosResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.ProductosMasSolicitadosResponse")
    public String productosMasSolicitados();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Segun_rubro_empresa", action = "http://tempuri.org/Segun_rubro_empresa")
    @WebResult(name = "Segun_rubro_empresaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Segun_rubro_empresa", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.SegunRubroEmpresa")
    @ResponseWrapper(localName = "Segun_rubro_empresaResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.SegunRubroEmpresaResponse")
    public String segunRubroEmpresa();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Metodo_pago_mas_usado", action = "http://tempuri.org/Metodo_pago_mas_usado")
    @WebResult(name = "Metodo_pago_mas_usadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Metodo_pago_mas_usado", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.MetodoPagoMasUsado")
    @ResponseWrapper(localName = "Metodo_pago_mas_usadoResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.MetodoPagoMasUsadoResponse")
    public String metodoPagoMasUsado();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Ciudad_mas_solicita_servicios", action = "http://tempuri.org/Ciudad_mas_solicita_servicios")
    @WebResult(name = "Ciudad_mas_solicita_serviciosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Ciudad_mas_solicita_servicios", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.CiudadMasSolicitaServicios")
    @ResponseWrapper(localName = "Ciudad_mas_solicita_serviciosResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.CiudadMasSolicitaServiciosResponse")
    public String ciudadMasSolicitaServicios();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Promedio_Edad", action = "http://tempuri.org/Promedio_Edad")
    @WebResult(name = "Promedio_EdadResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Promedio_Edad", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PromedioEdad")
    @ResponseWrapper(localName = "Promedio_EdadResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PromedioEdadResponse")
    public String promedioEdad();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Estado_habitaciones", action = "http://tempuri.org/Estado_habitaciones")
    @WebResult(name = "Estado_habitacionesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Estado_habitaciones", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.EstadoHabitaciones")
    @ResponseWrapper(localName = "Estado_habitacionesResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.EstadoHabitacionesResponse")
    public String estadoHabitaciones();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Habitaciones_mas_solicitadas", action = "http://tempuri.org/Habitaciones_mas_solicitadas")
    @WebResult(name = "Habitaciones_mas_solicitadasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Habitaciones_mas_solicitadas", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.HabitacionesMasSolicitadas")
    @ResponseWrapper(localName = "Habitaciones_mas_solicitadasResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.HabitacionesMasSolicitadasResponse")
    public String habitacionesMasSolicitadas();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Fecha_mayor_auge", action = "http://tempuri.org/Fecha_mayor_auge")
    @WebResult(name = "Fecha_mayor_augeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Fecha_mayor_auge", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.FechaMayorAuge")
    @ResponseWrapper(localName = "Fecha_mayor_augeResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.FechaMayorAugeResponse")
    public String fechaMayorAuge();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Solicitudes_NO_terminadas", action = "http://tempuri.org/Solicitudes_NO_terminadas")
    @WebResult(name = "Solicitudes_NO_terminadasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Solicitudes_NO_terminadas", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.SolicitudesNOTerminadas")
    @ResponseWrapper(localName = "Solicitudes_NO_terminadasResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.SolicitudesNOTerminadasResponse")
    public String solicitudesNOTerminadas();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Promedio_venta_mensual", action = "http://tempuri.org/Promedio_venta_mensual")
    @WebResult(name = "Promedio_venta_mensualResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Promedio_venta_mensual", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PromedioVentaMensual")
    @ResponseWrapper(localName = "Promedio_venta_mensualResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PromedioVentaMensualResponse")
    public String promedioVentaMensual();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Promedio_perdida_mensual", action = "http://tempuri.org/Promedio_perdida_mensual")
    @WebResult(name = "Promedio_perdida_mensualResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Promedio_perdida_mensual", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PromedioPerdidaMensual")
    @ResponseWrapper(localName = "Promedio_perdida_mensualResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PromedioPerdidaMensualResponse")
    public String promedioPerdidaMensual();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Porcentage_cierre_efectivo", action = "http://tempuri.org/Porcentage_cierre_efectivo")
    @WebResult(name = "Porcentage_cierre_efectivoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Porcentage_cierre_efectivo", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PorcentageCierreEfectivo")
    @ResponseWrapper(localName = "Porcentage_cierre_efectivoResponse", targetNamespace = "http://tempuri.org/", className = "Modelo.WebServices.PorcentageCierreEfectivoResponse")
    public String porcentageCierreEfectivo();

}