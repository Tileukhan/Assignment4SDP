public class DeliveryInStore implements Delivery{
    @Override
    public void deliver() {
        System.out.println("Customer picks up in-store");
    }

    @Override
    public double getDeliveryCost() {
        return 0.0;
    }
}
