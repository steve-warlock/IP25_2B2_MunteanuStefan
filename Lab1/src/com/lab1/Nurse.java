package com.lab1;

public class Nurse extends Employee {
    private int idStaff;

    public void SetIdStaff(int id) {
        this.idStaff = id;
    }
    public void GetIdStaff() {
        System.out.println(idStaff);
    }

    public void Work() {
        System.out.println("I am a nurse!");
    }

    @Override
    public void WhatDoYouDo() {
        System.out.println("I supervise the patients!");
    }
}
