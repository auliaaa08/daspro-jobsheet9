import java.util.Scanner;
public class ArrayRataNilai06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataRataLulus = 0;
        double rataRataTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > 70) {
                totalLulus += nilaiMahasiswa[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                jumlahTidakLulus++;
            }
        }

        if (jumlahLulus > 0) {
            rataRataLulus = totalLulus / jumlahLulus;
        }
        if (jumlahTidakLulus > 0) {
            rataRataTidakLulus = totalTidakLulus / jumlahTidakLulus;
        }

        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
    }
}
