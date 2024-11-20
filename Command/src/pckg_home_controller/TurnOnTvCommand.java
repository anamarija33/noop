package pckg_home_controller;

public class TurnOnTvCommand implements Command{
    private final TV tv;
    public TurnOnTvCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void runCmd() {
        tv.turnOn();
    }

    @Override
    public void undoCmd() {
        tv.turnOff();
    }
}
