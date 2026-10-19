public class Main {
    public static void main(String[] args) {
        System.out.println("Total antes de crear objetos: " + Dispositivo.getTotalCreados());

        Dispositivo d1 = new Dispositivo("MacBook Pro", "Computación");
        Dispositivo d2 = new Dispositivo("Switch Gigabit", "Redes");
        Dispositivo d3 = new Dispositivo("Servidor DNS", "Infraestructura");

        System.out.println("Objeto " + d1.getId() + "\nNombre: " + d1.getNombre() + "\nTipo: " + d1.getTipo());
        System.out.println("Objeto " + d2.getId() + "\nNombre: " + d2.getNombre() + "\nTipo: " + d2.getTipo());
        System.out.println("Objeto " + d3.getId() + "\nNombre: " + d3.getNombre() + "\nTipo: " + d3.getTipo());

        System.out.println("\nTotal de dispositivos creados: " + Dispositivo.getTotalCreados());
    }
}