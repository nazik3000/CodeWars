package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Stream;
/*
just a-zA-z0-9 symbols no "-" and "_";
 */
public class NotVerySecure {
    public static boolean alphanumeric(String s){

        String [] str = s.split("");

        return  Arrays.stream(str).allMatch(s1->s1.matches("\\w+"));
    }
}
