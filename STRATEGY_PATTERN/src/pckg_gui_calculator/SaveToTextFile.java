package pckg_gui_calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToTextFile implements SaveDataStrategy {
    @Override
    public <E> void saveDataToFile(String filePath, java.util.List<E> data) {
        File newFile = new File(filePath);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
            for (E e : data) {
                bw.write((String)e);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
