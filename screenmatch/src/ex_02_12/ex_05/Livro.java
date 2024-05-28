package ex_02_12.ex_05;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("""
                Título: %s
                Autor: %s""".formatted(titulo,autor));
    }

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("The Last Kingdom");
        livro.setAutor("Bernard Cornwell");

        livro.exibirDetalhes();
    }
}
