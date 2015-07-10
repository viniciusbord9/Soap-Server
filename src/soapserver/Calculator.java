/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapserver;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Usuário
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class Calculator implements CalculatorInterface {
    
    @Override
    public int add(int a, int b){
        return (a + b);
    }
    
    @Override
    public int sub(int a, int b){
        return (a - b);
    }
    
}
