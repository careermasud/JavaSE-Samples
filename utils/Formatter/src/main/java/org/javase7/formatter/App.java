package org.javase7.formatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import oracle.jrockit.jfr.parser.ParseException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws java.text.ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //New Format

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd"); //old format
        String dateInString = "2013/10/07"; //string might be in different format
        Date date = sdf2.parse(dateInString);
        System.out.println(sdf.format(date));
    }
}
