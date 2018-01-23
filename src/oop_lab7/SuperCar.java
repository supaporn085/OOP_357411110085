package oop_lab7;

public class SuperCar {
    @Override
    public String toString() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", speed='" + speed + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    private String brand;
    private String color;
    private String size;
    private String speed;
    private String country;

    public SuperCar(){}

    public SuperCar(String b,String c,String s,String sp,String cou) {
        this.brand = b;
        this.color = c;
        this.size = s;
        this.speed = sp;
        this.country = cou;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}//class
