package ex_01_09.ex_04;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + calculaIdade());
    }

    int calculaIdade() {
        return 2024 - ano;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Etios";
        carro.cor = "Vermelho";
        carro.ano = 2017;

        carro.exibeFichaTecnica();
    }
}
