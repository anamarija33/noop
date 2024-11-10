package pckg_exercise;

public interface BookReader {

    void viewPage(int numpage) throws PageOutOfRange;

    void nextPage();

    void previousPage();

    int currentPage();

    void goToLastPage();

    void goToFirstPage();

    void zoom(int percentage);


}
