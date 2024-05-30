package ex_04_08.ex_06;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(29.90);

        int quantidade = 12;
        System.out.println("Preço do produto para %d unidades: R$ %.2f".formatted(quantidade, produto.calcularPrecoFinal(quantidade)));

        Servico servico1 = new Servico();
        Servico servico2 = new Servico();

        servico1.setTipo(1);
        servico1.setPreco(13.40);
        System.out.println("Serviço tipo %d custará: R$ %.2f".formatted(servico1.getTipo(), servico1.calcularPrecoFinal(quantidade)));

        servico2.setTipo(2);
        servico2.setPreco(24.25);
        System.out.println("Serviço tipo %d custará: R$ %.2f".formatted(servico2.getTipo(), servico2.calcularPrecoFinal(quantidade)));



    }
}
