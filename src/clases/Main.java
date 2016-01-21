package clases;

public class Main {

    static Cat cat = new Cat();
    static people mean = new people();


    public static void main (String[] args){

        cat.name="Garfild";
        cat.cat_model="noname";
        cat.age = 2;
        System.out.println(cat.name);
        System.out.println(cat.cat_model);
        System.out.println(cat.age);

        System.out.println(cat);

        mean.name = "Vasya";
        mean.age = 12;
        mean.surname = "Pupkin";

        mean.cat= cat;

        System.out.println(mean);

        cat.mEWW();
        mean.cat.mEWW();
    }
}
