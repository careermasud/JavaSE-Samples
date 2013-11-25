package org.javase7.so;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class CopyChar {

    public static void main(String[] args) {
        String str = "ae4a2bca";
        Matcher m = Pattern.compile("(\\d+)(.)").matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, times("$2", Integer.parseInt(m.group(1))));
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

    private static String times(String string, int t) {
        String str = "";
        for (int i = 0; i < t; ++i) {
            str += string;
        }
        return str;
    }
}
