package ex_04_08.ex_02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return 2 * altura + 2 * largura;
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular calc = new CalculadoraSalaRetangular();
        System.out.println("Área: %.2f".formatted(calc.calcularArea(3.4, 2.5)));
        System.out.println("Perímetro: %.2f".formatted(calc.calcularPerimetro(3.4, 2.5)));
    }
}
