package pckg_exercise;

public class FSTBookReader implements BookReader{

    private Book book;
    private int currentPage;
    private int totalPages;
    private int zoom;
    private static final int MAXP = 150;
    private static final int MINP = 50;

    public FSTBookReader(){
        System.out.println("Book reader ready for book reading");
    }


    public void setBook(Book book) {
        this.book = book;
        this.currentPage = 1;
        this.totalPages = book.getTotalPages();
        this.zoom = 100;

        System.out.println("Reading: ");
        System.out.println(book);
        System.out.println("_______________________");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "FSTBookReader{" +
                "currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", zoom=" + zoom +
                '}';
    }

    @Override
    public void viewPage(int numpage) throws PageOutOfRange{
        if (book != null) {
            if(numpage < 1 || numpage > book.getTotalPages()){
                throw new PageOutOfRange();
            }
            this.currentPage = numpage;
            System.out.printf("You are on page: %d\n", currentPage);
        }
    }

    @Override
    public void nextPage() {
        if (book != null) {

            if(currentPage < totalPages){
                currentPage++;
                System.out.printf("You are on page: %d\n", currentPage);
            } else{
                System.out.println("You are on the last page");
            }

        }
    }

    @Override
    public void previousPage() {
        if (book != null) {
            if(currentPage > 1){
                currentPage--;
                System.out.printf("You are on page: %d\n", currentPage);
            } else{
                System.out.println("You are on the first page");
            }
        }
    }

    @Override
    public int currentPage() {
        return this.currentPage;
    }

    @Override
    public void goToLastPage() {
        if (book != null) {
            currentPage = totalPages;
            System.out.printf("You are on page: %d\n", currentPage);
        }
    }

    @Override
    public void goToFirstPage() {
        if(book != null){
            currentPage = 1;
            System.out.printf("You are on page: %d\n", currentPage);
        }
    }

    @Override
    public void zoom(int percentage) {
        if (book != null) {
            if(percentage > MAXP){
                System.out.println("Zoom level too high");
            } else if(percentage < MINP){
                System.out.println("Zoom level too low");
            } else{
                this.zoom = percentage;
                System.out.printf("Zoom level set to %d\n", percentage);
            }
        }
    }
}
