public class Conta {
    private double saldo;
    private int numero;


    public Conta(int numero) {
        this.saldo = 0;
        this.numero = numero;
    }

    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }

        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(valor <= 0 || valor > this.saldo){
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
}
