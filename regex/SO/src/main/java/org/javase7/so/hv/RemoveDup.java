package org.javase7.so.hv;

/**
 *
 * @author Masudul Haque
 */
public class RemoveDup {

    public static void main(String[] args) {
//        String data = "hello world";
        String data = "stoooooop partyyyyyy";
        System.out.println(data.replaceAll("([a-zA-Z])(\\1{2,})", "$1"));
    }
}
