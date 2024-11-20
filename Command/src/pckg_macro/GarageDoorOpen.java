package pckg_macro;

public class GarageDoorOpen implements Command {

    @Override
    public void run() {
        System.out.println("Opening garage doors");
    }

    @Override
    public void undo() {
        System.out.println("Closing garage doors");
    }
}
