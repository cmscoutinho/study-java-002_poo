package ex_03_10.ex_04;

public class Principal {
    public static void main(String[] args) {
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();

        GeradorPrimo geradorPrimo = new GeradorPrimo();

        int numero = 20;

        verificadorPrimo.verificarSePrimo(numero);
        System.out.println("O próximo primo de %d é %d!".formatted(numero, geradorPrimo.gerarProximoPrimo(numero)));
    }
}
