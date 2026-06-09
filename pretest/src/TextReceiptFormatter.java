public class TextReceiptFormatter implements ReceiptFormatter {

    @Override
    public String formatReceipt(double fine) {
        return "Denda : Rp" + fine;
    }
}