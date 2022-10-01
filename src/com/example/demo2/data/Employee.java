package com.example.demo2.data;

public class Employee {
    private String name;
    private int age;
    private String dob;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(String name, int age, String dob, Address address) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.address = address;
    }
}
