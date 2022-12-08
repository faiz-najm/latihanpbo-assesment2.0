package soal1;

public class RedCard extends TozoCard {

    public RedCard(int saldo) {
        super(saldo);
    }

    @Override
    public void topUp(int nominal) {
        this.saldo += (nominal + this.saldo * 0.05);
        // or
        // this.saldo = this.saldo - (this.saldo * 0.05);
    }

    @Override
    public void play(int nominal) {
        this.saldo -= nominal;
        // or
        // this.saldo = this.saldo - nominal;
    }
}
