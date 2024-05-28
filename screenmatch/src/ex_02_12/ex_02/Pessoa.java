package ex_02_12.ex_02;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade!");
        } else {
            System.out.println(nome + " é menor de idade!");
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Claudio");
        pessoa.setIdade(35);

        pessoa.verificaIdade();
    }
}
