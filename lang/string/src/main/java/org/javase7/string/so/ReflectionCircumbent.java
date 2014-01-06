package org.javase7.string.so;

import java.lang.reflect.Field;

/**
 * http://stackoverflow.com/questions/20945049/is-a-java-string-really-immutable
 *
 * @author Masud
 */
public class ReflectionCircumbent {

    public static void main(String[] args) throws Exception {
        String s1 = "Hello World";
        String s2 = "Hello World";
        System.out.println(s1);
        System.out.println(s2);

        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        char[] value = (char[]) field.get(s1);
        value[6] = 'J';
        value[7] = 'a';
        value[8] = 'v';
        value[9] = 'a';
        value[10] = '!';
        System.out.println(value);

    }
}
