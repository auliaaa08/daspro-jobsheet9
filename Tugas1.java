import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilai = new int[jumlahMahasiswa];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlahMahasiswa;

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }

        System.out.println("\nNilai rata-rata : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

    }
}
