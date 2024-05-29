package ex_03_10.ex_03;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal(double tarifa) {
        double saldoAtual = getSaldo();
        setSaldo(saldoAtual - tarifa);
    }

}
