public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();

        p1.setNombre("Teclado mecánico");
        p1.setPrecio(59.99);
        p1.setCategoria("Tecnología");

        System.out.println(p1.getNombre());
        System.out.println(p1.getPrecio());
        System.out.println(p1.getCategoria());
    }
}