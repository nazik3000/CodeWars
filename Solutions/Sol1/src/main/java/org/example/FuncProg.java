package org.example;

import java.util.function.Function;
/*
Student may be equals "John Smith js123"
 */
public class FuncProg {
    public static Function<StudentFunc, Boolean> f = s -> s.getFullName().equals("John Smith")
            && s.studentNumber.equals("js123");

}
