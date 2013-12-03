package org.javase7.builder;

/**
 * http://en.wikipedia.org/wiki/Builder_pattern
 * Example: Effective Java: Item 2.
 * http://stackoverflow.com/questions/5007355/builder-pattern-in-effective-java
 * 
 */
public class App {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
    }
}
