public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.trim().isEmpty()) {
            this.categoria = categoria;
        }
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoria);
    }
}