package pckg_intro;

public class User {
    private int id;
    private static int cntID=100;
    private String name;

    public User(String name) {
        this.id = cntID++;
        this.name = name;
    }

    public User(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "User id=" + id + ", name=" + name ;
    }




}
