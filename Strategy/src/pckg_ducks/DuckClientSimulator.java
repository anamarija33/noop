package pckg_ducks;

public class DuckClientSimulator {
    private Duck duck;

    public DuckClientSimulator() {
        this.duck = new RubberDuck();
        duck.setFlyable(new FlyWithRocket());
    duck.setQuackable(new QuackLoud());
    }

    public Duck getDuck(){
        return duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "Client{" +
                "duck=" + duck +
                '}';
    }

    public void startSimulation() {
        System.out.println("Starting simulation for: "+ duck.getClass().getSimpleName());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }
}
