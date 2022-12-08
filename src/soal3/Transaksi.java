package soal3;

public class Transaksi {
    private static int idPengiriman = 0;
    private String namePenjual;
    private String alamatPenjual;
    private String namePembeli;
    private String alamatPembeli;
    private double ongkosKirim;
    private String namaEkspedisi;
    private String noResi;

    // Asuransi

    private double biayaAsuransi;

    private boolean statusAsuransi = false;

    // Drop Shipper

    private String namaDropShipper;

    private String alamatDropShipper;

    private boolean statusDropShipper = false;


    // Constructor Normal
    public Transaksi(String namePenjual, String alamatPenjual, String namePembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi) {
        this.idPengiriman += 1;
        this.namePenjual = namePenjual;
        this.alamatPenjual = alamatPenjual;
        this.namePembeli = namePembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
    }

    // Asuransi
    public Transaksi(String namePenjual, String alamatPenjual, String namePembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi, double biayaAsuransi) {
        this.idPengiriman += 1;
        this.namePenjual = namePenjual;
        this.alamatPenjual = alamatPenjual;
        this.namePembeli = namePembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = totalOngkosKirim(ongkosKirim, 5000);
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.biayaAsuransi = biayaAsuransi;
        this.statusAsuransi = true;
    }

    private double totalOngkosKirim(double ongkosKirim, double diskon) {
        if (ongkosKirim > 20000) {
            return ongkosKirim - diskon;
        } else {
            return ongkosKirim;
        }
    }

    // Drop Shipper
    public Transaksi(String namePenjual, String alamatPenjual, String namePembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi, String namaDropShipper, String alamatDropShipper) {
        this(namePenjual, alamatPenjual, namePembeli, alamatPembeli, ongkosKirim, namaEkspedisi, noResi);
        this.namaDropShipper = namaDropShipper;
        this.alamatDropShipper = alamatDropShipper;
        this.statusDropShipper = true;
    }

    // Asuransi dan Dropship
    public Transaksi(String namePenjual, String alamatPenjual, String namePembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi, double biayaAsuransi, String namaDropShipper, String alamatDropShipper) {
        this(namePenjual, alamatPenjual, namePembeli, alamatPembeli, ongkosKirim, namaEkspedisi, noResi);
        this.biayaAsuransi = biayaAsuransi;
        this.statusAsuransi = true;
        this.namaDropShipper = namaDropShipper;
        this.alamatDropShipper = alamatDropShipper;
        this.statusDropShipper = true;
    }

    public void print() {
        System.out.println("No Transaksi: " + this.idPengiriman);
        System.out.println("No Resi: " + this.noResi);
        System.out.println("Nama Ekspedisi: " + this.namaEkspedisi);
        System.out.println("Ongkos Kirim: " + this.ongkosKirim);
        if (this.statusDropShipper) {
            System.out.println("Nama Pengirim: " + this.namaDropShipper);
            System.out.println("Alamat Pengirim: " + this.alamatDropShipper);
        } else {
            System.out.println("Nama Pengirim: " + this.namePenjual);
            System.out.println("Alamat Pengirim: " + this.alamatPenjual);
        }
        System.out.println("Nama Penerima: " + this.namePembeli);
        System.out.println("Alamat Penerima: " + this.alamatPembeli);
        if (this.statusAsuransi) {
            System.out.println("Nominal Asuransi: " + this.biayaAsuransi);
        }
        System.out.println("====================================");

    }


}
