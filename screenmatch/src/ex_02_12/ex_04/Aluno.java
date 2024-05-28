package ex_02_12.ex_04;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double mediaNotas() {
        return (nota1 + nota2 + nota3)/3;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Claudio Coutinho");
        aluno.setNota1(7.8);
        aluno.setNota2(9.2);
        aluno.setNota3(8.75);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.mediaNotas());
    }
}
