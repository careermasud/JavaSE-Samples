
package org.javase7.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Masudul Haque
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("file.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!= -1){
//                System.out.println((char)c);
                out.write(c);
            }
        }
        finally{
            in.close();
            out.close();
        }
        
    }
}
