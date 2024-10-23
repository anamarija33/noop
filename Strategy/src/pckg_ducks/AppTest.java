package pckg_ducks;

public class AppTest {
    public static void main(String[] args) {
        DuckClientSimulator client = new DuckClientSimulator();
        client.startSimulation();
        client.setDuck(new MallardDuck());
        client.getDuck().setFlyable(new FlyWithWings());
        client.getDuck().setQuackable(new QuackLoud());
        client.startSimulation();
    }
}
