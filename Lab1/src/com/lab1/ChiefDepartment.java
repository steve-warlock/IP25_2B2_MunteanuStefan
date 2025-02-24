package com.lab1;

import java.util.ArrayList;

public class ChiefDepartment extends Employee {

    private int idStaff;
    private ArrayList<Doctor> teamMember = new ArrayList<>();

    public void SetId(int id) {
        this.idStaff = id;
    }

    public void GetIdStaff() {
        System.out.println(idStaff);
    }

    public void Work() {
        System.out.println("I am a Chief Department");
    }

    @Override
    public void WhatDoYouDo() {
        System.out.println("I coordinate a team of Doctors");
    }

    public void AddDoctor(Doctor d) {
        this.teamMember.add(d);
    }

    public void PrintTeamMembers() {
        System.out.println("My team consists of these doctors: ");
        for(Doctor d: this.teamMember) {
            d.GetIdStaff();
        }
        System.out.println("--------");
    }

}
