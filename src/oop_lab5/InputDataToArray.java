package oop_lab5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



//1.input Data from user
//2.find summation of data in array
//3.find average value of data in array
//4.find maximum value of data in array
//5.find minimum valule of data in array
//6.Sorting data with Descending Order
//7.Sorting data with Ascending Order



public class InputdataToArray {
    private static final int MAX = 10;

    public static void main(String[] args) {
        Integer num[] = new Integer[MAX];
        num = inputData(num);
        ShowData(num);
        summation(num);
        findMax(num);
        DescendingOrder(num);
        AscendingOrder(num);

    }//main

    private static void AscendingOrder(Integer[] num) {
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println("Ascending Order: ");
        ShowData(num);
    }//Ascendingdrer

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Descending Order: ");
        ShowData(num);
    }//descendingOrder

    private static void findMax(Integer[] num) {
        System.out.println("The maximum value is: "+(Collections.min(Arrays.asList(num))));
        //max value with basic coode
        Integer max = num[0];
        for (int i=0;i<num.length;i++){
            if (max <= num[i]){
                max = num[i];
            }
        }
        System.out.println("The maximum value is: "+max);
    }//findMax

    private static void summation(Integer[] num){
        int total = 0;
        for (int i=0;i<num.length;i++){
            total += num[i];
        }
        System.out.println("\nThe summation of " + "value in array is: "+total);
        System.out.println("The average value " + "in array is: "+total/MAX);
    }

    private static void ShowData(Integer[] num) {
        System.out.println("Data in array: ");
        for (int i=0;i<num.length;i++){
            System.out.print (num[i]+" ");

        }//for
    }

    private static Integer[] inputData(Integer []num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter data to array: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();


        }
        return num;
    }

    private static class integer {
    }
}//class
