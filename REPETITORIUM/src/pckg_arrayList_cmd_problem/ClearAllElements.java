package pckg_arrayList_cmd_problem;


import java.util.ArrayList;

public class ClearAllElements<E> implements CommandOnList<E>{
    private ArrayList<E> list;
    private final ArrayList<E> backupList;

    public ClearAllElements(ArrayList<E> list) {
        this.backupList =new ArrayList<>();
        this.list = list;
    }

    @Override
    public void runCommand() {
        if (list.isEmpty()) {
            System.out.println("\nList is empty, nothing to clear from list!");
        }else{
            backupList.addAll(list);
            list.clear();
            System.out.println("\nList cleared!");
        }
    }

    @Override
    public void undoCommand() {
        if (backupList.isEmpty()) {
            System.out.println("\nNothing to undo!");
        }else{
            list.addAll(backupList);
            backupList.clear();
            System.out.println("\nList restored!");
        }
    }
    @Override
    public String toString() {
        return "Command class: "+ this.getClass().getSimpleName() + "@"+ Integer.toHexString(this.hashCode());
    }
}
