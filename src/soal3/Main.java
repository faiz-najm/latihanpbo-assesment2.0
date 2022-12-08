package soal3;

public class Main {
    public static void main(String[] args) {

        //Transaksi Asuransi dan Dropship
        System.out.println("Asuransi dan Dropship");
        Transaksi transaksiAsuransiDropship = new Transaksi("Eiger", "Bandung Kopo", "Bejo", "DayeuhKolot", 21000, "JNE", "N0001", 40000, "Dropship1", "Surabaya");
        transaksiAsuransiDropship.print();

        //Transaksi Asuransi
        System.out.println("Asuransi");
        Transaksi transaksiAsuransi = new Transaksi("Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", 21000, "J&T", "N0003", 40000);
        transaksiAsuransi.print();

        // Transaksi Normal
        System.out.println("Normal");
        Transaksi transaksiNormal = new Transaksi("Eiger", "Bandung Kopo", "Bambang", "DayeuhKolot", 23000, "Pos Indonesia", "N0004");
        transaksiNormal.print();

        // Transaksi Dropship
        System.out.println("Dropship");
        Transaksi transaksiDropship = new Transaksi("Eiger", "Bandung Kopo", "Joko", "DayeuhKolot", 24000, "siCepat", "N0002", "Dropship2", "Pontianak");
        transaksiDropship.print();

    }
}
