public class OVOPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Membayar dengan OVO sebesar " + amount);
    }
}