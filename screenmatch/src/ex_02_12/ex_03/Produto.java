package ex_02_12.ex_03;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicaDesconto(double percentual) {
        preco *= 1 - percentual;
    }

    public void exibeFichaProduto() {
        System.out.println("""
                Nome: %s
                Preço: R$ %.2f""".formatted(nome,preco));
    }

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Livro");
        produto.setPreco(44.5);
        produto.exibeFichaProduto();

        double desconto = 0.15;

        System.out.println("Após desconto de %.2f:".formatted(desconto));
        produto.aplicaDesconto(desconto);
        produto.exibeFichaProduto();
    }
}
