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
public class PanelLogin {
    
    WebService ws = new WebService();
    WebServiceSoap client;

    public PanelLogin(){
        client = ws.getWebServiceSoap12();
    }
    
    public String ValidarLogin(String nombre, String clave){
        return client.validarLogin(nombre, clave);
    }
    
    
}
