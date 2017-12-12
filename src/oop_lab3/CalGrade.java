package oop_lab3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args) {
 //       score 0-49 grade F
//            score 50-59 grade D
//            score 60-69 grade C
//            score 70-79 grade B
//            score 80-100 grade A
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your88 score :");
        int score = scanner.nextInt();

        if (score>=80){
            System.out.println("Your grade A");
        }else if (score>=70){
            System.out.println("Your grade B");
        }else if (score>=60){
            System.out.println("Your grade C");
        }else if (score>=50){
            System.out.println("Your grade D");
        }else {
            System.out.println("Your grade F");
        }

}//main

}//class
