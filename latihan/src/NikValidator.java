public class NikValidator
        implements Validator {

    @Override
    public boolean valid(String data) {

        return data.matches("\\d{16}");
    }
}