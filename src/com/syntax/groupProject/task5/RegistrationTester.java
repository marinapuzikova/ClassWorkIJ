package com.syntax.groupProject.task5;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration reg = new Registration();
        reg.setEmail("yahoo");
        System.out.println(reg.getEmail("yahoo"));
        reg.setUserName("marina178");
        System.out.println(reg.getUserName());
        reg.setPassword("12376&@@");
        System.out.println(reg.getPassword());

    }
}
