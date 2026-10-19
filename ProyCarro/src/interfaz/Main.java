package interfaz;

import negocio.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(5, 70);

        System.out.println("Potencia: " + carro.getPotencia());
        System.out.println("Velocidad: " + carro.getVelocidad());
    }
}