package pckg_guifactory;

public class MACFactory implements GUIFactory{
    private Button button;
    private ComboBox comboBox;
    private Checkbox checkbox;
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MACCheckbox();
    }

    @Override
    public ComboBox createComboBox() {
        return new MACCombobox();
    }

    @Override
    public void createGUI(){
        button = createButton();
        comboBox = createComboBox();
        checkbox = createCheckbox();

        System.out.println("GUI created: "+getClass().getSimpleName());

    }
}
