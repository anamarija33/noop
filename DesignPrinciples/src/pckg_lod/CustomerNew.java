package pckg_lod;

public class CustomerNew {
    private OrderNew orderNew;

    public CustomerNew(OrderNew orderNew) {
        this.orderNew = orderNew;
    }

    public double calculateFinalPrice() {
        return orderNew.calculateOrderPrice();
    }
}
