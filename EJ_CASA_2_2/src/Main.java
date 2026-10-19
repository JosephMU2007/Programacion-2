public class Main {
    public static void main(String[] args) {
        Modulo login = new Modulo();
        login.setNombre("Autenticación");
        login.setLenguaje("Java");
        login.setVersion("2.0");
        login.setTerminado(true);

        Modulo inventario = new Modulo();
        inventario.setNombre("Catálogo");
        inventario.setLenguaje("Java");
        inventario.setVersion("1.4");
        inventario.setTerminado(false);

        Modulo reportes = new Modulo();
        reportes.setNombre("Reportes");
        reportes.setLenguaje("Python");
        reportes.setVersion("1.1");
        reportes.setTerminado(false);

        System.out.println(login.getNombre());
        System.out.println(login.getLenguaje());
        System.out.println(login.isTerminado());

        System.out.println(inventario.getNombre());
        System.out.println(inventario.getVersion());
        System.out.println(inventario.isTerminado());
    }
}