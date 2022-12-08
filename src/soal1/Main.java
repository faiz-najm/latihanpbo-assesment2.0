package soal1;

public class Main {
    public static void main(String[] args) {
        //Membuat Gold
        System.out.println("Gold");
        GoldCard rs = new GoldCard(500);
        rs.topUp(100);
        System.out.println("Saldo Sekarang: "+rs.getSaldo());
        rs.play(10);
        System.out.println("Saldo Sekarang: "+rs.getSaldo());

        //membuat Red
        System.out.println("Red");
        RedCard rd = new RedCard(300);
        rd.topUp(100);
        System.out.println("Saldo Sekarang: "+rd.getSaldo());
        rd.play(10);
        System.out.println("Saldo Sekarang: "+rd.getSaldo());

    }

}
