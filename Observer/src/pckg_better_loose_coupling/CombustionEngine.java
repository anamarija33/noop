package pckg_better_loose_coupling;

public class CombustionEngine implements Engine{

        @Override
        public void start() {
            System.out.println("Starting : "+getClass().getSimpleName()+" Engine");
        }

    @Override
    public void stop() {
        System.out.println("Stopping : "+getClass().getSimpleName()+" Engine");
    }
}
