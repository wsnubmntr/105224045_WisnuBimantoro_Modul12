import java.util.ArrayList;

public class ReservasiService
        implements Reservasi,
                   LayananJadwal {

    private ArrayList<Kereta> daftarKereta;

    private Validator validator;

    public ReservasiService(
            Validator validator) {

        this.validator = validator;

        daftarKereta =
                new ArrayList<>();

        daftarKereta.add(
                new KeretaEksekutif(
                        "K01",
                        "Argo Bromo",
                        "JKT-SBY",
                        50));

        daftarKereta.add(
                new KeretaEkonomi(
                        "K02",
                        "Parahyangan",
                        "JKT-BDG",
                        15));
    }

    @Override
    public void tampilkanJadwal() {

        for (Kereta kereta :
                daftarKereta) {

            System.out.println(
                    kereta.getKodeKereta()
                    + " | "
                    + kereta.getNamaKereta()
                    + " | "
                    + kereta.getRute()
                    + " | "
                    + kereta.getSisaKursi());
        }
    }

    @Override
    public void pesanTiket(
            String kodeKereta,
            String nik,
            String nama,
            int jumlahTiket)

            throws RuteTidakDitemukanException,
                   TiketHabisException {

        if (!validator.valid(nik)) {

            throw new DataPenumpangTidakValidException(
                    "NIK harus 16 digit angka");
        }

        Kereta keretaDipilih = null;

        for (Kereta kereta :
                daftarKereta) {

            if (kereta.getKodeKereta()
                    .equalsIgnoreCase(
                            kodeKereta)) {

                keretaDipilih =
                        kereta;
                break;
            }
        }

        if (keretaDipilih == null) {

            throw new RuteTidakDitemukanException(
                    "Kode kereta tidak ditemukan");
        }

        if (jumlahTiket >
                keretaDipilih
                        .getSisaKursi()) {

            throw new TiketHabisException(
                    keretaDipilih
                            .getNamaKereta(),
                    keretaDipilih
                            .getSisaKursi());
        }

        keretaDipilih.setSisaKursi(
                keretaDipilih
                        .getSisaKursi()
                        - jumlahTiket);

        System.out.println(
                "\nReservasi berhasil");
    }
}