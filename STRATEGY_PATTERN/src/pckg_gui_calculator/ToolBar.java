package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {

    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;

    public ToolBar() {
        initComps();
        layoutComps();
        activateToolbar();

    }

    private void activateToolbar() {
    }

    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsText);
        add(saveObjects);
        add(loadText);
        add(loadObjects);
        add(clearAll);
    }

    private void initComps() {
        this.saveAsText = new JButton("Save txt");
        this.saveObjects = new JButton("Save bin");
        this.loadText = new JButton("Load txt");
        this.loadObjects = new JButton("Load bin");
        this.clearAll = new JButton("Clear all");
    }


}
