package oop_lab8;

public class Cat extends Pet {
    private String breed;

    @Override
    public void makeNoise() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }
}
