public class DeliveryByCourier implements Delivery{
    @Override
    public void deliver() {
        System.out.println("Delivering by courier");
    }

    @Override
    public double getDeliveryCost() {
        return 1990.0;
    }
}
