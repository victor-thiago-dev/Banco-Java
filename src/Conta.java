public class Conta {
    private int numero;
    private double saldo;
    private Pessoa titular;


    public Conta(int numero, Pessoa titular) {
        this.saldo = 0;
        this.numero = numero;
        this.titular = titular;
    }

    public void dadosDaConta(){
        System.out.println("---------------------");
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("---------------------");
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

    public boolean transferir(double valor, Conta contaDestino){
        if(!sacar(valor)) return false;

        contaDestino.depositar(valor);
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }
}
