package oop_lab7;
//Talking about studant?
// 1.studant ID
// 2.Major
// 3.Faculty
// 4.Name

public class Studant {
    @Override
    public String toString() {
        return "Studant{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }//toString

    private String id;
    private String major;
    private String faculty;
    private String name;
    //Constructor
    //Default constructor
    public  Studant(){}
    //create constructor by owner
    private Studant(String id,String m,String f,String n){
        //assign data to class properties

        this.id = id;
        this.faculty = f;
        this.major = m;
        this.name = n;
    }
    //getter and setter methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}//class
