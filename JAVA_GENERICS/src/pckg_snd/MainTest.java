package pckg_snd;

public class MainTest {
    public static void main(String[] args) {


        String fst = "a";
        String snd = "b";
        CompareTWO<String> compareString = new CompareTWO<>(fst, snd);
        compareString.compareTwo();

        Integer f = 11;
        Integer s = 2;
        CompareTWO<Integer> compareInteger = new CompareTWO<>(f, s);
        compareInteger.compareTwo();

        // Ne može se koristiti klasa User sa CompareTWO jer User ne implementira Comparable
        User us1 = new User("Ivana");
        User us2 = new User("Pavelelele");
        CompareTWO<User> compareUser = new CompareTWO<>(us1, us2);
        compareUser.compareTwo();
   }
}