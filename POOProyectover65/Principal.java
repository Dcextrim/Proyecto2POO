import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Calendario calendario = new Calendario();

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Crear Perfil");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1://Opcion para Iniciar Sesion
                    System.out.print("Ingrese su nombre de usuario: ");
                    String nombreUsuario = scanner.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contrasena = scanner.next();
                    boolean sesionIniciada = usuario.iniciarSesion(nombreUsuario, contrasena);
                    if (sesionIniciada) {
                        System.out.println("Sesión iniciada con éxito.");
                        calendario.ejecutarMenu();

                    } else {
                        System.out.println("Nombre de usuario o contraseña incorrectos.");
                    }

                    break;
                case 2://Opcion para Crear un Usuario
                    System.out.print("Ingrese su nombre de usuario: ");
                    nombreUsuario = scanner.next();
                    System.out.print("Ingrese su contraseña: ");
                    contrasena = scanner.next();
                    usuario.crearPerfil(nombreUsuario, contrasena);
                    System.out.println("Perfil creado con éxito.");
                    break;
                case 3://Opcion para Cerrar Sesion
                    System.out.println("Cerrando Sesión. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}