package pckg_wildcard;

import pckg_snd.User;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

            ListCLS<Integer> list1 = new ListCLS<>();
            list1.addNewElement(1);
            list1.addNewElement(2);
            list1.addNewElement(3);
            list1.addNewElement(4);
            list1.addNewElement(5);
            list1.listAllElements();


        List<UserSND> users = new ArrayList<>();
        users.add(new UserSND("John"));
        AnotherList anotherList = new AnotherList();
        anotherList.addNewElements(new UserSND("Pavo"), users);
        anotherList.listAllElements(users);
        

    }
}
