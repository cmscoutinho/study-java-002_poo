package ex_04_08.ex_05;

public class Livro implements Calculavel {
    private double preco;
    private int ano;

    @Override
    public double calcularPrecoFinal() {
        if (ano <= 1920) {
            return preco * 1.10;
        } else {
            return preco;
        }
    }
}
