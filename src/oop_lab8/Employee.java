package oop_lab8;

public class Employee extends Person {
    private String employeeID;
    private String position;
    private String salsry;

    public Employee(String personID, String name, String gender, int age, String employeeID, String position, String salsry) {
        super(personID, name, gender, age);
        this.employeeID = employeeID;
        this.position = position;
        this.salsry = salsry;
    }

    public Employee(String personID, String name, String gender, int age) {
        super(personID, name, gender, age);
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalsry() {
        return salsry;
    }

    public void setSalsry(String salsry) {
        this.salsry = salsry;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", position='" + position + '\'' +
                ", salsry='" + salsry + '\'' +
                "} " + super.toString();
    }
}//class
