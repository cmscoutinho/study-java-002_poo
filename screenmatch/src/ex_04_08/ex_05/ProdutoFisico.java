package ex_04_08.ex_05;

public class ProdutoFisico implements Calculavel {
    private double preco;
    private double peso;

    @Override
    public double calcularPrecoFinal() {
        return preco * peso + 0.10;
    }
}
