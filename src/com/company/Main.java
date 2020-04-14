package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Autorzy");
        System.out.println(DEV1.author);


        System.out.println("JDK");
        System.out.println(System.getProperty("java.version"));

        System.out.println("JRE");
        System.out.println(System.getProperty("java.runtime.version"));
    }
}
