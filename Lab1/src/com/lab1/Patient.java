package com.lab1;
import java.util.ArrayList;
public class Patient {
    private int idPatient;
    private int roomNumber;
    private ArrayList<Sickness> diseaseChart = new ArrayList<>();
    public void SetPatient(int id) {
        this.idPatient = id;
        this.roomNumber = Integer.MAX_VALUE;
    }

    public void SetPatient(int roomNumber, int id) {
        this.idPatient = id;
        this.roomNumber = roomNumber;
    }

    public int GetPatientId() {
        return this.idPatient;
    }

    public int GetPatientRoomNumber() {
        return this.roomNumber;
    }

    public void AddDisease(Sickness d) {
        this.diseaseChart.add(d);
    }
}
