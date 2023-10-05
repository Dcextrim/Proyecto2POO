class Actividad {
    private String fecha;
    private String hora;
    private String descripcion;
    private boolean completada;

    public Actividad(String fecha, String hora, String descripcion, boolean completada) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.completada=false;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        completada = true;
    }


    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Hora: " + hora + ", Descripción: " + descripcion + ", Completada: " + completada;
    }
}
