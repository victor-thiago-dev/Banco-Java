public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Pessoa cliente = new Pessoa();
        cliente.init("Victor", 19, "123.123.123-00");
        conta.init(12345);
        cliente.mostrarDados();
        System.out.println("Saldo: "+ conta.getSaldo());
        if(conta.depositar(500)){
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Valor inválido");
        }
        System.out.println("Saldo: "+ conta.getSaldo());
        if(conta.sacar(200)){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Valor inválido");
        }
        System.out.println("Saldo: "+ conta.getSaldo());
    }
}
