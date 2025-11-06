import java.util.Scanner;
public class ArrayRataNilai06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMahasiswa = new int[10];
        double total = 0;
        double rataRata;
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > 70) {
                jumlahLulus++;
            }
        }

        rataRata = total / nilaiMahasiswa.length;
        System.out.println("Rata-rata nilai = " + rataRata);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    }
}