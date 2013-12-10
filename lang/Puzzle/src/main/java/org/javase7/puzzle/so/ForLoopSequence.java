package org.javase7.puzzle.so;

/**
 *http://stackoverflow.com/questions/20450056/how-does-a-for-loop-check-its-conditions-in-java
 * @author Masudul Haque
 */
public class ForLoopSequence {

    public static void main(String[] args) {
        int n = 5;
        for (int i = -1; i < n; System.out.print(i + " ")) {
            i++;
        }
    }
}
