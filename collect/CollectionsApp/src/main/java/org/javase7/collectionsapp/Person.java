package org.javase7.collectionsapp;

/**
 *
 * @author Masudul Haque
 */
public class Person implements Comparable<Person> {

    private String city;
    private String name;

    public Person(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public int compareTo(Person o) {
        int c = this.city.compareTo(o.city);
        return (c == 0) ? this.name.compareTo(o.name) : c;
    }

    @Override
    public String toString() {
       return city+"  "+name;
    }
    
}
