import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        Validator validator =
                new NikValidator();

        ReservasiService service;
        service = new ReservasiService(
                validator);

        LayananJadwal jadwal =
                service;

        jadwal.tampilkanJadwal();

        input.close();
    }
}