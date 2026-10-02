import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EjercicioDAO {

    public boolean insertarEjercicio(Ejercicio ej) {
        String sql = "INSERT INTO ejercicios (titulo, descripcion, nivel_dificultad) VALUES (?, ?, ?)";
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, ej.getTitulo());
            ps.setString(2, ej.getDescripcion());
            ps.setString(3, ej.getNivelDificultad());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }

    public List<Ejercicio> listarEjercicios() {
        List<Ejercicio> lista = new ArrayList<>();
        String sql = "SELECT * FROM ejercicio";
        try (Connection con = ConexionBD.obtenerConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Ejercicio ej = new Ejercicio();
                ej.setIdEjercicio(rs.getInt("id_ejercicio"));
                ej.setTitulo(rs.getString("titulo"));
                ej.setDescripcion(rs.getString("descripcion"));
                ej.setNivelDificultad(rs.getString("nivel_dificultad"));
                lista.add(ej);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
}