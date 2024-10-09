package pckg_bounds;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleClass <T extends User>{
    private final List<T> users;

    public SimpleClass() {
        this.users = new ArrayList<>();
    }
    public SimpleClass(T[] arrUsers){
        this.users = Arrays.asList(arrUsers);
    }

    public void performSomething() {
        if (users.isEmpty()) {
            System.out.println("No users to perform something.");
        } else {
            for (T user : users) {
                user.performSomething();
            }
        }
    }
}
