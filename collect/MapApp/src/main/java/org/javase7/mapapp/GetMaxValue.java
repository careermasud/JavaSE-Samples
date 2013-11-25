package org.javase7.mapapp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Masudul Haque
 */
public class GetMaxValue {

    public static void main(String[] args) {
        Map<String, String> votes = new HashMap<String, String>();
        votes.put("Henk", "School");
        votes.put("Elise", "School");
        votes.put("Jan", "Work");
        votes.put("Mert", "Party");

        Map<String, Integer> countMap = new HashMap<>();
       
        for (Map.Entry<String, String> entry : votes.entrySet()) {
            if (countMap.containsKey(entry.getValue())) {
                countMap.put(entry.getValue(), countMap.get(entry.getValue()) + 1);
            } else {
                countMap.put(entry.getValue(), 1);
            }
        }

        Integer maxNum = Collections.max(countMap.values());

        String result = "";
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (maxNum == entry.getValue()) {
                result = entry.getKey();
            }

        }

        System.out.println(result);

    }
}
