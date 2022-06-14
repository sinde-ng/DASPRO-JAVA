package belajar_teori._4_input;

// mengimport library untuk input
import java.io.*;

public class _2_buffered {

    // Jika menggunakan java io akan ada penambahan fungsi yaitu throws IOException
    public static void main(String[] args) throws IOException {
        // Inisialisasinya sangat panjang dibanding dengan menggunakan java util
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();

        // Pemanggilan pada tipe data teks
        System.out.print("Nama : ");
        String nama = input.readLine();

        // Pemanggilan pada tipe data angka
        System.out.print("Umur : ");
        int umur = Integer.parseInt(input.readLine());

        System.out.println("\nHasil: " + nama + " berumur " + umur + " tahun.");

    }
}
