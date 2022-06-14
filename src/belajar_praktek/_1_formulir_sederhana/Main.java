package belajar_praktek._1_formulir_sederhana;

// Mengimport library, saya akan menggunakan java.oi kalian juga bisa menggunakan java.util
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
         * Praktek kali ini akan membuat formulir sederhana
         * Dimana sebelumnya kalian sudah mengetahui
         * 1. Output
         * 2. Tipe Data
         * 3. Input
         * 
         * Juga sudah mengetahui ke 3 hal tersebut bisa membuat formulir sederhana ini
         */

        /*
         * Pak RT sedang mendata warganya dari
         * Nama
         * Tempat, Tanggal lahir
         * Status
         * Pendidikan terakhir
         * Pekerjaan
         * Tinggi Badan
         * Anak ke-
         * Jumlah Saudara
         * 
         * Bagaimana jika akan dibuatkan sebuah program
         */

        // Menyiapkan variable untuk menampung data tersebut
        String nama,
                tempatTanggalLahir,
                status,
                pendidikanTerakhir,
                pekerjaan;

        double tinggiBadan;

        int anakKeBerapa,
                jumlahSaudara;

        // Inisialisasi fungsi input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Input
        System.out.println("\nPendataan Warga RT 01");
        System.out.println("-----------------------");
        System.out.println("Isi dengan lengkap!!!\n");

        System.out.print("a. Nama (14 huruf)       : ");
        nama = input.readLine();

        System.out.print("b. Tempat, Tanggal Lahir : ");
        tempatTanggalLahir = input.readLine();

        System.out.print("c. Status                : ");
        status = input.readLine();

        System.out.print("d. Pendidikan Terakhir   : ");
        pendidikanTerakhir = input.readLine();

        System.out.print("e. Pekerjaan             : ");
        pekerjaan = input.readLine();

        System.out.print("f. Tinggi Badan(cm)      : ");
        tinggiBadan = Double.parseDouble(input.readLine());

        System.out.print("g. Anak ke-              : ");
        anakKeBerapa = Integer.parseInt(input.readLine());

        System.out.print("h. Jumlah Saudara        : ");
        jumlahSaudara = Integer.parseInt(input.readLine());

        // Output, menggunakan string format 14 21 10 19 15 12 14 8
        System.out.printf("\n\n                                                     Daftar Penduduk RT 01\n" +
                "                                                               2025\n" +
                "\n------------------------------------------------------------------------------------------------------------------------------------------\n"
                +
                "| Nama Penduduk | Tempat, Tanggal Lahir |   Status   | Pendidikan Terakhir |    Pekerjaan    |  Tinggi Badan | Jumlah Saudara | Anak Ke- |\n"
                +
                "------------------------------------------------------------------------------------------------------------------------------------------\n");

        System.out.printf("| %-13s | %-21s | %-10s | %-19s | %-15s | %-13.1f | %-14d | %-8d |\n", nama,
                tempatTanggalLahir,
                status, pendidikanTerakhir, pekerjaan,
                tinggiBadan, jumlahSaudara, anakKeBerapa);

        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------------\n");

    }

}
