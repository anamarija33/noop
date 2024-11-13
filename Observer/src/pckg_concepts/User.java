package pckg_concepts;

public class User implements ServiceSignIn{

    private int id;
    private static int cntID = 10;
    private String userName;

    public User(String userName) {
        this.id = cntID++;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public void provideSignInInfo(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);

    }

    public void performSomeAction() {
        System.out.println("performing action");
    }
}
