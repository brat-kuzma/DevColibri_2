package clases;

public class people {

     String name;
     String surname;
     int age;

    Cat cat;

    @Override
    public String toString() {
        return name + " " + " " + surname + " " + age + " " + cat;
    }
}