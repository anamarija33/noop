package pckg_exercise;

public interface ComicReader {
    // metoda za skok na željenu stranicu
    void goToPage(int numpage) throws PageOutOfRange;
    // metoda za prelazak na sljedeću stranicu
    void next();
    // meoda koja daje trenutnu stranicu
    int currentPage();
    // metoda za prelazak na prethodnu stranicu
    void previous();
    // metoda koja omogućuje direknti prijelaz na posljednju stranicu stirpa
    void last();
    // metoda koja omogućuje direktni prijelaz na prvu stranicu stripa
    void first();
    // metoda koja omogućuje zoom in i zoom out u min i max granicama
    void zoom(int percent);
    // metoda koja uključuje/isključuje mod za noćno čitanje
    void nightReadingMode(boolean status);

    void changeBrightness(int value);

}
