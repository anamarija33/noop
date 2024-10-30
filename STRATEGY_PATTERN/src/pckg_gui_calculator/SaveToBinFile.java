package pckg_gui_calculator;

import java.io.*;
import java.util.List;

public class SaveToBinFile implements SaveDataStrategy<CalculationFormData>{
    @Override
    public void saveDataToFile(String filePath, List<CalculationFormData> data) {
        File file = new File(filePath);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (CalculationFormData calculationFormData : data) {
                oos.writeObject(calculationFormData);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
