package org.javase7.effectivejava;

/**
 *
 * @author Masud
 */
public class OperationTest {

    public static void main(String[] args) {
   
        int x = 20, y = 5;
        for (Operation3 op : Operation3.values()) {
            System.out.printf("%d %s %d = %d%n",
                    x, op, y, op.apply(x, y));
        }
    }
}
