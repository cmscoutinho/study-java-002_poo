package ex_03_10.ex_04;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int numero) {
        int proximoPrimo = numero + 1;
        while (!verificarPrimalidade(proximoPrimo)) {
            proximoPrimo++;
        }
        return proximoPrimo;
    }
}
