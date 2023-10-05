public class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        // Simulación de validación de inicio de sesión
        if (this.nombreUsuario != null && this.nombreUsuario.equals(nombreUsuario) &&
                this.contrasena != null && this.contrasena.equals(contrasena)) {
            return true;
        } else {
            return false;
        }
    }

    public void crearPerfil(String nombreUsuario, String contrasena) {
        // Simulación de creación de perfil
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
}