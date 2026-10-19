public class Modulo {
    private String nombre;
    private String lenguaje;
    private String version;
    private boolean terminado;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setLenguaje(String lenguaje) { this.lenguaje = lenguaje; }
    public String getLenguaje() { return lenguaje; }
    public void setVersion(String version) { this.version = version; }
    public String getVersion() { return version; }
    public void setTerminado(boolean terminado) { this.terminado = terminado; }
    public boolean isTerminado() { return terminado; }

    public void mostrarInformacion() {
        System.out.println("Módulo: " + nombre + " Lenguaje: " + lenguaje + " Versión: " + version + " Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
    }

    public void mostrarEstado() {
        System.out.println("¿El módulo " + nombre + " está terminado? " + terminado);
    }

    public void mostrarVersion() {
        System.out.println("Versión del módulo " + nombre + ": " + version);
    }
}