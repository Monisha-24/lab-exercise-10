/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class filecopying {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Internal Assessment\\src\\lab\\newfile"); 
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Internal Assessment\\src\\lab\\newfile1");
            int read;
            while((read=fis.read())!=-1)
            {
                if((char)read!=' ')
                {
                    fos.write(read);
                }
            }
            fis.close();
            fos.close();
    }
    
}
