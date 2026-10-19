public class Main {
    public static void main(String[] args) {
        Videojuegos j1 = new Videojuegos();
        j1.setNombre("Rocket League");
        j1.setGenero("Deportes");
        j1.setVersion("2.40");
        j1.setActivo(true);

        Videojuegos j2 = new Videojuegos();
        j2.setNombre("Fortnite");
        j2.setGenero("Battle Royale");
        j2.setVersion("31.10");
        j2.setActivo(false);

        System.out.println(j1.getNombre());
        System.out.println(j1.getGenero());
        System.out.println(j1.getVersion());
        System.out.println(j1.isActivo());

        System.out.println(j2.getNombre());
        System.out.println(j2.getGenero());
        System.out.println(j2.getVersion());
        System.out.println(j2.isActivo());
    }
}