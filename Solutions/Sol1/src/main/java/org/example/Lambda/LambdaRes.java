package org.example.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaRes {
    public static void main(String[] args) {
        Operation<Integer> operation;
        operation = (x, y) -> x + y;
        Operation<String> operation1 = (x, y) -> {
            if (x.equals("Hello")) {
                y = "World!";
            }
            if (y.equals("Laddies")) {
                x = "Good morning";
            }
            return x + " " + y;
        };

//        String helloStr = operation1.calculated("Hello","Rex");
//        System.out.println(helloStr);
//        String ladyStr = operation1.calculated("Preatty","Laddies");
//        System.out.println(ladyStr);
//        String commonStr = operation1.calculated("Do you","Remember");
//        System.out.println(commonStr);

//        int result = operation.calculated(2,3);
//        System.out.println(result);


        Employyer employyer1 = new Employyer("Nazar", 10000);
        Employyer employyer2 = new Employyer("Kirill", 15000);
        Employyer employyer3 = new Employyer("Oleg", 30000);

        List<Employyer> listOfEmp = new ArrayList<>();
        listOfEmp.add(employyer1);
        listOfEmp.add(employyer2);
        listOfEmp.add(employyer3);

        listOfEmp.stream().map(Employyer::getSalary).forEach(System.out::println);


//        listOfEmp.stream()
//                .filter(e -> e.getSalary() <= 15000)
//                .forEach(e -> e.increaseSalary(2500));
//        System.out.println(listOfEmp.toString());

        listOfEmp.stream()
                .peek(e -> e.increaseSalary(1500))
                .peek(System.out::println)
                .collect(Collectors.toList());



        Integer[] enpsIds ={0,1,2};




    }
}
