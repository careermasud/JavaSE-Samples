package org.javase7.formatter;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author Masudul Haque
 */
public class StringFormat {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Send all output to the Appendable object sb
        Formatter formatter = new Formatter(sb, Locale.US);
        // Explicit argument indices may be used to re-order output.
        Formatter str = formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d"); // -> " d  c  b  a"
        System.out.println(str.toString());
        // Optional locale as the first argument can be used to get
        // locale-specific formatting of numbers.  The precision and width can be
        // given to round and align the value.
        Formatter str2 = formatter.format(Locale.FRANCE, "e = %+10.4f", Math.E);
        // -> "e =    +2,7183"
        System.out.println(str2.toString());
        
        // The '(' numeric flag may be used to format negative numbers with
        // parentheses rather than a minus sign.  Group separators are
        // automatically inserted.
        double balanceDelta = 6217.58;
        formatter.format("Amount gained or lost since last statement: $ %(,.2f",
                balanceDelta);
        // -> "Amount gained or lost since last statement: $ (6,217.58)"
    }
}
