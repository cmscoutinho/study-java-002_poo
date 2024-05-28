package br.com.alura.screenmatch.ex_03_10.ex_03;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(500.0);
        contaCorrente.sacar(220.0);
        contaCorrente.consultarSaldo();

        contaCorrente.cobrarTarifaMensal(22.9);
        contaCorrente.consultarSaldo();

    }
}
