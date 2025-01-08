package pckg_guifactory;

public class WINButton implements Button{

    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
