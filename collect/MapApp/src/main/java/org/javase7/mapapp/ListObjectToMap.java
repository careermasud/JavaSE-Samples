
package org.javase7.mapapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * http://stackoverflow.com/questions/20408636/convert-listobject-into-hashmapinteger-liststring-what-can-be-a-optimal/20408857#20408857
 * @author Masudul Haque
 */
public class ListObjectToMap {

    public static void main(String[] args) {
        List<Object[]> li = new ArrayList<Object[]>();
        li.add(new Object[]{1, "Orange"});
        li.add(new Object[]{1, "Apple"});
        li.add(new Object[]{1, "Orange"});
        li.add(new Object[]{2, "Guava"});
        li.add(new Object[]{3, "Apple"});
        li.add(new Object[]{3, "Grapes"});

        HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();

        for (Object[] objects : li) {
            if (map.containsKey(objects[0])) {
                List<String> list = map.get(objects[0]);
                list.add((String) objects[1]);
                map.put((Integer) objects[0], list);
            } else {
                List<String> list = new ArrayList<>();
                list.add((String) objects[1]);
                map.put((Integer) objects[0], list);
            }
        }
        System.out.println(map);

    }

}
