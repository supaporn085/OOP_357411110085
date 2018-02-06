package oop_lab9;

public class Person {
    private String personID;
    private String name;
    private Address Address;
    private Job Job;

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", Address=" + Address +
                ", Job=" + Job +
                '}';
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public oop_lab9.Address getAddress() {
        return Address;
    }

    public void setAddress(oop_lab9.Address address) {
        Address = address;
    }

    public oop_lab9.Job getJob() {
        return Job;
    }

    public void setJob(oop_lab9.Job job) {
        Job = job;
    }

    public Person(String personID, String name, oop_lab9.Address address, oop_lab9.Job job) {
        this.personID = personID;
        this.name = name;
        Address = address;
        Job = job;
    }
}
