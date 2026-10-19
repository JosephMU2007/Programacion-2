package negocio;

public class MainCarro {
    public static void main(String[] args) {
        System.out.println("Carros creados al inicio: " + Carro.getNumCarros());
        System.out.println("IVA de los vehículos: " + Carro.getIva());

        Carro c1 = new Carro(6, 80);
        Carro c2 = new Carro(3, 60);
        Carro c3 = new Carro();

        c1.acelerar();
        c2.frenar();

        System.out.println("Carros creados: " + Carro.getNumCarros());
        System.out.println("Precio de venta del carro 1: " + c1.calcularPrecio(18990));
        System.out.println("Carro 1 - potencia: " + c1.getPotencia() + ", velocidad: " + c1.getVelocidad());
        System.out.println("Carro 2 - potencia: " + c2.getPotencia() + ", velocidad: " + c2.getVelocidad());
        System.out.println("Carro 3 - potencia: " + c3.getPotencia() + ", velocidad: " + c3.getVelocidad());
    }
}