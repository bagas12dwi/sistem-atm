package Main;

import java.util.Scanner;

public class Transaksi{
    public static Scanner input = new Scanner(System.in);
    public static String noRek, jenisBayar;
    public static int pilihan, tarik, bayar, bank;
    public static int saldo = 30000000;


    public static void transaksi() {
        Penarikan trk = new Penarikan();

        System.out.println("\n\tBank Maju Sejahtera\n\t");
        System.out.println("\t Pilih Jenis Transaksi");
        System.out.println("1. Penarikan \t 3. Pembayaran");
        System.out.println("2. Transfer \t 4. Info Rekening");
        pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.println("\nPENARIKAN");
                trk.tarik();
                break;

            case 2:
        }
    }
}
