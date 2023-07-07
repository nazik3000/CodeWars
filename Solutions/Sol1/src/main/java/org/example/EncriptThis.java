package org.example;


import java.util.Arrays;
import java.util.stream.Collectors;
/*
Hello = 72olle ASCII
 */
public class EncriptThis {
    public static String encryptThis(String text) {
        return Arrays.stream(text.split(" "))
                .map(t -> t.length() > 2 ? (int) t.charAt(0) + t.charAt(t.length()-1)+ t.substring(2,t.length()-1)+t.charAt(1):
                        t.length()>1?(int)t.charAt(0)+t.substring(1):
                        t.length()==1? (int)t.charAt(0)+ "" : "")
                .collect(Collectors.joining(" "));

    }
}
