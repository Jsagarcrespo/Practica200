package org.example.models;

import java.util.List;

public class Doctor {

    private int id;
    private String name, lastname, dni,speciality;
    private double salary;

    private List<Patient> attendedPatients;

    public Doctor(int id, String name, String lastname, String dni, double salary, String speciality) {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.salary = salary;
        this.speciality = speciality;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDni() {
        return dni;
    }

    public double getSalary() {
        return salary;
    }


    public String getSpeciality() {
        return speciality;
    }

    public List<Patient> getAttendedPatients() {
        return attendedPatients;
    }

    public void setAttendedPatients(List<Patient> attendedPatients) {
        this.attendedPatients = attendedPatients;
    }


    @Override
    public String toString() {

        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dni='" + dni + '\'' +
                ", salary=" + salary +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}