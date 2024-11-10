package pckg_fst_adapter;

import java.util.*;


public class AppTest {

    public static void main(String[] args) {
//        String[] strings = {"q", "e", "w", "r", "t", "y"};
//        ArrayList<String> stringList = new ArrayList<>();
//        stringList.addAll(List.of(strings));
//
//        Client<String> client = new Client<>(stringList.iterator());
//        //client.someInfo();
//        client.removeFetchedElement();
//        System.out.println("After removal");
//        client.someInfo();


        Enumeration enumString = new StringTokenizer("This is a test");
        AdapterEnumeration<String> adapterEnumeration = new AdapterEnumeration<String>(enumString);
        Client<String> sndClient = new Client<>(adapterEnumeration);
        //sndClient.someInfo();
        sndClient.removeFetchedElement();
        System.out.println("After removal");
        sndClient.someInfo();

    }
}
