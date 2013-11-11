
package org.javase7.so.hv;

import java.io.File;

/**
 *
 * @author Masudul Haque
 */
public class SplitByNewLint {
    public static void main(String[] args) {
        String sample="I love\nyou more\nthan\nI say";
//        String[] out=sample.split("\\r?\\n");
        String lineSep=System.getProperty("line.separator");
        System.out.println(lineSep);
        String[] out=sample.split(lineSep);
        for (String line : out) {
            System.out.println(line);
        }
    }
}
