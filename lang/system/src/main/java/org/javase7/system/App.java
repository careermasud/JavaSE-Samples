package org.javase7.system;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Person p = new Person();
//        Field[] fields = p.getClass().getFields();
//        System.out.println(fields.length);
        Method[] methods = p.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getReturnType());
        }
//        System.out.println(methods.length);
    }
}
