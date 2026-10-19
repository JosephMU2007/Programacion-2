public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            terminado = progreso == 100;
        }
    }

    public int getProgreso() { return progreso; }
    public void setResponsable(String responsable) { this.responsable = responsable; }
    public String getResponsable() { return responsable; }
    public void setTerminado(boolean terminado) { this.terminado = terminado; }
    public boolean isTerminado() { return terminado; }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            progreso = Math.min(100, progreso + porcentaje);
            terminado = progreso == 100;
        }
    }
}