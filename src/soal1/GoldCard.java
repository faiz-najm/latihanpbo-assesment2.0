package soal1;

public class GoldCard extends TozoCard {
    public GoldCard(int saldo) {
        super(saldo);
    }

    @Override
    public void topUp(int nominal) {
        this.saldo += (nominal + this.saldo * 0.2);
        // or
        // this.saldo = this.saldo - (nominal + this.saldo*0.2);
    }

    @Override
    public void play(int nominal) {
        this.saldo -= (nominal - 1);
        // or
        // this.saldo = this.saldo - (nominal - 1);
    }
}
