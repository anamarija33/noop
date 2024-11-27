package pckg_strategy_file_writing;

import java.io.File;
import java.io.FileOutputStream;

public class FOSStrategy implements WriteStrategy {

    @Override
    public void writeToFile(String content, String filePath) {
        try(FileOutputStream fos = new FileOutputStream(new File(filePath),true)) {
            fos.write(content.getBytes());
            fos.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
