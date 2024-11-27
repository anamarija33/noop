package pckg_arrayList_cmd_problem;

import java.util.ArrayList;

public class AddNewElementToList<E> implements CommandOnList<E>{
    private ArrayList<E> list;
    private E element;

    public AddNewElementToList(ArrayList<E> list, E element){
        this.list = list;
        this.element = element;
    }

    @Override
    public void runCommand() {
        if (element == null) {
            System.out.println("\nCannot add null element to the list");
        }else if (list.contains(element)){
            System.out.println("\nElement already exists in the list");
        }else{
            list.add(element);
            System.out.println("Element added to the list"+ element.getClass().getSimpleName());
        }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)){
            list.remove(element);
            System.out.println("Element removed from the list"+ element.getClass().getSimpleName());
        }else{
            System.out.println("Element not found in the list");
        }
    }

    @Override
    public String toString() {
        return "Command class: "+ this.getClass().getSimpleName() + "@"+ Integer.toHexString(this.hashCode());
    }
}
