package Main;

public class Penarikan extends Transaksi{
    public static void tarik(){

        Main m = new Main();

        int[] nominal = {50000, 100000, 200000, 300000, 500000, 1000000};
        System.out.println("1. 50.000 \t4. 300.000");
        System.out.println("2. 100.000 \t5. 500.000");
        System.out.println("3. 200.000 \t6. 1.000.000");
        System.out.println("Pilih jumlah penarikan tunai yang anda ingin kan : ");
        tarik = input.nextInt();

        saldo = saldo - nominal[tarik-1];
        System.out.println("Penarikan berhasil !!!\n");
        System.out.println("\nSaldo anda tersisa " + saldo);

        m.setTry(input.nextLine());
    }
}
