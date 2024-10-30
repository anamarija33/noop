package pckg_gui_calculator;

import pckg_calculator.Calculation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFrame extends JFrame {
    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    List <CalculationFormData> calculations;
    public MainFrame(){
        super("Simple Calculator");
        calculations = new ArrayList<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 580);
        setVisible(true);

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
                calculations.add(calculationFormData);
            }
        });
        toolBar.setListener(new ToolBarListener() {

            @Override
            public void toolBarEventOccurred(String action) {
                switch (action) {
                    case "Save txt":
                        SaveToTextFile saveToTextFile = new SaveToTextFile();
                        List<String> textFromViewPanel = Arrays.asList(viewPanel.getTextArea());
                        saveToTextFile.saveDataToFile("STRATEGY_PATTERN/src/pckg_gui_calculator/TextAreaAsText.txt", textFromViewPanel);
                        break;
                    case "Load txt":
                        LoadDataFromTextFile loadDataFromTextFile = new LoadDataFromTextFile();
                        List<String> dataFromViewPanel = new ArrayList<>();
                        loadDataFromTextFile.LoadDataFromFile("STRATEGY_PATTERN/src/pckg_gui_calculator/TextAreaAsText.txt",dataFromViewPanel);
                        viewPanel.appendText(dataFromViewPanel.toString());
                        break;
                    case "Save bin":
                        SaveToBinFile saveToBinFile = new SaveToBinFile();
                        saveToBinFile.saveDataToFile("STRATEGY_PATTERN/src/pckg_gui_calculator/TextAreaAsBin.bin",calculations);

                        break;
                    case "Load bin":
                        calculations.clear();
                        LoadDataFromBinFile loadDataFromBinFile = new LoadDataFromBinFile();
                        loadDataFromBinFile.LoadDataFromFile("STRATEGY_PATTERN/src/pckg_gui_calculator/TextAreaAsBin.bin",calculations);
                        viewPanel.clearTextArea();
                        viewPanel.appendText(calculations.toString());
                        break;
                    case "Clear all":
                        System.out.println("Cleared");
                        viewPanel.clearTextArea();
                        break;

                }
            }
        });
    }


}
