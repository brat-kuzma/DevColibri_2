package clases.devpeople;

import clases.devcat.Cat;

public class Sportsmean extends people {

    private String sporttype;
    private String spotskill;

    private String rachini;

    public String getRachini(String real_raq) {
        return rachini;
    }

    public void setRachini(String rachini) {
        this.rachini = rachini;
    }

    public Sportsmean(String name, String surname, int age, Cat cat) {
        super(name, surname, age, cat);
    }
    public Sportsmean(String sporttype, String sportskill){
        this.sporttype = sporttype;
        this.spotskill = sportskill;
    }


}
