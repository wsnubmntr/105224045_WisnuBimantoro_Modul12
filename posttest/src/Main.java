public class Main {

    public static void main(String[] args) {

        PaymentMethod payment =
                new OVOPayment();

        EmailNotifier notifier =
                new EmailSystem();

        OrderService order =
                new OrderService(payment, notifier);

        order.createOrder(100000);
    }
}