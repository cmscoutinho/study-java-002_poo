package ex_03_10.ex_02;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latindo!");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo!");
    }
}
