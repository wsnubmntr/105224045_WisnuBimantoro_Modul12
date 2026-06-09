public class GiftVoucherPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Membayar dengan Gift Voucher sebesar " + amount);
    }
}