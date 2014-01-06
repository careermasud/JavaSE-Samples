package org.javase7.effectivejava;

/**
 *
 * @author Masud
 */
public enum Operation2 {

    PLUS {
                @Override
                public int apply(int a, int b) {
                    return a + b;
                }

            },
    MINUS {

                @Override
                public int apply(int a, int b) {
                    return a - b;
                }

            },
    MULTI {

                @Override
                public int apply(int a, int b) {
                    return a * b;
                }
            },
    DIVIDE {

                @Override
                public int apply(int a, int b) {
                    return a / b;
                }
            };

    public abstract int apply(int a, int b);
}
