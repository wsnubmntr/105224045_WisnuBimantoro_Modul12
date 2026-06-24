public class Main {

    public static void main(String[] args) {

        DatabaseConnection database =
                new NoSQLDatabaseConnection();

        UKTCalculator calculator =
                new MBKMUKTCalculator();

        KRSService service =
                new KRSService(database, calculator);

        service.prosesKRS(20);

    }
}