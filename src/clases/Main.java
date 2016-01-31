package clases;

import clases.devcat.Cat;
import clases.devpeople.Sportsmean;
import clases.devpeople.people;

public class Main {

    static Cat cat;
    static people mean;


    public static void main (String[] args){

        cat = new Cat(2, "Garfild", "no_name");

        System.out.println(cat);

        mean = new people("Vasya", "Pupkin", 2228, cat);
        System.out.println(mean);

        cat.mEWW();
        mean.getCat().mEWW();


        Sportsmean sportsmean = new Sportsmean("Box", "newbeee");

        sportsmean.getRachini("real_raq");

        //------------------------------------------------------------------ 23 poly
        mean.sayHello();
        sportsmean.sayHello();
    }
}
