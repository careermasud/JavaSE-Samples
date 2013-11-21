package org.javase7.formatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class SimpleDateFormatTest {

    public static void main(String[] args) throws java.text.ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //New Format
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd"); //old format
//        String dateInString = "2013/10/07"; //string might be in different format
//        Date date = sdf2.parse(dateInString);
//        System.out.println(sdf.format(date));
        
        DateFormat formatData = new SimpleDateFormat("DD-MMM-YYYY");
        System.out.println(formatData.format(new Date()));
        for (int i = 0; i < 10; i   ++) {
            System.out.println("run");   
        }
        
    }
}
