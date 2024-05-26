package ex_01_09.ex_03;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao = 0.0;
    int numAvaliacoes = 0;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Média: " + media());
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double media() {
        return avaliacao / numAvaliacoes;
    }

    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Time Stand Still";
        musica.artista = "Rush";
        musica.anoLancamento = 1987;

        musica.avalia(7.8);
        musica.avalia(9.0);
        musica.avalia(9.6);

        musica.exibeFichaTecnica();
    }
}
