package belajar_teori._4_input;

// Mengimport library untuk input
import java.util.*;

public class _1_util {

    public static void main(String[] args) {
        // Ada 2 jenis input menggunakan java.util dan buffered reader

        System.out.println();

        // Inisialisasi
        Scanner inputUser = new Scanner(System.in);

        // Pemanggilan pada tipe data teks
        System.out.print("Nama : ");
        // Menampung sebuah input ke dalam variabel
        String nama = inputUser.next();

        // Pemanggilan pada tipe data angka
        System.out.print("Umur : ");
        int umur = inputUser.nextInt();

        // Mencetak Input
        System.out.println("\nHasil: " + nama + " berumur " + umur + " tahun.");
    }
}
