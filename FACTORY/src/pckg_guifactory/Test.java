package pckg_guifactory;

public class Test {
    public static void main(String[] args) {
        Application app = new Application(new WINFactory());
        app.performSomethingForUser();

        Application app2 = new Application(new MACFactory());
        app2.performSomethingForUser();
    }
}
