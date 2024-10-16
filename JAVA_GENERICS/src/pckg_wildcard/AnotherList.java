package pckg_wildcard;
import java.util.List;
public class AnotherList {
    public <E> void addNewElements(E element, List<E> lst) {
        lst.add(element);
        System.out.println("Added new element!");
    }
    public <E> void listAllElements(List<E> lst) {
        if (lst.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (E element : lst) {
                System.out.println(element);
            }
        }
    }
    //? se koristi kada ne znamo tacno tip podataka koji ce biti proslijeđen, i to u metode koje se koriste za READ,
    // ne za WRITE, jer se ne moze dodati nista u listu koja koristi wildcard, tj nema taj parametar koji može biti nepoznat
    // tj public void listelement2(? element, List<?> lst) { } ne moze jer ne znamo tip podataka koji ce biti proslijeđen
    public void listElement2(List<? super UserSND> lst) {
      // ovo je moguće jer ne trebamo znati tip podataka u listi, jer možemo izlistati bilo koju listu  
    }
}
