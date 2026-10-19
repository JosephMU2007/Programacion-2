public class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) this.username = username;
    }

    public String getUsername() { return username; }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) this.correo = correo;
    }

    public String getCorreo() { return correo; }

    public void setNivel(int nivel) {
        if (nivel >= 0) this.nivel = nivel;
    }

    public int getNivel() { return nivel; }
    public void setActivo(boolean activo) { this.activo = activo; }
    public boolean isActivo() { return activo; }
    public void activar() { activo = true; }
    public void desactivar() { activo = false; }
}