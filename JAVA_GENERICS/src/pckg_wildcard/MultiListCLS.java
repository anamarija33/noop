package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS <E>{
    private final List<E> someList;

    public MultiListCLS(){
        this.someList = new ArrayList<>();
    }

    public MultiListCLS(List<E> someList){
        this.someList = someList;
    }

    public void listAllElements() {
        if (someList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (E element : someList) {
                System.out.println(element);
            }
        }
    }

    public void compareTwoLists(List<?> list1){
        System.out.println(this.someList.size()-list1.size());
    }


}
