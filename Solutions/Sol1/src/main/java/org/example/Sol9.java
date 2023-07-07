package org.example;

/*
the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */
public class Sol9 {
    static String toCamelCase(String s){
        s= s.replaceAll("_" ," ");
        s = s.replaceAll("-"," ");
        String[] str = s.split(" ");

        for (int j = 0; j < str.length; j++) {
            str[j] = str[j].substring(0,1).toUpperCase()+str[j].substring(1);
        }
        String result ="";
        for (int j = 0; j < str.length; j++) {
            result = result +str[j];
        }
        return result;
    }
}
