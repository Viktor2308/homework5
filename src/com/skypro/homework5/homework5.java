package com.skypro.homework5;

public class homework5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Task 1");
        int clientOS = 0; // if "0" - OS = iOS, if "1" - OS = Android
        if(clientOS == 0){
            System.out.println("Install program for iOS - link");
        } else if (clientOS == 1) {
            System.out.println("Install program for Android - link");
        } else {
            System.out.println("Your system not supported");
        }
    }
    public static void task2() {
        System.out.println("\nTask 2");
        int clientOS = 1; // if "0" - OS = iOS, if "1" - OS = Android
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear>=2015) {
            System.out.println("Install program for iOS - link");
        }
        if (clientOS == 0 && clientDeviceYear<2015) {
            System.out.println("Install lite version program for iOS - link");
            }
        if (clientOS == 1 && clientDeviceYear>=2015) {
            System.out.println("Install program for Android - link");
        }
        if (clientOS == 1 && clientDeviceYear<2015) {
            System.out.println("Install lite version program for Android - link");
        }
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Your system not supported");
        }
    }
    public static void task3(){
        System.out.println("\nTask 3");
        int year = 2024;
        boolean leapYear = year%4==0 && year % 100 != 0 || year%400 == 0;
        if (leapYear) {
        System.out.println(year + " year is a leap year.");
        } else {
        System.out.println(year + " year is not a leap year.");
        }
    }
    public static void task4(){
        System.out.println("\nTask 4");
        int deliveryDistance = 95;
        if (deliveryDistance<=20){
            System.out.println("delivery one day");
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("delivery two day");
        } else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("delivery three day");
        } else {
            System.out.println("no delivery");
        }
    }
    public static void task5(){
        System.out.println("\nTask 5");
        int monthNumber = 12;
            switch (monthNumber){
                case 1:
                case 2:
                case 12:
                    System.out.println("winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("autumn");
                    break;
                default:
                    System.out.println("value month entered incorrectly");
        }
    }

}
