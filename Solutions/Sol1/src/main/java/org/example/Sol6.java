package org.example;

import java.util.Arrays;

/*
Change letters to ')' -if latter was repeat, '(' - if latter was not
 */
public class Sol6 {
    static String encode(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[i] = ')';
                } else {
                    chars[i] = '(';
                }
            }
        }
        return Arrays.toString(chars);
    }
}
