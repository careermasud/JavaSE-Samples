
package org.javase7.system;

import java.util.Map;

/**
 *
 * @author Masudul Haque
 */
public class Environment {
    public static void main(String[] args) {
        Map<String, String> envParam = System.getenv();
        System.out.println(envParam);
    }
}
