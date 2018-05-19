
import Modelo.WebServices.WebService;
import Modelo.WebServices.WebServiceSoap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cochy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WebService ws = new WebService();
        WebServiceSoap client = ws.getWebServiceSoap12();
        System.out.println("Test---->"+client.promedioEdad());
        
    }
    
}
