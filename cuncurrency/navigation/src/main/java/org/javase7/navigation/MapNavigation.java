/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javase7.navigation;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author Masudul Haque
 */
public class MapNavigation {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap= new TreeMap<>();
        navigableMap.put(23, "Hasan");
        navigableMap.put(13, "Kamal");
        navigableMap.put(43, "Jishan");
        navigableMap.put(3, "Rokon");
        navigableMap.put(23, "Junaid");
        
        Map.Entry<Integer, String> lowerEq = navigableMap.floorEntry(22);
        System.out.println(lowerEq.getKey());
        System.out.println(lowerEq.getValue());
    }
}
