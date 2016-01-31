package clases.devpeople;

import clases.devcat.Cat;

public class people {
    public people(String name, String surname, int age, Cat cat) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cat = cat;
    }

    public String name;
    public String surname;
    public int age;

    Cat cat;

    public people() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }


    @Override
    public String toString() {
        return name + " " + " " + surname + " " + age + " " + cat;
    }
}