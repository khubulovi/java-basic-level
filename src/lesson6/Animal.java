package lesson6;

public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected double jumpLimit;
    protected int swimLimit;

    public Animal(String name,int runLimit,double jumpLimit,int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    public abstract boolean run(int lenght);
    public abstract boolean swim(int lenght);
    public abstract boolean jump(double height);


}


