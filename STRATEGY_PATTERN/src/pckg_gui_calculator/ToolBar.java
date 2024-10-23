package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

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
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("Save Text");
        saveObjects.addActionListener(this);
        saveObjects.setActionCommand("Save Objects");
        loadText.addActionListener(this);
        loadText.setActionCommand("Load Text");
        loadObjects.addActionListener(this);
        loadObjects.setActionCommand("Load Objects");
        clearAll.addActionListener(this);
        clearAll.setActionCommand("Clear All");

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


    @Override
    public void actionPerformed(ActionEvent ae) {


    }
}
