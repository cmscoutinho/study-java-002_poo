package ex_04_08.ex_03;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("%d x %d = %d".formatted(numero, i, numero * i));
        }
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(8);
    }
}
