package pckg_intro;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AppSnd {
    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<User> lst3 = new ArrayList<>();

        lst1.add("String1");
        lst1.add("String2");
        lst1.add("String3");
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst3.add(new User("User1"));
        lst3.add(new User("User2"));
        lst3.add(new User("User3"));

        AUX_CLS.listElements(lst1);
        AUX_CLS.listIntList(lst2);
        AUX_CLS.listUsrList(lst3);


        AUX_CLS.listAllElements(lst1);
        AUX_CLS.listAllElements(lst2);
        AUX_CLS.listAllElements(lst3);



    }
}
