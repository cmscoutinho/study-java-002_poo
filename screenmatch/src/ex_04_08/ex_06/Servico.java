package ex_04_08.ex_06;

public class Servico implements Vendavel {
    private double preco;
    private int tipo;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecoFinal(int quantidade) {
        double desconto;

        switch (tipo) {
            case 1:
                desconto = 0.15;
                break;
            case 2:
                desconto = 0.25;
                break;
            default:
                desconto = 0;
        }

        return quantidade * preco * (1 - desconto);
    }
}
