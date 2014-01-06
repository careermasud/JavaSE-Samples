package org.javase7.effectivejava;

/**
 *
 * @author Masud
 */
public enum Operation {

    PLUS, MINUS, MULTI, DIVIDE;

    public int apply(int a, int b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case MULTI:
                return a * b;
            case DIVIDE:
                return a / b;

        }
        throw new AssertionError("Unknown Operation : "+this);
    }
}
