package org.javase7.effectivejava;

/**
 *
 * @author Masudul Haque
 */
public class WeightTable {

    public static void main(String[] args) {
        double earthWeight = 60.0;//Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
        }
    }
}
