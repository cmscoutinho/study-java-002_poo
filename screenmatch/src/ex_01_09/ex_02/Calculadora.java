package ex_01_09.ex_02;

public class Calculadora {
    public int dobro(int numero) {
        return 2*numero;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobro(14));
        System.out.println(calculadora.dobro(56));
    }
}
