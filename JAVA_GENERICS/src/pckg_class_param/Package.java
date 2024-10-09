package pckg_class_param;

import java.util.ArrayList;

public class Package <T>{

    private final ArrayList<T> pckgContent;
    private Class<T> classType;

    public Package(Class<T> classType) {
        this.classType = classType;
        this.pckgContent = new ArrayList<>();
        System.out.println("created package: "  +classType);
    }

    // pckgContent je final - znači finalna referenca na taj arraylist, ne može pokazivati na neki drugi arraylist
//    public void setPckgContent(ArrayList<T> contentNew) {
//        this.pckgContent = contentNew;
//    }


    public void addNewElementToPackage(T pckgElement) {
        if (pckgContent.contains(pckgElement)) {
            System.out.println("Element already in package");
        }else{
            pckgContent.add(pckgElement);
            System.out.println("Element added to package");
        }
    }

   public void listPackageContent(){
        if (pckgContent.isEmpty()) {
            System.out.println("Package is empty");
        }else {
            for (T item : pckgContent) {
                System.out.println("Package item : " + item);
            }
        }
   }


}
