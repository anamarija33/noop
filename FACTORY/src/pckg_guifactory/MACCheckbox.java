package pckg_guifactory;

public class MACCheckbox implements Checkbox {
    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
