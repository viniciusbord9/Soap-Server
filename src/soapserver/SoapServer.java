/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapserver;

/**
 *
 * @author Usuário
 */
import javax.xml.ws.Endpoint;
public class SoapServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Endpoint.publish("http://localhost:9999/ws/calculator", new Calculator());
        Endpoint.publish("http://localhost:9999/ws/image", new ImageImpl());
    }
    
}
