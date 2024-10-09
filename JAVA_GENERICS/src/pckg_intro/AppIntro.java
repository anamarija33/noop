package pckg_intro;

import java.util.ArrayList;

public class AppIntro {
    public static void main(String[] args) {
        ArrayList<User> lst = new ArrayList();
        //  ArrayList lst = new ArrayList();
//        lst.add(100);
//        lst.add("something");
//        lst.add(23.45);
//        lst.add(2E11);
        lst.add(new User("Ime2"));
        listElements(lst);
        System.out.println(new User("Ime1"));
        listtElementsFromList(lst);

    }

    private static void listElements(ArrayList lista) {
        int length = lista.size();
        for (int i = 0; i < length; i++) {
            System.out.println("Element : " + lista.get(i));
        }
    }

    private static void listtElementsFromList(ArrayList lst) {
        for(Object user: lst){
            System.out.println(user);
        }
    }
}
