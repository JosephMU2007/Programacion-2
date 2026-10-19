public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        }
    }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    public void mostrarEstado() {
        String estado = activo ? "activo" : "inactivo";
        System.out.println("Nombre: " + nombre + "\nEstado: " + estado);
    }
}