package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {

        List<Integer> list11 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        MultiListCLS<Integer> list1 = new MultiListCLS<>(list11);
        list1.compareTwoLists(list2);
    }
}
