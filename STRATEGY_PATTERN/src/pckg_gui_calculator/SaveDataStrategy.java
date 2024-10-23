package pckg_gui_calculator;

import java.util.List;

public interface SaveDataStrategy<E> {
    void saveDataToFile(String filePath, List<E> data);
}
