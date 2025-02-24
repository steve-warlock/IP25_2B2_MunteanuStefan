package com.lab1;
import java.util.ArrayList;


public class Doctor extends Employee {
    private int idStaff;
    private final ArrayList<Patient> patients = new ArrayList<>();
    public void SetIdStaff(int id) {
        this.idStaff = id;
    }
    public void GetIdStaff() {
        System.out.println(idStaff);
    }

    public void Work() {
        System.out.println("I am a doctor!");
    }
    @Override
    public void WhatDoYouDo() {
        System.out.println("I treat patients!");
    }

    public void AddPatient(Patient p) {
        this.patients.add(p);
    }

    public void PrintPatients() {
        System.out.println("Patient(s) of the doctor: " + this.idStaff);
        for(Patient p: patients) {
            System.out.println("PatientInfo: " + "id: " + p.GetPatientId() + " room Number: " + p.GetPatientRoomNumber());
        }
    }

}
