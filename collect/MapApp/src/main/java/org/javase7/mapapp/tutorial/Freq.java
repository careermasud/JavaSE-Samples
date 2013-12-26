package org.javase7.mapapp.tutorial;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Masud
 */
public class Freq {

    public static void main(String[] args) {
        String[] arr = "if it is to be it is up to me to delegate".split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String e : arr) {
            Integer freq = map.get(e);
            map.put(e, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
