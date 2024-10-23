package pckg_gui_calculator;

public class AddCalcStrategy implements CalculationStrategy {

    @Override
    public double performCalculations(double fstNum, double sndNum) {
        return fstNum+sndNum;
    }
}
