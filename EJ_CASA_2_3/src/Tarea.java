public class Tarea {
    private String titulo;
    private String responsable;
    private double horasEstimadas;
    private boolean completada;

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
    public void setResponsable(String responsable) { this.responsable = responsable; }
    public String getResponsable() { return responsable; }

    public void setHorasEstimadas(double horasEstimadas) {
        if (horasEstimadas >= 0) {
            this.horasEstimadas = horasEstimadas;
        }
    }

    public double getHorasEstimadas() { return horasEstimadas; }
    public void setCompletada(boolean completada) { this.completada = completada; }
    public boolean isCompletada() { return completada; }

    public void mostrarInformacion() {
        System.out.println("Tarea: " + titulo + " Responsable: " + responsable + " Horas: " + horasEstimadas + " Completada: " + completada);
    }

    public void completar() {
        completada = true;
    }
}