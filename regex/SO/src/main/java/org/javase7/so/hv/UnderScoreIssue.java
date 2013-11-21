
package org.javase7.so.hv;

/**
 *
 * @author Masudul Haque
 */
public class UnderScoreIssue {
    public static void main(String[] args) {
//        String str = "\"124343code_numbers = '123_456'\"";
String str = "123hithere12345hi";
str = str.replaceAll("(?x) " + 
               "\\w          " +   // Replace _
               "(?=        " +   // Followed by
               "  (?:      " +   // Start a non-capture group
               "    [^\\w]*  " +   // 0 or more non-single quote characters
               "    hithere      " +   // 1 single quote
               "    [^\\w]*  " +   // 0 or more non-single quote characters
               "    '      " +   // 1 single quote
               "  )*       " +   // 0 or more repetition of non-capture group (multiple of 2 quotes will be even)
               "  [^hithere]*    " +   // Finally 0 or more non-single quotes
               "  $        " +   // Till the end  (This is necessary, else every _ will satisfy the condition)
               ")          " ,   // End look-ahead
                       "x");      // Replace with ""
        System.out.println(str);
    }
}
