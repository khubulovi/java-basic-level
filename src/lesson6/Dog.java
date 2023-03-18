package lesson6;

public class Dog extends Animal{
    public Dog(String name,int runLimit,double jumpLimit,int swimLimit){
        super(name,runLimit,swimLimit,jumpLimit);
    }
    @Override
    public boolean run(int lenght) {
        return lenght<=run;
    }

    @Override
    public boolean swim(int lenght) {
        return lenght<=sweem;
    }

    @Override
    public boolean jump(double height) {
        return height<=jump;
    }
}

