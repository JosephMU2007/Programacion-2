public class Main {
    public static void main(String[] args) {
        Servicio s1 = new Servicio();

        s1.setNombre("API Movilidad");
        s1.setPuerto(9090);
        s1.iniciar();
        s1.registrarPeticion();
        s1.registrarPeticion();
        s1.registrarPeticion();

        System.out.println("Nombre del servicio: " + s1.getNombre());
        System.out.println("Puerto asignado: " + s1.getPuerto());
        System.out.println("¿Servicio en ejecución?: " + s1.isActivo());
        System.out.println("Total de peticiones registradas: " + s1.getCantidadPeticiones());
    }
}