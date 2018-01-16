package MidTerm;

import jdk.nashorn.internal.parser.Scanner;

public class mid2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       String id = getID();
       String name = getname();
       String Salary = getSalary();
       String OverTime = getOverTime();

}
    private static String getID() {
        System.out.print("Enter employee id: ");
    return scanner.nextLine();
    }
    private static String getname(){
        System.out.print("Enter name: ");
        return scanner.nextLine();
    }
    private static String getSalary(){
        System.out.print("Enter Salary: ");
        return scanner.nextLine();
    }
    private static String getOverTime(){
        System.out.print("Enter OverTime: ");
        return scanner.nextLine();

    }
}
