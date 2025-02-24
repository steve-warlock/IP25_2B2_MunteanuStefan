package com.lab1;// Spital -- OOP
// Angajati - Interfata -> Doctori
// Helperi - Abstracta -> Asistente, Infirmiere
// Polimorfism functiile de Angajati sau Helperi


public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor e1 = new Doctor();
        e1.SetIdStaff(1);
        Doctor e2 = new Doctor();
        e2.SetIdStaff(2);
        Assistant a1 = new Assistant();
        a1.SetIdStaff(3);
        Assistant a2 = new Assistant();
        a2.SetIdStaff(4);
        Nurse n1 = new Nurse();
        n1.SetIdStaff(5);
        hospital.AddEmployee(e1);
        hospital.AddEmployee(e2);
        hospital.AddEmployee(a1);
        hospital.AddEmployee(a2);
        hospital.AddEmployee(n1);

        hospital.PrintStaff();

        Patient p1 = new Patient();
        p1.SetPatient(1);
        p1.SetPatient(101, 1);

        Patient p2 = new Patient();
        p2.SetPatient(2);
        p2.SetPatient(201, 2);

        Patient p3 = new Patient();
        p3.SetPatient(3);
        p3.SetPatient(301, 3);
        e1.AddPatient(p1);
        e1.AddPatient(p2);
        e2.AddPatient(p3);

        e1.PrintPatients();

        e2.PrintPatients();

        ChiefDepartment manager = new ChiefDepartment();
        manager.SetId(100);
        manager.AddDoctor(e1);
        manager.AddDoctor(e2);
        manager.PrintTeamMembers();
    }
}