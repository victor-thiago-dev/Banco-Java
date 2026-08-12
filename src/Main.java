public class Main {
    public static void main(String[] args) {
        Pessoa cliente1 = new Pessoa("Victor", "123.123.123-00");
        Pessoa cliente2 = new Pessoa("Maria", "000-000-000-00");
        Conta conta = new Conta(1001, cliente1);
        Conta conta2 = new Conta(1002, cliente2);

        cliente1.mostrarDados();
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
        conta.dadosDaConta();
        if(conta.transferir(100, conta2)){
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Erro na tranferência");
        }
        System.out.println("Saldo: " + conta.getSaldo());
        conta2.dadosDaConta();

    }
}
