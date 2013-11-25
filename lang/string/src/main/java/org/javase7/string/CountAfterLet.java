package org.javase7.string;

/**
 *
 * @author Masudul Haque
 */
public class CountAfterLet {

    public static void main(String[] args) {
         String input="C3F5G10";
    StringBuilder sBuilder=new StringBuilder();
    for(int i=0;i<input.length();i++) {
        if(!(input.charAt(i)>=48 && input.charAt(i)<=57)) {
            sBuilder.append(input.charAt(i));
        }
    }
    System.out.println(sBuilder);
//        String word = "C3F5G10";
//        StringBuilder res = new StringBuilder();
//        char let = ' ';
//        String num = "";
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (Character.isDigit(ch)) {
//                num += ch;
//            } else if (Character.isLetter(ch)) {
//                if (num.length() > 0) {
//                    for (int j = 0; j < Integer.parseInt(num); j++) {
//                        res.append(let);
//                    }
//                }
//                let = ch;
//                num = "";
//            }
//        }
//        if (num.length() > 0) {
//            for (int j = 0; j < Integer.parseInt(num); j++) {
//                res.append(let);
//            }
//        }
//        System.out.println(res);
    }
}
