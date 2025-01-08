package pckg_guifactory;

public class MACButton implements Button {
    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
