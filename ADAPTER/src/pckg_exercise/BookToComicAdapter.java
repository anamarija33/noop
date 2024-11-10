package pckg_exercise;

public class BookToComicAdapter implements ComicReader{
    BookReader bookReader ;
    public BookToComicAdapter(BookReader book) {
        this.bookReader = book;
    }
    @Override
    public void goToPage(int numpage) throws PageOutOfRange {
        bookReader.viewPage(numpage);
    }

    @Override
    public void next() {
        bookReader.nextPage();
    }

    @Override
    public int currentPage() {
        return bookReader.currentPage();
    }

    @Override
    public void previous() {
        bookReader.previousPage();
    }

    @Override
    public void last() {
        bookReader.goToLastPage();
    }

    @Override
    public void first() {
        bookReader.goToFirstPage();
    }

    @Override
    public void zoom(int percent) {
        bookReader.zoom(percent);
    }

    @Override
    public void nightReadingMode(boolean status) {
        System.out.println("Night reading mode is not supported for books");
    }

    @Override
    public void changeBrightness(int value) {

    }
}