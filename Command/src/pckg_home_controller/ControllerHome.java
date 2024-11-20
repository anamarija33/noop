package pckg_home_controller;

import java.util.Stack;

public class ControllerHome {
    private Command command;
    private final Stack<Command> undoStack;
    private final Stack<Command> redostack;

    public ControllerHome() {
        undoStack = new Stack<>();
        redostack = new Stack<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressBtnRunCmd() {
        if (command != null) {
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        } else {
            System.out.println("Please set the command!");
        }
    }

    public void pressBtnUndoCmd() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
        }else {
            command = undoStack.pop();
            command.undoCmd();
            redostack.push(command);
            listRedoStack();
            listUndoStack();
        }
    }

    public void pressBtnRedoCmd() {
        if (redostack.isEmpty()) {
            System.out.println("Nothing to redo!");
        }else{
            command = redostack.pop();
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }
    }

    private void listUndoStack(){
        if(undoStack.isEmpty()) {
            System.out.println("~~~~~~~~~~~Undo stack is empty!~~~~~~~~~~~");
        }else {
            System.out.println("===========Undo stack: ===========");
            for (Command command : undoStack) {
                System.out.println(command);
            }
        }
    }

    private void listRedoStack(){
        if(redostack.isEmpty()) {
            System.out.println("~~~~~~~~~Redo stack is empty!~~~~~~~~~~~");
        }else {
            System.out.println("===========Redo stack: ===========");
            for (Command command : redostack) {
                System.out.println(command);
            }
        }
    }

    public void clearStacks() {
        undoStack.clear();
        redostack.clear();
        command = null;
        System.out.println("stacks are reset to initial state!");
    }
}
