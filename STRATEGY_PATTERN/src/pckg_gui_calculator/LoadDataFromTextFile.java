package pckg_gui_calculator;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class LoadDataFromTextFile implements LoadDataStrategy<String>{
    private static Scanner scanner;

    @Override
    public void LoadDataFromFile(String filepath, List<String> list) {
        File file = new File(filepath);
        try {
            scanner = new Scanner(file);
            String line ;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
                list.add(line);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
