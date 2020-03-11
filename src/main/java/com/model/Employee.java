package com.model;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Iterator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private  Department department;
    private List<String> task;

    public Employee(String name,int age,double salary,Department department,List<String> task) {
        this.age = age;
        this.name =name;
        this.salary = salary;
        this.department = department;
        this.task =task;
    }

    public void show()
    {

        System.out.println("Name = "+name+" Age = "+age+" Salary ="+salary);
        System.out.println(department.toString());
        Iterator iterator = task.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
