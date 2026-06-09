public class ReceiptPrinter {

    private ReceiptFormatter formatter;

    public ReceiptPrinter(ReceiptFormatter formatter) {
        this.formatter = formatter;
    }

    public void printReceipt(double fine) {
        System.out.println(formatter.formatReceipt(fine));
    }
}