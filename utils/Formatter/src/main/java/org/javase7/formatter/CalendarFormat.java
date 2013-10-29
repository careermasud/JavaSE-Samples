package org.javase7.formatter;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Masudul Haque
 */
public class CalendarFormat {

    public static void main(String[] args) {
        // Writes a formatted string to System.out.
        System.out.format("Local time: %tT\n", Calendar.getInstance());
        // -> "Local time: 13:34:18"
        // Writes formatted output to System.err.
        //   System.err.printf("Unable to open file '%1$s': %2$s", fileName, exception.getMessage());
        // -> "Unable to open file 'food': No such file or directory"

        Calendar c = new GregorianCalendar(1995, Calendar.MAY, 23);
        String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY\n", c);
        System.out.println(s);
    }
}
