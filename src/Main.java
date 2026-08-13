import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = -1;
        Conta conta = new Conta(0, null);

        System.out.println("Bem vindo ao Banco-Java!");

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Exibir dados da conta");
            System.out.println("0 - Sair");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite seu nome: ");
                    String nome = input.nextLine();

                    System.out.print("Digite seu CPF: ");
                    String cpf = input.nextLine();

                    Pessoa pessoa = new Pessoa(nome, cpf);

                    System.out.print("Digite o número da conta: ");
                    int numero = input.nextInt();

                    conta = new Conta(numero, pessoa);

                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    if(conta.getTitular() == null){
                        System.out.println("Erro! Crie uma conta");
                        break;
                    }

                    System.out.println("R$ " + conta.getSaldo());
                    break;
                case 3: {
                    if (conta.getTitular() == null) {
                        System.out.println("Erro! Crie uma conta");
                        break;
                    }

                    double valor;

                    System.out.print("Digite o valor do depósito: ");
                    valor = input.nextDouble();

                    if (conta.depositar(valor)) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                }
                case 4: {
                    if (conta.getTitular() == null) {
                        System.out.println("Erro! Crie uma conta");
                        break;
                    }

                    double valor;

                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = input.nextDouble();

                    if(conta.sacar(valor)){
                        System.out.println("Saque realizado com sucesso!");
                    }else{
                        System.out.println("Valor inválido");
                    }
                    break;
                }
                case 5: {
                    if(conta.getTitular() == null){
                        System.out.println("Erro! Crie uma conta");
                        break;
                    }
                    conta.dadosDaConta();
                    break;
                }
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

    }
}
