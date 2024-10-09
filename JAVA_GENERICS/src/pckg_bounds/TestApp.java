package pckg_bounds;

public class TestApp {
    public static void main(String[] args) {
        Integer [] ints = {1, 2, 3, 4, 5};
        Integer [] ints2 = {6, 7, 8, 9, 10};
        User [] users = {new BestUser("BestUser1"), new NewUser("NewUser2"), new User("User3")};
        SimpleClass<User> userSimpleClass = new SimpleClass<>(users);
        userSimpleClass.performSomething();
        BestUser[] bestUsers = {new BestUser("BestUser1"), new BestUser("BestUser2")};
        SimpleClass<BestUser> bestUserSimpleClass2 = new SimpleClass<>(bestUsers);
        bestUserSimpleClass2.performSomething();
    }
}
