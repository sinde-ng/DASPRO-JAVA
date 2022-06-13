package belajar_teori._2_ouput;

public class Main {

    public static void main(String[] args) {

        /*
         * #1
         * Otomatis / Langsung Pindah Baris tanpa perintah tambahan
         * Output :
         * Hello World!
         * Hello World!
         */
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println();

        /*
         * #2
         * Tidak Langsung Pindah Baris memerlukan perintah tambahan yaitu "\n"
         * Output :
         * HelloWorld!HelloWordl
         * 
         * Maka harus ditambah "\n"
         */
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        System.out.print("\nHello World!\n");
        System.out.print("Hello World!\n");

        System.out.println();

        /*
         * #3
         * String format
         * 
         * %-..s : akan memberikan jarak pada sebelah kanan
         * %..s : akan memberikan jarak pada sebelah kiri
         */

        // Tipe Data Teks
        String nama1 = "A";
        String nama2 = "B";
        System.out.printf("| %-8s |\n", nama1);
        System.out.printf("| %-8s |\n", nama2);
        System.out.printf("| %8s |\n", nama1);
        System.out.printf("| %8s |\n", nama2);

        // Tipe Data Angka
        int angka1 = 1;
        int angka2 = 2;
        System.out.printf("| %-8d |\n", angka1);
        System.out.printf("| %-8d |\n", angka2);
        System.out.printf("| %8d |\n", angka1);
        System.out.printf("| %8d |\n", angka2);

    }

}
