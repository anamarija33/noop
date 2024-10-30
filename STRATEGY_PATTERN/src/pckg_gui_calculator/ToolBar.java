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
    private ToolbarListener toolbarListener;

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
        if (ae.getSource() == saveAsText) {
            System.out.println("Clicked: " + saveAsText.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(saveAsText.getActionCommand());
            }
        }
        if(ae.getSource() == saveObjects) {
            System.out.println("Clicked: " + saveObjects.getActionCommand());
        }
        if (ae.getSource() == loadText) {
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(loadText.getActionCommand());
            }
        }
        if (ae.getSource() == loadObjects) {
            System.out.println("Clicked: " + loadObjects.getActionCommand());
        }
       if (ae.getSource() == clearAll) {
            System.out.println("Clicked: " + clearAll.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(clearAll.getActionCommand());
            }
        }

    }

    public void setToolbarListener(ToolbarListener toolbarListener) {
        this.toolbarListener = toolbarListener;
    }
}
