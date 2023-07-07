package org.example;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
org/example/Student.javas
 */

public class TrippleSorrted {
    public static void main(String[] args) {
        List<StudentTrippleSort> studentTrippleSorts = new ArrayList<>();
        studentTrippleSorts.add(new StudentTrippleSort(23, 88, "David Goodman"));
        studentTrippleSorts.add(new StudentTrippleSort(25, 82, "Mark Rose"));
        studentTrippleSorts.add(new StudentTrippleSort(22, 90, "Jane Doe"));
        studentTrippleSorts.add(new StudentTrippleSort(25, 90, "Jane Dane"));
        System.out.println(studentTrippleSorts);
        sort(studentTrippleSorts);
        System.out.println(sort(studentTrippleSorts));
    }


    public static String sort(List<StudentTrippleSort> studentTrippleSorts) {
       return studentTrippleSorts.stream().sorted(Comparator.comparingInt(StudentTrippleSort::getGpa).reversed()
                .thenComparing(s -> s.getName().split(" ")[1].charAt(0))
                .thenComparing(StudentTrippleSort::getAge))
                .map(StudentTrippleSort::getName)
                .collect(Collectors.joining(", "));


    }
}

