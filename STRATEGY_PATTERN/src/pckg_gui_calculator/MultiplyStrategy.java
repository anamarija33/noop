package pckg_gui_calculator;

public class MultiplyStrategy implements CalculationStrategy {
    @Override
    public double performCalculations(double fstNum, double sndNum) {
        return fstNum * sndNum;
    }
}
