package pckg_gui_calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    private JTextField fstNumField;
    private JTextField sndNumField;
    private JTextField resultField;
    private JComboBox<CalculationStrategy> operationBox;
    private JButton confirmButton;


    public FormPanel() {
        Dimension dims = this.getPreferredSize();
        dims.height = 220;
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Calculation panel:");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        initComps();
        layoutComps();
        activateFormPanel();
    }

    private void initComps() {
        fstNumField = new JTextField(10);
        sndNumField = new JTextField(10);
        resultField = new JTextField(10);
        operationBox = new JComboBox<>();

        DefaultComboBoxModel<CalculationStrategy> operationModel = new DefaultComboBoxModel<>();
        operationModel.addElement(new AddCalcStrategy());
        operationModel.addElement(new SubtractStrategy());
        operationModel.addElement(new MultiplyStrategy());
        operationModel.addElement(new DivideCalcStrategy());
        operationBox.setModel(operationModel);
        operationBox.setSelectedIndex(-1);

        confirmButton = new JButton("Calculate");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("First Number: "), gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(fstNumField, gc);

        gc.gridx = 0;
        gc.gridy ++;
        add(Box.createVerticalStrut(15), gc);

        gc.gridy++;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Second Number: "), gc);

        gc.gridx ++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sndNumField, gc);

        gc.gridx++;
        add(Box.createHorizontalStrut(25), gc);

        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Choose operation: "), gc);

        gc.gridx ++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(operationBox, gc);

        gc.gridx = 0;
        gc.gridy++;

        add(Box.createVerticalStrut(20), gc);
        gc.gridy++;
        add(confirmButton, gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Result: "), gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(resultField, gc);
    }

    private void activateFormPanel() {

    }
}
