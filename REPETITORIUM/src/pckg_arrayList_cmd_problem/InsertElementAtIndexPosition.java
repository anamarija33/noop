package pckg_arrayList_cmd_problem;

import java.util.ArrayList;

public class InsertElementAtIndexPosition<E> implements CommandOnList<E>{
    private ArrayList<E> list;
    private E element;
    private int index;

    public InsertElementAtIndexPosition(ArrayList<E> list, E element, int index){
        this.list = list;
        this.element = element;
        this.index = index;
    }

    @Override
    public void runCommand() {
         if(index>=0 && index<list.size()) {
             if(list.contains(element)) {
                 System.out.println("\nElement already exists in the list");
             }else{
                 list.add(index, element);
                 System.out.println("\nElement added to position: "+index+" | type of element: " + element.getClass().getSimpleName());
             }
        }else{
             throw new IndexOutOfBoundsException("Index out of bounds");
         }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("\nElement removed from the list, type of element: " + element.getClass().getSimpleName());
        }else{
            System.out.println("Nothing to undo!");
        }
    }
    @Override
    public String toString() {
        return "Command class: "+ this.getClass().getSimpleName() + "@"+ Integer.toHexString(this.hashCode());
    }
}
