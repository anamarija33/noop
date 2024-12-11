package pckg_no_factory;

public class Test {
    public static void main(String[] args) {
        NewCarStore newCarStore = new NewCarStore();
        newCarStore.orderCar("Toyota", "Corolla", "Sedan");
        newCarStore.orderCar("Toyota", "Land Cruiser", "SUVi");
    }
}
