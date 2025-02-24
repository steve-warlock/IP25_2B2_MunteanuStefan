package com.lab1;

import java.util.ArrayList;
import java.util.List;
public class Hospital {
    private List<Employee> employees = new ArrayList<>();
    public void AddEmployee(Employee employee) {
        this.employees.add(employee);
    }
    public void PrintStaff() {
        for(Employee e: employees) {
            e.GetIdStaff();
            e.Work();
            e.WhatDoYouDo();
            System.out.println("----------");
        }
    }
}
