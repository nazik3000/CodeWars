package org.example;

public class Manager extends Employye{

    private int bonus;
    public Manager(String name, int salary) {
        super(name, salary);
        bonus=0;
    }

    public int getSalary(){
        int baseSalary =super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(int b){
        bonus=b;
    }
}
