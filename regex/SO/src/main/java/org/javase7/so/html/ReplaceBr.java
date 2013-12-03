
package org.javase7.so.html;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class ReplaceBr {
    public static void main(String[] args) {
        String br="<br>dasfasf</br>";
        
        Matcher matcher=Pattern.compile("<br[^>]*>").matcher(br);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        
    }
}
