package oop_lab9;

public class PersonApp {
    public static void main(String [] args){
        Address address = new Address("18/4","Nakhon Si Thammarat","80000");

        Job job = new Job("studen",50000);

        Person person = new Person("1809900651821","maySupaporm",address,job);
        System.out.println(person.toString());

        person.getJob().setSalary(25000);
        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());
    }
}
