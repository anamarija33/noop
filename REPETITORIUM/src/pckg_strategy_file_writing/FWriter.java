package pckg_strategy_file_writing;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class FWriter implements WriteStrategy{
    @Override
    public void writeToFile(String content, String filePath) {
//       String[] lines = content.split("\n");
//        LinkedList<String> list = new LinkedList<>();
//        list.addAll(new ArrayList<>(List.of(lines)));
//        try(Files.write(Path.of(filePath),list,APPEND)) {
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//
//
//        }
    }
}
