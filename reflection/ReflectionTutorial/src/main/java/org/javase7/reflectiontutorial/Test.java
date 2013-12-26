package org.javase7.reflectiontutorial;

/**
 *
 * @author Masud
 */
public class Test {

    enum A {

        a, b;
    }

    public static void main(String[] args) {
//        System.out.println("ffdfa".getClass().getName());
        Class c = int[][][].class;
        System.out.println(c.getName());
        System.out.println(A.class.getName());
    }
}
