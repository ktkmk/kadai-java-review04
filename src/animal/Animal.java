package animal;

public class Animal {

    private String animalname;
    private int age;

    public Animal(String animalname,int age) {

        this.animalname=animalname;
        this.age=age;
    }

    public void say() {

        System.out.println(animalname+"です。"+age+"歳です。");
    }


}
