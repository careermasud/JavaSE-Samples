package org.javase7.mapapp;

import java.util.HashMap;
import java.util.Map;

/**
 * http://stackoverflow.com/questions/20173657/how-to-discover-which-value-occurs-the-most-in-a-hashmap/20173792#20173792
 * @author Masudul Haque
 */
public class MostFrequentValue {

    public static void main(String[] args) {
        Map<String, String> votes = new HashMap<String, String>();
        votes.put("Henk", "School");
        votes.put("Elise", "School");
        votes.put("Jan", "Work");
        votes.put("Mert", "Party");
        
        String res=mostFrequentElement(votes.values());
        System.out.println(res);
        
    }

    public static <E> E mostFrequentElement(Iterable<E> iterable) {
        Map<E, Integer> freqMap = new HashMap<>();
        E mostFreq = null;
        int mostFreqCount = -1;
        for (E e : iterable) {
            Integer count = freqMap.get(e);
            freqMap.put(e, count = (count == null ? 1 : count + 1));
            // maintain the most frequent in a single pass.
            if (count > mostFreqCount) {
                mostFreq = e;
                mostFreqCount = count;
            }
        }
        return mostFreq;
    }
}
