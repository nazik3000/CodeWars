package org.example;

import org.w3c.dom.css.Counter;

public class Sol12  {
    public static String pigIt(String str) {
        String [] strings = str.split(" ");
        String temp=" ";

        for (String s:strings) {
            s = s.substring(1) + s.charAt(0) ;

            temp += " " +s;
        }

        return temp;
    }
}
