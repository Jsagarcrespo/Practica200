package org.example.models;

public class Patient {

    private int id;
    private String name;
    private String lastname;
    private String dni;
    private int age;
    private String phone;
    private String disease;

    private Doctor doctor;

    public Patient(int id, String name, String lastname, String dni, int age, String phone, String disease) {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.age = age;
        this.phone = phone;
        this.disease = disease;
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

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    @Override
    public String toString() {

        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dni='" + dni + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", disease='" + disease + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}