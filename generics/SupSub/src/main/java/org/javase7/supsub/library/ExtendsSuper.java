
package org.javase7.supsub.library;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author Masudul Haque 
 */
public class ExtendsSuper {
    public static void main(String[] args) {
        List<? super OutputStream> extList=null;
        extList.add(new ByteArrayOutputStream());
        List<? super OutputStream> supList=null;
    }
}
