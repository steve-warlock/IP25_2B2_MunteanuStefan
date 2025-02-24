package com.lab1;

public class Sickness implements Disease {
    private String type;
    private String treatment;
    @Override
    public void SetType(String type) {
        this.type = type;
    }

    @Override
    public void SetTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String GetType() {
        return this.type;
    }

    public String GetTreatment() {
        return this.treatment;
    }
}
