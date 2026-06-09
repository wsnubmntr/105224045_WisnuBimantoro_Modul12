public class StandardFineCalculator implements FineCalculator {

    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 5000;
    }
}