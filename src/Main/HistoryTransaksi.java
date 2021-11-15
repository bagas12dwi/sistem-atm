package Main;

import java.io.BufferedReader;
import java.io.IOException;

public class HistoryTransaksi {

    public void histori(int index, int tambah_saldo[], int index2, int tarik_saldo[], int pilihan2, BufferedReader br) throws IOException {
        do{
            System.out.println("=================================================");
            System.out.println("                History Transaksi                ");
            System.out.println("History Masukan");
            for (int y=0; y<index; y++){
                System.out.println((y+1)+" "+tambah_saldo[y]);}
            System.out.println("History Keluaran");
            for (int z=0; z<index2; z++){
                System.out.println((z+1)+" "+tarik_saldo[z]);}
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
