package soal1;

public abstract class TozoCard {
    protected int saldo;

    public int getSaldo() {
        return saldo;
    }

    public TozoCard(int saldo) {
        this.saldo = saldo;
    }

    public abstract void topUp(int i);

    public abstract void play(int i);
}
