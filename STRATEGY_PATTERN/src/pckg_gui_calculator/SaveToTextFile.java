package pckg_gui_calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToTextFile implements SaveDataStrategy<String> {

    @Override
    public void saveDataToFile(String filePath, List<String> data) {
        File newFile = new File(filePath);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
            for (String e : data) {
                bw.write(e);
                bw.newLine();
            }
            System.out.println("Data saved to file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
