package oop_lab3;

public class TestWhileLoop {
    public static void main(String[] args) {
//    while
//        int i = 1;
//        while (i <= 10) {
//            System.out.print(i + " ");
//            i++;
//    }
            int i = 1;
           while (i <= 50){
               System.out.print(i + " ");
               if (i % 10 == 0)
                    System.out.print(i + " Hell ");
                i++;
            }//while
//        do=while
        System.out.println("\n");
            int j=1;
            do {
                System.out.print(j +" ");
                if (j%2 !=0)
                    System.out.print("Hell");
                j++;
            } while (j <=10);

        }
    }