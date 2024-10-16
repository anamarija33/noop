package pckg_wildcard;

import pckg_bounds.User;

import java.util.List;

public class AUX_CLS {
    public static void processNamesInList(List<? extends UserSND> lst) {
        for (UserSND usr : lst) {
            System.out.println("Name is" + usr.getName());
        }
    }

    // ne zadovoljava sve uvjete, nije sigurno da će uvijek biti UserSND
//    public static void addSomeUser(List<? extends UserSND> lst, UserSND usr) {
//        lst.add(usr);
//    }

    // može se dodavatu UserSND i sve njegove roditelje
    public static void addNewUser(List<? super UserSND> users) {
        users.add(new UserSND("John"));

    }

    // T osigurava konzistentnost tipova, ako se koristi UserSND u listi onda se koristi i UserSND element u metodi
    public static <T extends UserSND> void processLisT(List<T> lst, T newElement) {
        for (T element : lst) {
            System.out.println(element.getName());
        }
        lst.add(newElement);
    }



}
