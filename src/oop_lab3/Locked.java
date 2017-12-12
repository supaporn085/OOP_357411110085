package oop_lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import  java.util.Scanner;

public class Locked {
    public static void main(String[] args) throws IOException {
        String PIN = "1234",input;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.print("Enter PIN: ");
        input = scanner.nextLine();
        if (PIN.equals(input)) {
            System.out.print(" Welcome: ");
            break;
        }else {
            count++;
            if (count== 3) {
                System.out.println("Locked.");
                break;
            }
        }

    }while (count <=3);

  }//main
}//class