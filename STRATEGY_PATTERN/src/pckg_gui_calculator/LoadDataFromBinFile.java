package pckg_gui_calculator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadDataFromBinFile implements LoadDataStrategy<CalculationFormData> {
    @Override
    public void LoadDataFromFile(String filepath, List<CalculationFormData> list) {
        File file = new File(filepath);

        try(FileInputStream fis = new FileInputStream(file)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available() > 0) {
                CalculationFormData obj = (CalculationFormData) ois.readObject();
                list.add(obj);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
