public class Main {
    public static void main(String[] args) {
        Aplicacion app1 = new Aplicacion("GestorAcademico", "3.2");
        Aplicacion app2 = new Aplicacion("ControlAsistencia", "1.7");

        app1.iniciar();

        System.out.println("App ID: " + app1.getId() + "\n" + app1.getNombre() + " v" + app1.getVersion() + "\nEn ejecución: " + app1.isEjecutando());
        System.out.println("App ID: " + app2.getId() + "\n" + app2.getNombre() + " v" + app2.getVersion() + "\nEn ejecución: " + app2.isEjecutando());

        System.out.println("\nTotal de aplicaciones: " + Aplicacion.getTotalAplicaciones());
    }
}