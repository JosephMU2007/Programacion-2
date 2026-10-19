public class Videojuegos {
    private String nombre;
    private String genero;
    private String version;
    private boolean activo;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getGenero() { return genero; }
    public void setVersion(String version) { this.version = version; }
    public String getVersion() { return version; }
    public void setActivo(boolean activo) { this.activo = activo; }
    public boolean isActivo() { return activo; }

    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre + " Género: " + genero + " Versión: " + version + " Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
    }

    public void cerrar() {
        activo = false;
    }

    public void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}