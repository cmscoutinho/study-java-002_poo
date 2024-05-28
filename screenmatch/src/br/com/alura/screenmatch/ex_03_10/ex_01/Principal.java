package br.com.alura.screenmatch.ex_03_10.ex_01;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setModelo("Etios");
        modeloCarro.definePrecos(60000, 45000, 54000);
        modeloCarro.exibeInfo();
    }
}
