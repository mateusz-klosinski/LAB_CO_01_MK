package com.company;

public class Main {

    public static void main(String[] args) {
        Class<?> clazz = Main.class;
        Package pacage = clazz.getPackage();

        System.out.println("Nazwa projektu");
        System.out.println(pacage.getName());

        System.out.println("JDK");
        System.out.println(System.getProperty("java.version"));

        System.out.println("JRE");
        System.out.println(System.getProperty("java.runtime.version"));
    }
}
