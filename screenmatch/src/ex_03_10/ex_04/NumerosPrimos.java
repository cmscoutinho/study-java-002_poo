package ex_03_10.ex_04;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        for(int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int numero) {
        for(int i = 1; i <= numero; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i);
            }
        }
    }
}
