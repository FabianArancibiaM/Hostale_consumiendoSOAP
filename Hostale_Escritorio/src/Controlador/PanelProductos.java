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
public class PanelProductos {
    WebService ws = new WebService();
    WebServiceSoap client;

    public PanelProductos() {
        client=ws.getWebServiceSoap12();
    }
    
    public String StockProductos(){
        return client.stockProductos();
    }
    
    public String Productos_mas_solicitados(){
        return client.productosMasSolicitados();
    }   
    
}
