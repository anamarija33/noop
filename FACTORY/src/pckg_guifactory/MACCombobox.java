package pckg_guifactory;

public class MACCombobox implements ComboBox {


    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
