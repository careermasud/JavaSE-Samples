
package org.javase7.basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Masudul Haque
 */
public class CopyCharacter {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        FileWriter writer=null;
        try{
            reader=new FileReader("file.txt");
            writer=new FileWriter("output2.txt");
            int c;
            while((c=reader.read())!= -1){
                writer.write(c);
            }
        }
        finally{
            reader.close();
            writer.close();
        }
    }
}
