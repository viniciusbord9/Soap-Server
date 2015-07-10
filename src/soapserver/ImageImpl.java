/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapserver;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

/**
 *
 * @author Usuário
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ImageImpl implements ImageInterface{

    @Override
    public Image downloadImage(String name) {
        try {

            File image = new File("c:\\xampp\\" + name);
            return ImageIO.read(image);

        } catch (IOException e) {

            e.printStackTrace();
            return null;

        }
    }
    
    public byte[] downloadByteImage(String name) {
        String filePath = "c:\\User\\Usuário\\Pictures\\" + name;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] fileBytes = new byte[(int) file.length()];
            inputStream.read(fileBytes);
            inputStream.close();
            return fileBytes;
        } catch (IOException ex) {
            System.err.println(ex);
            throw new WebServiceException(ex);
        }	
    }

    @Override
    public String uploadImage(Image data) {

        if (data != null) {
            //store somewhere
            return "Upload Successful";
        }

        throw new WebServiceException("Upload Failed!");

    }

}
