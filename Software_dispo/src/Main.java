public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo();
        Dispositivo d2 = new Dispositivo();

        d1.setNombre("Tablet");
        d1.setTipo("Samsung");
        d1.setActivo(true);

        d2.setNombre("Impresora");
        d2.setTipo("Epson");
        d2.setActivo(false);

        d1.mostrarInformacion();
        System.out.println();
        d2.mostrarEstado();
    }
}