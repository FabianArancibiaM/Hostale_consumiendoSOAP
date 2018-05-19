/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.WebServices.WebService;
import Modelo.WebServices.WebServiceSoap;

/**
 *
 * @author Cochy
 */
public class PanelFinanzas {
    
    WebService ws = new WebService();
    WebServiceSoap client;

    public PanelFinanzas(){
        client = ws.getWebServiceSoap12();
    }
    
    public String Promedio_venta_mensual(){
        return client.promedioVentaMensual();
    }
    
    public String Promedio_perdida_mensual(){
        return client.promedioPerdidaMensual();
    }
    
    public String Porcentage_cierre_efectivo(){
        return client.porcentageCierreEfectivo();
    }
    
}
