public class OrderService {

    private PaymentMethod paymentMethod;
    private EmailNotifier notifier;

    public OrderService(PaymentMethod paymentMethod,
                        EmailNotifier notifier) {

        this.paymentMethod = paymentMethod;
        this.notifier = notifier;
    }

    public void createOrder(double amount) {

        System.out.println("Pesanan dibuat");

        paymentMethod.pay(amount);

        notifier.sendEmail("Pembayaran berhasil");

        System.out.println("Pesanan selesai");
    }
}