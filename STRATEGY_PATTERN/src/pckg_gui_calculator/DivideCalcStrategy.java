package pckg_gui_calculator;

public class DivideCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculations(double fstNum, double sndNum) {
        if(sndNum == 0){
            System.out.println("Division with zero is not allowed!");
            throw new ArithmeticException("Division with zero!");
        }else{
            return fstNum / sndNum;
        }
    }

    @Override
    public String toString() {
        return "DivideCalcStrategy";
    }
}
