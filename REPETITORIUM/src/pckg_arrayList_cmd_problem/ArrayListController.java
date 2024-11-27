package pckg_arrayList_cmd_problem;

import java.util.Stack;

public class ArrayListController {
    private Stack<CommandOnList> undoStack;
    private Stack<CommandOnList> redoStack;
    private CommandOnList currentCommand;

    public ArrayListController(){
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCommand(CommandOnList cmd) {
        this.currentCommand = cmd;
    }

    public void runCommand(){
        if(currentCommand != null){
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();

        }else{
            System.out.println("Set some command on list!");
        }
    }

    public void undoCommand() {
        if(undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
        }else {
            CommandOnList cmd = undoStack.pop();
            cmd.undoCommand();
            redoStack.push(cmd);
            listUndoStack();
            listRedoStack();
        }
    }

    public void redoCommand() {
        if(redoStack.isEmpty()) {
            System.out.println("Nothing to redo!");
        }else {
            CommandOnList cmd = redoStack.pop();
            cmd.runCommand();
            undoStack.push(cmd);
            listUndoStack();
            listRedoStack();

        }
    }

    private void listUndoStack() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to list from undo stack!");
        } else {
            System.out.println("\n======================================= Undo Stack =======================================");
            for (CommandOnList cmd : undoStack) {
                System.out.println(cmd);
            }
        }
    }

    private void listRedoStack() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to list from redo stack!");
        } else {
            System.out.println("\n======================================= Redo Stack =======================================");
            for (CommandOnList cmd : redoStack) {
                System.out.println(cmd);
            }
        }
    }



}
