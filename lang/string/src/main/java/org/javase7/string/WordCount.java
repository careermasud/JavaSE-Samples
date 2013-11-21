package org.javase7.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class WordCount {

    public static void main(String[] args) {
        String str = "cow wow wow cow cow wow wow";
        String findString = "cow";
//         int lastIndex=0;
//         int count=0;
//         while(lastIndex!= -1){
//             lastIndex=str.indexOf(findString, lastIndex);
//             if(lastIndex!= -1){
//                 count++;
//                 lastIndex+=findString.length();
//             }
//         }
//         System.out.println(count);
        Matcher cowMatcher = Pattern.compile("(.*?cow)")
                .matcher(str);
        int count = 0;

        while (cowMatcher.find())
        ++count;
        System.out.println(count);
    }
}
