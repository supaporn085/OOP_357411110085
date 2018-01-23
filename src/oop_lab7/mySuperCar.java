package oop_lab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar supercer1 = new SuperCar();
        supercer1 = inputdata(supercer1);
        System.out.println(supercer1.toString());
    }//main


    private static SuperCar inputdata(SuperCar supercer1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your supercar data: ");
        System.out.print("car Brand: ");
        supercer1.setBrand(scanner.nextLine());
        System.out.print("car color: ");
        supercer1.setColor(scanner.nextLine());
        System.out.print("car engine size: ");
        supercer1.setSize(scanner.nextLine());
        System.out.print("car max speed: ");
        supercer1.setSpeed(scanner.nextLine());
        System.out.print("car country of origin: ");
        supercer1.setCountry(scanner.nextLine());

        return supercer1;
    }
}
