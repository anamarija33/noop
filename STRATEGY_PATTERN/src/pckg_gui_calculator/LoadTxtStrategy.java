package pckg_gui_calculator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadTxtStrategy implements LoadDataStrategy<String> {

        @Override
        public List<String> loadDataFromFile(String filePath) {
            List<String> data = new ArrayList<>();
            File file = new File(filePath);
            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    data.add(line);
                }
                System.out.println("Finished reading from a file:" + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return data;
        }
}
