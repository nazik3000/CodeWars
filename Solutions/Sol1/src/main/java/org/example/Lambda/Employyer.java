package org.example.Lambda;

public class Employyer {
    private String name;
    private int salary;


    public Employyer(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increaseSalary(int n){
        salary = salary + n;
    }

    @Override
    public String toString() {
        return "Employyer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
