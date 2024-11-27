package pckg_strategy_file_writing;

import java.io.File;
import java.io.FileWriter;

public class FileWriterStrategy implements WriteStrategy {

    @Override
    public void writeToFile(String content, String filePath) {
        try(FileWriter fileWriter = new FileWriter(new File(filePath),true)) {
            fileWriter.write(content);
            fileWriter.write(System.lineSeparator());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
