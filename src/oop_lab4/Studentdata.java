package oop_lab4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Studentdata {
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
  public static String getName() throws IOException {
      System.out.print("Enter your name: ");
      return reader.readLine();
    }//getName
    public static String getAddress() throws IOException {
        System.out.print("Enter your Address: ");
        return reader.readLine();
    }//getAdderss
    public static String getStdID() throws IOException {
        System.out.print("Enter your StdID: ");
        return reader.readLine();
    }//getStdID
    public static String getFaculty() throws IOException {
        System.out.print("Enter your Faculty: ");
        return reader.readLine();
    }//getFaculty
    public static String getEmail() throws IOException {
        System.out.print("Enter your Email: ");
        return reader.readLine();
    }//getEmail

    public static void main(String[] args)throws IOException {
      String name = getName();
      String adderss = getAddress();
      String ID = getStdID();
      String fac = getFaculty();
      String email = getEmail();
      System.out.println(name+"\n"+adderss+"\n"+ID+"\n"+fac+"\n"+email);

    }
}//class
