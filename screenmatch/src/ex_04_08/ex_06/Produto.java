package ex_04_08.ex_06;

public class Produto implements Vendavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal(int quantidade) {
        double desconto = (quantidade > 10) ? 0.05 : 0.0;
        return quantidade * preco * (1 - desconto);
    }
}
