public class DeliveryByMail implements Delivery{
    @Override
    public void deliver() {
        System.out.println("Delivering by mail");
    }

    @Override
    public double getDeliveryCost() {
        return 990.0;
    }
}
