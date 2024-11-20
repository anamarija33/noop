package pckg_macro;

import java.util.ArrayList;

public class MacroTest {
    public static void main(String[] args) {

        GarageDoorOpen garageDoorOpen = new GarageDoorOpen();
        GarageLightOn garageLightOn = new GarageLightOn();
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(garageDoorOpen);
        commands.add(garageLightOn);
        MacroCmdFST macroCmdFST = new MacroCmdFST(commands);
        macroCmdFST.run();
        macroCmdFST.undo();

        Controller controller = new Controller();
        controller.setCommand(macroCmdFST);
        controller.pressOnButton();
        controller.pressReverseActionCommand();
    }
}
