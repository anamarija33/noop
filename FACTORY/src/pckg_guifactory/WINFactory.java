package pckg_guifactory;

public class WINFactory implements GUIFactory{
    private Button button;
    private ComboBox comboBox;
    private Checkbox checkbox;


    @Override
    public Button createButton() {
        return new WINButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WINCheckbox();
    }

    @Override
    public ComboBox createComboBox() {
        return new WINCombobox();
    }

    public void createGUI(){
        button = createButton();
        comboBox = createComboBox();
        checkbox = createCheckbox();

        System.out.println("GUI created: "+getClass().getSimpleName());

    }
}
