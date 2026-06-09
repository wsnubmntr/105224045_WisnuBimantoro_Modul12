public class TiketHabisException
        extends Exception {

    private String namaKereta;
    private int sisaKursi;

    public TiketHabisException(
            String namaKereta,
            int sisaKursi) {

        super("Jumlah tiket melebihi kursi yang tersedia.");

        this.namaKereta = namaKereta;
        this.sisaKursi = sisaKursi;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public int getSisaKursi() {
        return sisaKursi;
    }
}