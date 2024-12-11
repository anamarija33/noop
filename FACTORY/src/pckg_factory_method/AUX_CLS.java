package pckg_factory_method;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AUX_CLS {

    // metoda koja čita iz datoteke kao string, i na osnovu stringa, zove metodu za pravljenje objekta

    public static ArrayList<String[]> readDataFromFile() {
        // read data from file
        // call method for creating object
        ArrayList<String[]> data = new ArrayList<>();
        File file = new File("/home/szb/Documents/noop_gh/FACTORY/src/pckg_factory_method/orders_EU.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                data.add(st.split(","));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
