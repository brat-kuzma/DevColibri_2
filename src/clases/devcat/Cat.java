package clases.devcat;

public class Cat {
    public Cat(int age, String name, String cat_model) {
        this.age = age;
        this.name = name;
        this.cat_model = cat_model;
    }

    private int age;
    private String name;
    private String cat_model;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCat_model() {
        return cat_model;
    }

    public void setCat_model(String cat_model) {
        this.cat_model = cat_model;
    }

    public void mEWW(){
        System.out.println("Mewwww");
    }

    @Override
    public String toString() {
        return "clases.devcat.Cat: " + name + " : cat_model - " + cat_model +" - " +age;
    }
}
