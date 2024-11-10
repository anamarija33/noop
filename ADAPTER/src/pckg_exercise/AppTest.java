package pckg_exercise;

public class AppTest {
    public static void main(String[] args) {
        Comic comic = new Comic ("Spiderman", "Stan Lee", 100);
        SimpleComicReader simpleComicReader = new SimpleComicReader();
        simpleComicReader.setComic(comic);
        Client client = new Client();
        client.setComicReader(simpleComicReader);
        client.giveMeCurrentPage();
        client.skipToNextPage();
        client.giveMeCurrentPage();
        client.skipToPage(101);
        client.skipToPage(50);
        client.skipToPreviousPage();
        client.turnNightReadingModeON();



        Book book = new Book ("Harry Potter", "J.K. Rowling", 200);
        FSTBookReader fstBookReader = new FSTBookReader();
        fstBookReader.setBook(book);
        BookToComicAdapter bookToComicAdapter = new BookToComicAdapter(fstBookReader);
        client.setComicReader(bookToComicAdapter);
        client.turnNightReadingModeOFF();



    }
}
