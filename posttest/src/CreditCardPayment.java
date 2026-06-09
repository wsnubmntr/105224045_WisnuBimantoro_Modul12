public class CreditCardPayment implements PaymentMethod, Refundable {

    @Override
    public void pay(double amount) {
        System.out.println("Membayar dengan Credit Card sebesar " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund Credit Card sebesar " + amount);
    }
}