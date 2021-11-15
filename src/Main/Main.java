package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SimpanUang simpanUang = new SimpanUang();
        CekSaldo cekSaldo = new CekSaldo();
        HistoryTransaksi historyTransaksi = new HistoryTransaksi();

        int i=0;
        int pilihan, pilihan2 = 0, tabung = 0;
        int saldo = 50000;
        int ambil = 0, isi = 0;
        int index=0, index2=0;
        int[] tambah_saldo=new int[20], tarik_saldo=new int[20];

        for(i=0; i<=2; i++){

            System.out.println("=================================================");
            System.out.println("          Selamat Datang Di ATM Sejaterah        ");
            System.out.println("=================================================");
            System.out.print("masukan user: ");
            String user = br.readLine();
            System.out.print("masukan password: ");
            int password = Integer.parseInt(br.readLine());

            if( (user.equalsIgnoreCase("admin")) && (password==123) ){

                System.out.println("\n               Login Berhasil              ");
                System.out.println("\n");

                i=5;


                while(true){
                    System.out.println("=================================================");
                    System.out.println("                   ATM Sejahtera                 ");
                    System.out.println("=================================================");
                    System.out.println("\n1.Cek Saldo");
                    System.out.println("2.Simpan Uang");
                    System.out.println("3.Ambil Uang");
                    System.out.println("4.History Transaksi");
                    System.out.println("5.Help");
                    System.out.println("6.keluar");
                    System.out.print("\nPilih Menu : ");
                    pilihan = Integer.parseInt(br.readLine());
                    switch (pilihan) {
                        case 1:
                            cekSaldo.CekSaldo(saldo, pilihan2, br);
                            break;
                        case 2:
                            simpanUang.simpanUang(tabung, tambah_saldo, index, saldo, pilihan2, br);
                            break;
                        case 3:
                            simpanUang.ambilUang(ambil, tarik_saldo, index2, isi, saldo, pilihan2, br);
                            break;
                        case 4:
                            historyTransaksi.histori(index, tambah_saldo, index2, tarik_saldo, pilihan2, br);

                            break;
                        case 5:
                            do{
                                System.out.println("=================================================");
                                System.out.println("                      Help                       ");
                                System.out.println("1. Gunakan Menu ke-1 jika anda ingin melihat saldo anda");
                                System.out.println("2. Gunakan Menu ke-2 jika anda ingin mengisi saldo");
                                System.out.println("3. Gunakan Menu ke-3 jika anda ingin melakukan penarikan saldo");
                                System.out.println("4. Gunakan Menu ke-4 jika anda ingin melihat history transaksi");
                                System.out.println("6. Gunakan Menu ke-6 jika anda selesai menggunakan mesin ATM");
                                System.out.println("7. Saat penarikan, saldo minimal anda adalah Rp.50000");
                                System.out.println("8. Jika terdapat masalah pada mesin ATM hubungi 021-5437xxx");
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

                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            System.exit(0);
                            break;
                    }
                }

            } else {
                System.out.println("user atau password Salah silakan coba lagi");
            }



        }

    }

}
