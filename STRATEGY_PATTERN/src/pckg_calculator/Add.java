package pckg_calculator;

public class Add implements Operation {
    @Override
    public float performOperation(int a, int b) {
        return a + b;
    }
}
