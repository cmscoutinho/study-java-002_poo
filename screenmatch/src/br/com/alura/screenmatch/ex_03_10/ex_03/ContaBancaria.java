package br.com.alura.screenmatch.ex_03_10.ex_03;

public class ContaBancaria {
    private double saldo = 0.0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ %.2f realizado com sucesso!".formatted(valor));
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (0 < valor && valor < saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ %.2f realizado com sucesso!".formatted(valor));
        } else {
            System.out.println("Valor inválido ou saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
