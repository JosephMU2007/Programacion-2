public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();

        u1.setUsername("joseph_dev");
        u1.setCorreo("joseph@udla.edu.ec");
        u1.setNivel(4);
        u1.activar();

        System.out.println("Nombre de usuario: " + u1.getUsername());
        System.out.println("Correo electrónico: " + u1.getCorreo());
        System.out.println("Nivel actual: " + u1.getNivel());
        System.out.println("¿Cuenta activa?: " + u1.isActivo());
    }
}