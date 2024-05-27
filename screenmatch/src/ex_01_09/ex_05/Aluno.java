package ex_01_09.ex_05;

public class Aluno {
    String nome;
    int idade;

    void exibeDados() {
        System.out.println("""
                Nome: %s
                Idade: %d""".formatted(nome,idade));
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Claudio Coutinho";
        aluno.idade = 35;

        aluno.exibeDados();
    }
}
