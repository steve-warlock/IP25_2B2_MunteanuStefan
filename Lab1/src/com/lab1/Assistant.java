package com.lab1;

public class Assistant extends Employee {
    private int idStaff;

    public void SetIdStaff(int id) {
        this.idStaff = id;
    }
    public void GetIdStaff() {
        System.out.println(idStaff);
    }

    public void Work() {
        System.out.println("I am a assistant!");
    }

    @Override
    public void WhatDoYouDo() {
        System.out.println("I do what the doctor says!");
    }
}
