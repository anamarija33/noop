package pckg_guifactory;

public class Application {
    private GUIFactory guiFactory;


    public Application(GUIFactory guiFactory){
        this.guiFactory = guiFactory;
        guiFactory.createGUI();
    }

    public void performSomethingForUser(){
        System.out.println("Performing in gui: "+this.guiFactory.getClass().getSimpleName());

    }

}
