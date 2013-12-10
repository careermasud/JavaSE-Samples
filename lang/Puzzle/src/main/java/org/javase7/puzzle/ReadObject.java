package org.javase7.puzzle;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Masudul Haque
 */
public class ReadObject {

    public static void main(String[] args) {
        Address address;
        try {
            FileInputStream fin = new FileInputStream("address.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            address = (Address) ois.readObject();
            ois.close();
            System.out.println(address);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
