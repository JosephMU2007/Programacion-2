package negocio;

public class Carro {
    private int potencia;
    private double velocidad;
    private static int numCarros = 0;
    private static final double IVA = 0.15;

    public Carro(int potencia, double velocidad) {
        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros++;
    }

    public Carro() {
        numCarros++;
    }

    public void setPotencia(int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        }
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = Math.max(0, velocidad);
    }

    public int getPotencia() { return potencia; }
    public double getVelocidad() { return velocidad; }
    public static int getNumCarros() { return numCarros; }
    public static double getIva() { return IVA; }

    public double calcularPrecio(double precio) {
        return precio + (precio * IVA);
    }

    public void acelerar() {
        velocidad += potencia;
    }

    public void frenar() {
        velocidad /= 2;
    }
}