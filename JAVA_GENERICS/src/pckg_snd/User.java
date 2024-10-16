package pckg_snd;

import java.sql.SQLOutput;

//  Comparable mora imati parametar onaj kojeg želi uspoređivati
public class User implements Comparable<User> {
    private int id;
    private static int cntID = 10;

    private String name;

    public User(String name) {
        this.id = cntID++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

//    @Override
//    public int compareTo(User other) {
//        int res = 0;
//        if(this.id > other.id){
//
//            res = 1;
//        } else if (this.id < other.id) {
//
//            res = -1;
//        } else {
//
//        }
//        return res;
//
//    }


    @Override
    public int compareTo(User o) {
    Integer first = this.name.length();
    Integer other = o.name.length();
    return first.compareTo(other);
    }
}
