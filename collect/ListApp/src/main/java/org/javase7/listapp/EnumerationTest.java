package org.javase7.listapp;

import java.util.Enumeration;
import java.util.Stack;

/**
 *
 * @author Masud
 */
public class EnumerationTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        for(Enumeration<String> e=stack.elements();e.hasMoreElements();){
            System.out.println(e.nextElement());
        }
    }
}
