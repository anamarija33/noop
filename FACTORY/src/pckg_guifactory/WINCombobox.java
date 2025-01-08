package pckg_guifactory;

public class WINCombobox implements ComboBox{

    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
