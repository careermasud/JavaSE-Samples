
package org.javase7.mapapp.so;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * http://stackoverflow.com/questions/20302811/java-hashmap-two-identical-objects-stored-seperate
 * @author Masudul Haque
 */
public class Test {
 public static void main(String[] args) {
        Map<MyPersonalClass, Integer> map = new HashMap<>();
        MyPersonalClass obj1 = new MyPersonalClass();
        obj1.someInt = 5;
        obj1.someString = "test";

        MyPersonalClass obj2 = new MyPersonalClass();
        obj2.someInt = 5;
        obj2.someString = "test2";

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode() == obj2.hashCode());

        map.put(obj1, 5);
        System.out.println(Arrays.toString(map.values().toArray()));

        System.out.println(map.put(obj2, 10) == 5);
        System.out.println(Arrays.toString(map.values().toArray()));
    }
}

class MyPersonalClass {
    public String someString;
    public int someInt;

    @Override
    public boolean equals(Object arg0) {
        if(arg0 == this) { return true; }
        if(!(arg0 instanceof MyPersonalClass)) { return false; }

        MyPersonalClass obj = (MyPersonalClass) arg0;

        return obj.someString.equals(this.someString) && obj.someInt == this.someInt;
    }

    @Override
    public int hashCode() {
        return this.someString.hashCode() * 37 + this.someInt;
    }
}