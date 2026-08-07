public class Conta {
    private double saldo = 0;
    private int numero;

    public void init(int numero){
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

}
