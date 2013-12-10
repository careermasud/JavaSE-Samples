package org.javase7.puzzle.so;

/**
 * http://stackoverflow.com/questions/3076078/check-if-at-least-two-out-of-three-booleans-are-true
 *
 * @author Masudul Haque
 */
public class CheckTwoBoolean {

    boolean atLeastTwo(boolean a, boolean b, boolean c) {
        return a ? (b || c) : (b && c);
    }

    boolean atLeastTwo2(boolean a, boolean b, boolean c) {
        return a && (b || c) || (b && c);
    }

    boolean atLeastTwo3(boolean a, boolean b, boolean c) {
        return a ^ b ? c : a;
    }

    boolean atLeastTwo4(boolean a, boolean b, boolean c) {
        return (a == b) ? a : c;
    }
    boolean atLeastTwo5(boolean a, boolean b, boolean c) {
        return (a & b) | (b & c) | (c & a);
    }
}
