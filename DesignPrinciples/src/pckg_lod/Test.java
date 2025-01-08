package pckg_lod;

public class Test {
    public static void main(String[] args) {
        Product product = new Product(100);
        Order order = new Order(product);
        Customer customer = new Customer(order);
        // customer može pozivati metodu producta i ordera
        double price = customer.getOrder().getProduct().getPrice();
        System.out.println("Price: " + price);


        // svaka klasa ima svoje metode i metode svog polja, nema preklapanja
        Product productNew = new Product(499);
        OrderNew orderNew = new OrderNew(productNew);
        CustomerNew customerNew = new CustomerNew(orderNew);

        double priceNew = customerNew.calculateFinalPrice();
        System.out.println("New price: " + priceNew);
    }
}
