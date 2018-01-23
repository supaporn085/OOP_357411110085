package oop_lab7;


import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //create objects es Stuent
        Studant studant1 = new Studant();

        studant1.setId("11111111111");
        studant1.setMajor("Information System");
        studant1.setFaculty("Managemant Technology");
        studant1.setName("Boy saiyai");

        System.out.println(studant1.toString());

        Studant student2 = new Studant( "222222222222" ,"Management", "Business Management","Girl Songkhla");
        System.out.println(student2.toString());
        student2.setName("Girl Trang");
        System.out.println(student2.toString());


        Studant student3 = new Studant();
       // student3 = inputData(student3);
      //  System.out.println(student3.toString());
        System.out.println(studant1.gender);
        System.out.println(Studant.gender);

    }//main

    private static Studant inputData(Studant s) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter your student data: ");
        System.out.print("name: ");
        s.setName(scanner.nextLine());
        System.out.print("ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Major: ");
        s.setMajor(scanner.nextLine());
        System.out.print("Faculty: ");
        s.setFaculty(scanner.nextLine());

        return s;
    }

}//class
