package org.example;

/*
Isogram
 */
public class Sol10 {
    public static boolean isIsogram(String str) {
        char[] chars = str.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j])
                    return false;
            }
        }
        return true;
    }
}
