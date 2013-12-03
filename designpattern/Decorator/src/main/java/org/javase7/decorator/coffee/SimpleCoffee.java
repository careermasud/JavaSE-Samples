
package org.javase7.decorator.coffee;

/**
 *
 * @author Masudul Haque
 */
public class SimpleCoffee extends Coffee{

    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }

}
