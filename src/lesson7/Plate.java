package lesson7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food=food;
    }
    public boolean eatenFood(int n){
        int diff=food-n;
        if(diff<0) return false;

        food-=n;  return true;
    }
    public void addFood(int food){
        this.food+=food;
    }
    public void info()
    {
        System.out.println("Plate :" + food);
    }
}
