import java.util.List;

public class Main {
    public static void main(String[] args) {
        EjercicioDAO dao = new EjercicioDAO();

        // Probar Consultar
        System.out.println("--- LISTA DE EJERCICIOS ---");
        List<Ejercicio> lista = dao.listarEjercicios();
        for (Ejercicio ej : lista) {
            System.out.println(ej.getIdEjercicio() + " - " + ej.getTitulo() + " (" + ej.getNivelDificultad() + ")");
        }
    }
}