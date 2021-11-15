package Main;

import java.io.BufferedReader;
import java.io.IOException;

public class SimpanUang {
    public final void simpanUang(int tabung, int tambah_saldo[], int index , int saldo, int pilihan2, BufferedReader br) throws IOException {
        do{
            System.out.println("=================================================");
            System.out.println("   Masukan Jumlah Uang Yang Ingin Anda Simpan    ");
            System.out.print("     Rp. ");
            tabung = Integer.parseInt(br.readLine());
            tambah_saldo[index]=tabung;
            index++;
            saldo += tabung;
            System.out.println("  Saldo Anda adalah Rp. " + saldo);
            System.out.println("=================================================");
            System.out.println("\n1.keluar");
            System.out.println("2.Kembali");
            System.out.print("\nPilih Menu : ");
            pilihan2 = Integer.parseInt(br.readLine());
            switch (pilihan2) {
                case 1:
                    System.exit(0);
                    break;

            }
        }while(pilihan2!=2);
    }

    public final void ambilUang(int ambil, int tarik_saldo[], int index2, int isi, int saldo, int pilihan2, BufferedReader br) throws IOException {
        do{
            System.out.println("=================================================");
            System.out.println("    Masukan Jumlah Uang Yang Ingin Anda Ambil    ");
            System.out.print("     Rp. ");
            ambil = Integer.parseInt(br.readLine());
            tarik_saldo[index2]=ambil;
            index2++;
            isi = saldo;
            isi -= ambil;
            if (isi <= 50000) {
                System.out.println("Saldo Minimal setelah pengambilan harus Rp.50000");
            } else {
                saldo -= ambil;
                System.out.println("Saldo Anda adalah Rp. " + saldo);
            }
            System.out.println("=================================================");
            System.out.println("\n1.keluar");
            System.out.println("2.Kembali");
            System.out.print("\nPilih Menu : ");
            pilihan2 = Integer.parseInt(br.readLine());
            switch (pilihan2) {
                case 1:
                    System.exit(0);
                    break;

            }
        }while(pilihan2!=2);
    }
}
