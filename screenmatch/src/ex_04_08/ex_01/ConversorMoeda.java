package ex_04_08.ex_01;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        double cotacao = 5.2;
        return valorEmDolar * cotacao;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorEmDolar = 44.5;
        System.out.println("US$ %.2f = R$ %.2f".formatted(valorEmDolar, conversor.converterDolarParaReal(valorEmDolar)));
    }
}
