package ex_03_10.ex_01;

public class Carro {
    private String modelo;
    private double precoAno1, precoAno2, precoAno3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double maiorPreco() {
        if (precoAno1 >= precoAno2 && precoAno1 >= precoAno3) {
            return  precoAno1;
        } else if (precoAno2 >= precoAno1 && precoAno2 >= precoAno3) {
            return precoAno2;
        } else {
            return  precoAno3;
        }
    }

    public double menorPreco() {
        if (precoAno1 <= precoAno2 && precoAno1 <= precoAno3) {
            return  precoAno1;
        } else if (precoAno2 <= precoAno1 && precoAno2 <= precoAno3) {
            return precoAno2;
        } else {
            return  precoAno3;
        }
    }

    public void exibeInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço ano 1: " + precoAno1);
        System.out.println("Preço ano 2: " + precoAno2);
        System.out.println("Preço ano 3: " + precoAno3);
        System.out.println("Menor preço: " + menorPreco());
        System.out.println("Maior preço: " + maiorPreco());
    }
}
