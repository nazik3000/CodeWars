package org.example;

/*
Complete the solution so that it splits the string into pairs of two characters.
 If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
 */
public class Sol15 {
    public static String[] solution(String s) {
        char[] chars = s.toCharArray();
        String[] strings = new String[s.length() / 2 + 1];
        String temp = "";
        for (int i = 0; i < chars.length; i++) {
            temp += chars[i];
            if (temp.length() == 2) {
                strings[i / 2] = temp;
                temp = "";
            }
            if (i == chars.length && temp.length() != 2) {
                temp = temp + "_";
                strings[i / 2] = temp;
            }

        }
        return strings;
    }
}
