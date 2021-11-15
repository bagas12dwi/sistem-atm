package Main;

import java.io.BufferedReader;
import java.io.IOException;

public class CekSaldo {
    public void CekSaldo (int saldo, int pilihan2, BufferedReader br) throws IOException {
        do{
            System.out.println("=================================================");
            System.out.println("                    Cek Saldo                    ");
            System.out.println("       Saldo Anda adalah Rp. " + saldo       );
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
