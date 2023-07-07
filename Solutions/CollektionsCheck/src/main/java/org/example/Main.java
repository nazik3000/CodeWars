package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employye sam = new Employye("Sam", 25000);
        Employye tom = new Employye("Tom", 30000);
        Manager nick = new Manager("Nick", 50000);
        nick.setBonus(5000);

        List<Employye> employyes = new ArrayList<>();
        employyes.add(sam);
        employyes.add(tom);
        employyes.add(nick);
       // System.out.println("nick.toString(): " + nick);
        nick.setBonus(5000);
        //System.out.println(nick.getSalary());

        List<Employye> employyes1 = new LinkedList<>();
        employyes1.add(sam);
        employyes1.add(tom);
        employyes1.add(nick);
        //System.out.println(employyes1.toString());

        Set<Employye> setEmp = new HashSet<>();
        setEmp.add(sam);
        setEmp.add(nick);
        setEmp.addAll(employyes1);
        //System.out.println(setEmp);

        Map<Integer,Employye> employyeTreeMap = new TreeMap<>();
        employyeTreeMap.put(12,sam);
        employyeTreeMap.put(15,nick);
        employyeTreeMap.put(55,tom);



        Map<Integer,Employye> employyeMap = new HashMap<>();
        employyeMap.put(12,sam);
        employyeMap.put(13,nick);
        employyeMap.put(15,sam);
        //System.out.println( employyeMap.get(13));
        }
}