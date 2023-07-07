package org.example;

public class Employye {
    private String name;
    private int salary;

    public Employye(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
