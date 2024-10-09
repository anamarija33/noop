package pckg_intro;

import java.util.HashMap;

public class AppTest {
    public static void main(String[] args) {
        HashMap<Integer, String> mapIntStr = new HashMap<>();
        mapIntStr.put(1, "One");
        mapIntStr.put(2, "Two");
        HashMap<User, String> mapUserStr = new HashMap<>();
        mapUserStr.put(new User("User1"), "One");
        mapUserStr.put(new User("User2"), "Two");
        AUX_CLS.listMapElements(mapIntStr);
        AUX_CLS.listMapElements(mapUserStr);
    }
}
