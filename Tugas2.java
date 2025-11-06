import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + " : ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + " : Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); // bersihkan buffer

            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("\nTotal biaya pesanan: Rp " + totalBiaya);
    }
}