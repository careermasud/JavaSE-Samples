package org.javase7.string;

/**
 *
 * @author Masudul Haque
 */
public class RemoveDup {

    public static void main(String[] args) {
        String word = "Stoooppppd";
        StringBuilder res = new StringBuilder();
        char first = word.charAt(0);
        res.append(first);
        int count=0;
        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != first) {
                count=0;
            }
            else{
                count++;
            }
            if(count<3){
                res.append(ch);
            }
            first = ch;
        }
        System.out.println(res);
    }
}
