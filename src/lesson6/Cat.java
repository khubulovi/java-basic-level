package lesson6;

public class Cat  extends Animal{
    public Cat(String name,int runLimit,double jumpLimit){
        super(name,runLimit,0,jumpLimit);
    }

    @Override
    public boolean run(int lenght) {
        return lenght<=runLimit;
    }
    @Override
    public boolean swim(int lenght) {
        return false;
    }

    @Override
    public boolean jump(double height) {
        return height<=jumpLimit;
    }
}
