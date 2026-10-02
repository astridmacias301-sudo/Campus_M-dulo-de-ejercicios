

public class Ejercicio {
    private int idEjercicio;
    private String titulo;
    private String descripcion;
    private String nivelDificultad;

    // Constructor vacío
    public Ejercicio() {}

    // Constructor lleno
    public Ejercicio(int idEjercicio, String titulo, String descripcion, String nivelDificultad) {
        this.idEjercicio = idEjercicio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
    }

    // Getters y Setters
    public int getIdEjercicio() { return idEjercicio; }
    public void setIdEjercicio(int idEjercicio) { this.idEjercicio = idEjercicio; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getNivelDificultad() { return nivelDificultad; }
    public void setNivelDificultad(String nivelDificultad) { this.nivelDificultad = nivelDificultad; }
}