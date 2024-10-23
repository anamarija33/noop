package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ViewPanel viewPanel;
    private FormPanel formPanel;

    public MainFrame(){
        super("Simple Calculator");
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
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void activateMainFrame() {
        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(CalculationFormData calculationFormData) {
                viewPanel.appendText(calculationFormData.toString());
            }
        });
    }


}
