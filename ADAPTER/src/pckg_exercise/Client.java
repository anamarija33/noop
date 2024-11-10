package pckg_exercise;

public class Client {
    private ComicReader comicReader;

    public Client() {
        System.out.println("Some client that expects ComicReader");
    }

    public void setComicReader(ComicReader comicReader) {
        this.comicReader = comicReader;
    }


    public void skipToNextPage() {
        comicReader.next();
    }

    public void skipToPage(int page) {
        try {
            comicReader.goToPage(page);
        } catch (PageOutOfRange e) {
            System.out.println(e.getMessage());
        }
    }

    public void skipToPreviousPage() {
        comicReader.previous();
    }

    public void skipToLastPage() {
        comicReader.last();
    }

    public void skipToFirstPage() {
        comicReader.first();
    }

    public void setZoom(int percent) {
        comicReader.zoom(percent);
    }

    public void turnNightReadingModeON() {
        comicReader.nightReadingMode(true);
    }

    public void turnNightReadingModeOFF() {
        comicReader.nightReadingMode(false);
    }

    public void giveMeCurrentPage() {
        System.out.println("Current page:"+comicReader.currentPage());
    }


}
