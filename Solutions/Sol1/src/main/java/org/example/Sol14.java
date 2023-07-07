package org.example;
/*
Pangram
 */
public class Sol14 {
    public static boolean check(String sentence) {
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains(String.valueOf(c)))
                return false;
        return true;
    }
}
