//package decorators_java_api;
//
//import java.io.*;
//
//public class AUX_CLS {
//
//        public static void writeTextToFile(String filePath, String text){
//            try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(filePath))))) {
//                bw.write(text);
//            } catch (FileNotFoundException fnf) {
//                System.out.println(fnf.getMessage());
//            } catch (IOException ioe) {
//                System.out.println(ioe.getMessage());
//            }
//
//        }
//
//    }
//}
