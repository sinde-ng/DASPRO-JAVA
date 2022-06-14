package belajar_teori._3_tipe_data;

public class Main {

    public static void main(String[] args) {

        // !!! UNTUK MELIHAT PERBEDAAN BISA DI RUN TERLEBIH DAHULU

        System.out.println("\n#0 2 Jenis Data :");
        System.out.println("  a. Primitive");
        System.out.println("     1. byte,short,int,long (bilangan bulat)");
        System.out.println("     2. float,double (bilangan rill)");
        System.out.println("     3. boolean (logika)");
        System.out.println("     4. char (teks)");
        System.out.println("  b. Non Primitive");
        System.out.println("     1. String (teks)");
        System.out.println("     2. Array");
        System.out.println("     3. Object");

        // #1 Tipe Data Angka
        System.out.println("\n#1 Tipe Data Angka :");

        // Bilangan Bulat
        System.out.println("  a. Byte");
        byte contohByte = 10;
        System.out.println("     Contoh    : byte contohByte = 10;");
        System.out.println("     Output    : " + contohByte);

        System.out.println("     Nilai MAX : " + Byte.MAX_VALUE);
        System.out.println("     Nilai MIN : " + Byte.MIN_VALUE);
        System.out.println("     Besaran   : " + Byte.BYTES + "bytes");
        System.out.println("     Besaran   : " + Byte.SIZE + "bit");

        System.out.println("  b. Short");
        short contohShort = 100;
        System.out.println("     Contoh    : short contohShort = 100;");
        System.out.println("     Output    : " + contohShort);

        System.out.println("     Nilai MAX : " + Short.MAX_VALUE);
        System.out.println("     Nilai MIN : " + Short.MIN_VALUE);
        System.out.println("     Besaran   : " + Short.BYTES + "bytes");
        System.out.println("     Besaran   : " + Short.SIZE + "bit");

        System.out.println("  b. Integer");
        int contohInt = 1000;
        System.out.println("     Contoh    : int contohInt = 1000;");
        System.out.println("     Output    : " + contohInt);

        System.out.println("     Nilai MAX : " + Integer.MAX_VALUE);
        System.out.println("     Nilai MIN : " + Integer.MIN_VALUE);
        System.out.println("     Besaran   : " + Integer.BYTES + "bytes");
        System.out.println("     Besaran   : " + Integer.SIZE + "bit");

        System.out.println("  c. Long");
        long contohLong = 10000;
        System.out.println("     Contoh    : long contohLong = 10000;");
        System.out.println("     Output    : " + contohLong);

        System.out.println("     Nilai MAX : " + Long.MAX_VALUE);
        System.out.println("     Nilai MIN : " + Long.MIN_VALUE);
        System.out.println("     Besaran   : " + Long.BYTES + "bytes");
        System.out.println("     Besaran   : " + Long.SIZE + "bit");

        // Bilangan Riil
        System.out.println("  d. Float");
        float contohFloat = 7;
        System.out.println("     Contoh    : float contohFloat = 7;");
        System.out.println("     Output    : " + contohFloat);

        System.out.println("     Nilai MAX : " + Float.MAX_VALUE);
        System.out.println("     Nilai MIN : " + Float.MIN_VALUE);
        System.out.println("     Besaran   : " + Float.BYTES + "bytes");
        System.out.println("     Besaran   : " + Float.SIZE + "bit");

        System.out.println("  e. Double");
        double contohDouble = 7.5;
        System.out.println("     Contoh    : double contohDouble = 7.5;");
        System.out.println("     Output    : " + contohDouble);

        System.out.println("     Nilai MAX : " + Double.MAX_VALUE);
        System.out.println("     Nilai MIN : " + Double.MIN_VALUE);
        System.out.println("     Besaran   : " + Double.BYTES + "bytes");
        System.out.println("     Besaran   : " + Double.SIZE + "bit");

        System.out.println();

        // #2 Tipe Data Teks
        System.out.println("\n#2 Tipe Data Teks :");

        System.out.println("  a. Char");
        char contohChar = 'A';
        System.out.println("     Contoh    : char contohChar = 'A';");
        System.out.println("     Output    : " + contohChar);

        System.out.println("  b. String");
        String contohString = "Hello World!";
        System.out.println("     Contoh    : String contohString = \"Hello World!\";");
        System.out.println("     Output    : " + contohString);

        // #3 Tipe Data Logika
        System.out.println("\n#3 Tipe Data Logika :");

        System.out.println("  a. Boolean");
        boolean contohBoolean1 = true;
        System.out.println("     Contoh    : boolean contohBoolean1 = true;");
        System.out.println("     Output    : " + contohBoolean1);
        boolean contohBoolean2 = false;
        System.out.println("     Contoh    : boolean contohBoolean2 = false;");
        System.out.println("     Output    : " + contohBoolean2);

    }

}
