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
public class PanelHabitaciones {
    
    WebService ws = new WebService();
    WebServiceSoap client;

    public PanelHabitaciones() {
        client = ws.getWebServiceSoap12();
    }
    
    public String Estado_habitaciones(){
        return client.estadoHabitaciones();
    }
    
    public String Habitaciones_mas_solicitadas(){
        return client.habitacionesMasSolicitadas();
    }            
    
    public String Fecha_mayor_auge(){
        return client.fechaMayorAuge();
    }
    
    public String Solicitudes_NO_terminadas(){
        return client.solicitudesNOTerminadas();
    }    
}
