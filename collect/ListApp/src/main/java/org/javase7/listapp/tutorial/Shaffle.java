package org.javase7.listapp.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Masud
 */
public class Shaffle {

    public static void main(String[] args) {
        String[] arr = "i came i saw i left".split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(list);
        System.out.println(list);
    }
}
