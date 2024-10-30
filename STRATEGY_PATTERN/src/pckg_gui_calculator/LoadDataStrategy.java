package pckg_gui_calculator;

import java.util.List;

public interface LoadDataStrategy<E>{
    void LoadDataFromFile(String filepath, List<E> list);
}
