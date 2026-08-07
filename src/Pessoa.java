public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void init(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Cpf: "+ this.cpf);
    }

}
