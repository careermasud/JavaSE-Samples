package org.javase7.genericsconv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * http://stackoverflow.com/questions/20300828/why-a-integet-list-can-be-put-a-double-variable
 * @author Masudul Haque
 */
public class ListIntToDouble {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        try {
            a.getClass().getMethod("add", Object.class).invoke(a, new Double(0.55555));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace(); 
        }
        System.out.println(a.get(0));
    }
}
