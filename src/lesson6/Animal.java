package lesson6;

public abstract class Animal {
    protected String name;
    protected int run;
    protected double jump;
    protected int sweem;

    public Animal(String name, int run, int sweem, double jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public abstract boolean run(int lenght);
    public abstract boolean swim(int lenght);
    public abstract boolean jump(double height);

    public void amimalInfo() {
        System.out.println("Animal{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", jump=" + jump +
                ", sweem=" + sweem +
                '}');
    }
}


