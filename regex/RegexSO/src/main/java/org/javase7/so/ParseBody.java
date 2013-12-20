package org.javase7.so;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class ParseBody {

    public static void main(String[] args) throws IOException {
        String targetFileStr = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "  <body>\n"
                + "        <script src=\"1\"></script>\n"
                + "        <link href=\"1\" />\n"
                + "        <link href=\"2\" />\n"
                + "        <link href=\"3\" />\n"
                + "        <div>TODO write content</div>\n"
                + "    </body>\n"
                + "</html>";
        Matcher matcher = Pattern.compile("<body>(.|[\\r\\n])*?<link").matcher(targetFileStr);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
