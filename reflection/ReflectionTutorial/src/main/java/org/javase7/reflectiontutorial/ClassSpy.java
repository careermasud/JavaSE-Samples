package org.javase7.reflectiontutorial;

import static java.lang.System.out;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import static java.util.logging.Level.ALL;

/**
 *
 * @author Masud
 */
enum ClassMember {

    CONSTRUCTOR, FIELD, METHOD, CLASS, ALL
}

public class ClassSpy {

    public static void main(String... args) {
        String str = "java.lang.ClassCastException";
        String[] arr = {"CONSTRUCTOR", "METHOD", "FIELD"};
        try {
            Class<?> c = Class.forName(str);
            out.format("Class:%n  %s%n%n", c.getCanonicalName());

            Package p = c.getPackage();
            out.format("Package:%n  %s%n%n",
                    (p != null ? p.getName() : "-- No Package --"));

            for (int i = 0; i < arr.length; i++) {
                switch (ClassMember.valueOf(arr[i])) {
                    case CONSTRUCTOR:
                        printMembers(c.getConstructors(), "Constructor");
                        break;
                    case FIELD:
                        printMembers(c.getFields(), "Fields");
                        break;
                    case METHOD:
                        printMembers(c.getMethods(), "Methods");
                        break;
                    case CLASS:
                        printClasses(c);
                        break;
                    case ALL:
                        printMembers(c.getConstructors(), "Constuctors");
                        printMembers(c.getFields(), "Fields");
                        printMembers(c.getMethods(), "Methods");
                        printClasses(c);
                        break;
                    default:
                        assert false;
                }
            }

            // production code should handle these exceptions more gracefully
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }
    }

    private static void printMembers(Member[] mbrs, String s) {
        out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Field) {
                out.format("  %s%n", ((Field) mbr).toGenericString());
            } else if (mbr instanceof Constructor) {
                out.format("  %s%n", ((Constructor) mbr).toGenericString());
            } else if (mbr instanceof Method) {
                out.format("  %s%n", ((Method) mbr).toGenericString());
            }
        }
        if (mbrs.length == 0) {
            out.format("  -- No %s --%n", s);
        }
        out.format("%n");
    }

    private static void printClasses(Class<?> c) {
        out.format("Classes:%n");
        Class<?>[] clss = c.getClasses();
        for (Class<?> cls : clss) {
            out.format("  %s%n", cls.getCanonicalName());
        }
        if (clss.length == 0) {
            out.format("  -- No member interfaces, classes, or enums --%n");
        }
        out.format("%n");
    }
}