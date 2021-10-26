package Main;

import java.util.*;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static String pin, Try;

    public static void main(String[] args) {
        Transaksi transaksi = new Transaksi();

        System.out.println("\t Bank Sendiri \t");
        System.out.println("Masukkan PIN (tekan Enter ketika selesai memasukan PIN)");
        pin = input.nextLine();

        if (pin.equals("170845")) {
            Try = "";
            do {
                transaksi.transaksi();
                System.out.println("\n Apakah anda ingin mencoba lagi? Y/N");
                Try = input.nextLine();
            } while (Try.equalsIgnoreCase("y"));
        } else {
            System.out.println("Maaf, nomor PIN anda salah!");
        }
    }

    public static String getTry() {
        return Try;
    }

    public static void setTry(String aTry) {
        Try = aTry;
    }
}
