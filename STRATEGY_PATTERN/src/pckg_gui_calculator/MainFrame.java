package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class MainFrame extends JFrame {
    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    private final List<String> txtData;

    public MainFrame(){
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 580);
        setVisible(true);
        this.txtData = new ArrayList<>();

        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void activateMainFrame() {
        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(CalculationFormData calculationFormData) {
                viewPanel.appendText(calculationFormData.toString());
                txtData.add(calculationFormData.toString());
            }
        });
        toolBar.setToolbarListener(new ToolbarListener() {
            @Override
            public void toolbarEventOccured(String buttonActionString) {
                if (buttonActionString.equals("Save Text")) {
                    SaveToTextFile saveToTextFile = new SaveToTextFile();
                    // napraviti priko JFileChooser-a
                    saveToTextFile.saveDataToFile("data.txt", txtData);
                }
                if(buttonActionString.equals("Load Text")) {
                    LoadTxtStrategy loadTxtStrategy = new LoadTxtStrategy();
                    List<String> data = loadTxtStrategy.loadDataFromFile("data.txt");
                    for(String s : data){
                        viewPanel.appendText(s);
                    }
                    txtData.addAll(data);

                }
                if(buttonActionString.equals("Clear All")){
                    viewPanel.clearTextArea();
                    txtData.clear();
                    JOptionPane.showMessageDialog(MainFrame.this,"List is erased");
                }
            }
        });
    }

}
