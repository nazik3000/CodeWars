package org.example;

public class StudentTrippleSort {
    private int age;
    private int gpa;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }

    public StudentTrippleSort(int age, int gpa, String name) {
        this.age = age;
        this.gpa = gpa;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
