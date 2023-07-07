package org.example;

/*
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
 */
public class Sol4 {
    public static int squareDigits(int n) {
        String str = String.valueOf(n);
        String result = "";

        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, 10);
            result += digit * digit;
        }
        return Integer.parseInt(result);
    }
}
