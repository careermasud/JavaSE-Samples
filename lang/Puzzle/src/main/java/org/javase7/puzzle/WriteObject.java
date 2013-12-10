package org.javase7.puzzle;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Masudul Haque
 */
public class WriteObject {

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("wall street");
        address.setCountry("united states");

        try {
            FileOutputStream fout = new FileOutputStream("address.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(address);
            oos.close();
            System.out.println("Done");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

