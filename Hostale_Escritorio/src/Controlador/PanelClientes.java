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
public class PanelClientes {
    WebService ws = new WebService();
    WebServiceSoap client;

    public PanelClientes() {
        client=ws.getWebServiceSoap12();
    }
    
    public String Segun_rubro_empresa(){
        return client.segunRubroEmpresa();
    }
    
    public String Metodo_pago_mas_usado(){
        return client.metodoPagoMasUsado();
    }
    
    public String Ciudad_mas_solicita_servicios(){
        return client.ciudadMasSolicitaServicios();
    }
    
    public String Promedio_Edad(){
        return client.promedioEdad();
    }    
}