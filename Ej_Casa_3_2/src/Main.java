public class Main {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto();

        p1.setNombre("Sistema de Movilidad");
        p1.setResponsable("Joseph");
        p1.setProgreso(35);
        p1.avanzar(25);

        System.out.println("Nombre del proyecto: " + p1.getNombre());
        System.out.println("Responsable a cargo: " + p1.getResponsable());
        System.out.println("Progreso actual (%): " + p1.getProgreso() + "%");
        System.out.println("¿Proyecto terminado?: " + p1.isTerminado());
    }
}