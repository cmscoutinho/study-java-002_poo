package ex_03_10.ex_04;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSePrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println("%d é primo!".formatted(numero));
        } else {
            System.out.println("%d não é primo!".formatted(numero));
        }
    }
}
