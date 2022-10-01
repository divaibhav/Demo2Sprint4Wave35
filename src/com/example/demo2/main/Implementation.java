package com.example.demo2.main;

import com.example.demo2.data.Address;
import com.example.demo2.data.Manager;

public class Implementation {
    public static void main(String[] args) {
        Address address = new Address(11,"abc","abc","abc", 123);
        Manager manager = new Manager("abc",12,"12",address,5,5);


        System.out.println("manager.getName() = " + manager.getName());
        System.out.println("manager.getAge() = " + manager.getAge());
        System.out.println("manager.getAddress() = " + manager.getAddress());
        System.out.println("manager.getDob() = " + manager.getDob());
        System.out.println("manager.getTeamSize() = " + manager.getTeamSize());
        System.out.println("manager.getTeamRating() = " + manager.getTeamRating());

    }
}
