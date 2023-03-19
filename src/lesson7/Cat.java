package lesson7;


public class Cat {
    private String name;
    private int appetite;
    protected boolean hungry;

    public Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        if (plate.eatenFood(appetite)) hungry = false;
    }

    public void catInfo() {
        String isHungry = !hungry ? "Cat isn't hungry" : "Cat's hungry";
        System.out.println(name + " :" + isHungry);
    }
}