package pckg_calculator;

public class Divide implements Operation{
    @Override
    public float performOperation(int a, int b) {
        if(b == 0){
            System.out.println("Cannot divide by 0.");
            return -1;
        }else{
            return a/b;
        }

    }
}
