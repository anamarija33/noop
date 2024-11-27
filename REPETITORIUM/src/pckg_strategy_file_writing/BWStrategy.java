package pckg_strategy_file_writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BWStrategy implements WriteStrategy{
    @Override
    public void writeToFile(String content, String filePath) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath),true))) {
            bw.write(content);
            bw.write("\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
