package oop_lab8;

public class Personlnfo {
    public static void main(String[] args) {
        Student student = new Student( "1809900651821",
                "may supaporn",
                "Male",22,
                "357411110085",
                "IS :Management Technolgy");
        System.out.println(student.toString());
        System.out.println(student.getName());

        Employee employee = new Employee( "1809900651821",
                "may:supaporn","Male",
                22,
                "357411110085", "may",
                "085");
        System.out.println(employee.toString());
        System.out.println(employee.getName());
}//class
}

