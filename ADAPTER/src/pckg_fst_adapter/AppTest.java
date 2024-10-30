package pckg_fst_adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppTest {

    public static void main(String[] args) {
        String[] strings = {"q", "e", "w", "r", "t", "y"};
        ArrayList<String> stringList = new ArrayList<>();
        stringList.addAll(List.of(strings));

        Client<String> client = new Client<>(stringList.iterator());
        //client.someInfo();
        client.removeFetchedElement();
        System.out.println("After removal");
        client.someInfo();
    }
}
