package animal;

public class Human extends Animal implements Thinkable {

    private String hobby;

    public Human(String animalname,int age,String hobby) {

        super(animalname,age);
        this.hobby=hobby;
    }

    @Override
    public void think() {

        System.out.println("私は"+hobby+"について考えています。");


    }

}
