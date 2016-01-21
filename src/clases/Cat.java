package clases;

public class Cat {

    int age;
    String name;
    String cat_model;

    void mEWW(){
        System.out.println("Mewwww");
    }

    @Override
    public String toString() {
        return "clases.Cat: " + name + " : cat_model - " + cat_model +" - " +age;
    }
}
