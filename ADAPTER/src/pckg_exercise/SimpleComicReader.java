package pckg_exercise;

public class SimpleComicReader implements ComicReader{

    private Comic comic;
    private int currentPage;
    private int totalPages;
    private int zoomPercent;
    private boolean nightReading;

    private static final int MAXPERC = 200;
    private static final int MINPERC = 20;


    public SimpleComicReader(){
        System.out.println("Ready to read comics");
        System.out.println("Provide a comic to start reading.");
        nightReading = false;
    }

    public void setComic(Comic comic){
        this.comic = comic;
        this.currentPage = 1;
        this.totalPages = comic.getTotalPages();
        this.zoomPercent = 100;

        System.out.println("Reading: ");
        System.out.println(comic);
        System.out.println("_______________________");
        System.out.println(this);

    }

    @Override
    public void goToPage(int numpage) throws PageOutOfRange {
        if (comic != null) {

            if (numpage < 1 || numpage > totalPages) {
                throw new PageOutOfRange();
            }
            currentPage = numpage;
            System.out.println("You are on page: " + currentPage);
        }
    }

    @Override
    public void next() {

        if (comic != null) {

            if (currentPage < totalPages) {
                currentPage++;
                System.out.println("You are on page: " + currentPage);
            } else{
                System.out.println("You are on the last page");
            }
        }
    }

    @Override
    public int currentPage() {
        return currentPage;
    }

    @Override
    public void previous() {
        if (comic != null) {
            if (currentPage > 1) {
                currentPage--;
                System.out.println("You are on page: " + currentPage);
            } else {
                System.out.println("You are on the first page");
            }
        }
    }

    @Override
    public void last() {
        if (comic != null) {
            currentPage = totalPages;
            System.out.println("You are on page: " + currentPage);
        }
    }

    @Override
    public void first() {
        if (comic != null) {
            currentPage = 1;
            System.out.println("You are on page: " + currentPage);
        }
    }

    @Override
    public void zoom(int percent) {
        if (comic != null) {
            if (percent >= MINPERC && percent <= MAXPERC) {
                this.zoomPercent = percent;
                System.out.println("Zoom is set to: " + zoomPercent + "%");
            } else {
                System.out.println("Zoom is out of range");
            }
        }
    }

    @Override
    public void nightReadingMode(boolean status) {
        if (comic != null) {
            this.nightReading = status;
            System.out.println("Night reading mode status: " + nightReading);
        }
    }

    @Override
    public void changeBrightness(int value) {

    }

    @Override
    public String toString() {
        return "SimpleComicReader{" +
                ", currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", zoomPercent=" + zoomPercent +
                ", nightReading=" + nightReading +
                '}';
    }
}
