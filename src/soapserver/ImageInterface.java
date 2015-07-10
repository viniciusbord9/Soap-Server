/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapserver;

import java.awt.Image;
 
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Usuário
 */
@WebService
public interface ImageInterface {
    
    
    //download a image from server
    @WebMethod 
    Image downloadImage(String name);
    
    @WebMethod 
    byte[] downloadByteImage(String name);
    
    //update image to server
    @WebMethod 
    String uploadImage(Image data);
    
}
