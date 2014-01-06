package org.javase7.effectivejava;

/**
 *
 * @author Masud
 */
public enum Operation3 {

    PLUS("+") {
                @Override
                public int apply(int a, int b) {
                    return a + b;
                }

            },
    MINUS("-") {

                @Override
                public int apply(int a, int b) {
                    return a - b;
                }

            },
    MULTI("*") {

                @Override
                public int apply(int a, int b) {
                    return a * b;
                }
            },
    DIVIDE("/") {

                @Override
                public int apply(int a, int b) {
                    return a / b;
                }
            };
   private final String symbol;

    private Operation3(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
   
    public abstract int apply(int a, int b);
}
