public class Main {
    public static void main(String[] args) {
        Servidor s1 = new Servidor("ServidorPrincipal", "192.168.10.15");
        Servidor s2 = new Servidor("ServidorDatos", "192.168.10.25");
        Servidor s3 = new Servidor("ServidorRespaldo", "192.168.10.35");

        s1.activar();
        s2.activar();
        s1.activar();

        System.out.println("Servidor ID " + s1.getId() + ": " + s1.getNombre() + "\nIP: " + s1.getDireccionIP() + "\nActivo: " + s1.isActivo());
        System.out.println("Servidor ID " + s2.getId() + ": " + s2.getNombre() + "\nIP: " + s2.getDireccionIP() + "\nActivo: " + s2.isActivo());
        System.out.println("Servidor ID " + s3.getId() + ": " + s3.getNombre() + "\nIP: " + s3.getDireccionIP() + "\nActivo: " + s3.isActivo());

        System.out.println("\nTotal de servidores creados: " + Servidor.getTotalServidores());
        System.out.println("Total de servidores activos: " + Servidor.getServidoresActivos());
    }
}