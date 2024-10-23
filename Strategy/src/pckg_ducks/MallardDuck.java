package pckg_ducks;

public class MallardDuck extends Duck {
//    public MallardDuck() {
//        flyBehaviour = new FlyWithWings();
//        quackBehaviour = new QuackLoud();
//    }

    public void display() {
        System.out.println("Display duck: " + getClass().getSimpleName());
    }

    @Override
    protected void swim() {
        System.out.println("I can swim");
    }
}
