package pckg_guifactory;

public class WINCheckbox implements Checkbox{

    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
