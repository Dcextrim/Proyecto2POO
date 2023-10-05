import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendario {
    private List<Actividad> actividades;

    public Calendario() {
        actividades = new ArrayList<>();
    }

    public void agregarActividad(String fecha, String hora, String descripcion) {
        Actividad actividad = new Actividad(fecha, hora, descripcion, false);
        actividades.add(actividad);
    }

    //Metodo para Agregar Actividades
    

    //Metodo para Mostrar Actividades Pendientes
    

    //Metodo para Marcar Actividades como Completadas
    

    //Metodo para Eliminar Actividades
    

    //Metodo Para Modificar Actividades
    public void modificarActividad(int indice, String nuevaFecha, String nuevaHora, String nuevaDescripcion) {
        if (indice >= 0 && indice < actividades.size()) {
            Actividad actividad = actividades.get(indice);
            actividad.setFecha(nuevaFecha);
            actividad.setHora(nuevaHora);
            actividad.setDescripcion(nuevaDescripcion);
            System.out.println("Actividad modificada correctamente.");
        } else {
            System.out.println("Índice de actividad inválido.");
        }
    }

    //Metodo Para Ejecutar el Menu de Actividades
    public void ejecutarMenu() {

        Calendario calendario = new Calendario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar actividad");
            System.out.println("2. Mostrar actividades");
            System.out.println("3. Eliminar actividad");
            System.out.println("4. Modificar actividad");
            System.out.println("5. Mostrar Actividades Pendientes");
            System.out.println("6. Marcar Actividades Completadas");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                break;
            }
            switch (opcion) {
                case 1://Opcion para Ingresar Actividad
                    System.out.print("Ingrese la fecha (dd/mm/yyyy): ");
                    String fecha = scanner.next();
                    System.out.print("Ingrese la hora (hh:mm): ");
                    String hora = scanner.next();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la descripción: ");
                    String descripcion = scanner.nextLine();
                    calendario.agregarActividad(fecha, hora, descripcion);
                    break;
                case 2://Opcion para Mostrar Actividades
                    calendario.mostrarActividades();
                    break;
                case 3://Opcion para Eliminar Actividad
                    System.out.print("Ingrese el número de actividad a eliminar: ");
                    int indiceEliminar = scanner.nextInt() - 1; // Restar 1 para coincidir con el índice de la lista
                    calendario.eliminarActividad(indiceEliminar);
                    break;
                case 4://Opcion para Modificar Actividad
                    System.out.print("Ingrese el número de actividad a modificar: ");
                    int indiceModificar = scanner.nextInt() - 1; // Restar 1 para coincidir con el índice de la lista
                    System.out.print("Ingrese la nueva fecha (dd/mm/yyyy): ");
                    String nuevaFecha = scanner.next();
                    System.out.print("Ingrese la nueva hora (hh:mm): ");
                    String nuevaHora = scanner.next();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la nueva descripción: ");
                    String nuevaDescripcion = scanner.nextLine();
                    calendario.modificarActividad(indiceModificar, nuevaFecha, nuevaHora, nuevaDescripcion);
                    break;
                case 5 ://Opción para mostrar actividades pendientes
                calendario.mostrarActividadesPendientes();
                break;
                case 6://Opción para marcar actividad como completada
                System.out.print("Ingrese el número de actividad a marcar como completada: ");
                int indiceCompletada = scanner.nextInt() - 1;
                calendario.marcarActividadComoCompletada(indiceCompletada);
                break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
