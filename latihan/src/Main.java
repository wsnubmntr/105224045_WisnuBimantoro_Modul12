import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        Validator validator =
                new NikValidator();

        ReservasiService service =
                new ReservasiService(
                        validator);

        Reservasi reservasi =
                service;

        LayananJadwal jadwal =
                service;

        jadwal.tampilkanJadwal();

        input.close();
    }
}